grammar ATalkPass2;

import HandleExprsTypesFuncs, GettingSymbolTableItemsFuncs, ArrayFuncs, RecieversFuncs, PrintLogsPass2, ScopesPass2,
MipsFunctions;

@header{
      import java.util.ArrayList;
}

@members{
    boolean initArr = false;
    boolean idsee=false;
    int errorOccured = 0;
    int ifCounter = 0;
    int foreachCounter = 0, forCnt=0;
    String codeData = "";
    Translator mips = new Translator();
    ArrayList <SymbolTableItemActor> actorsList = new ArrayList <SymbolTableItemActor>();
}

program: {
        print("------------------------- Pass2 started -------------------------"+"\n");
        beginScope();
    }
    (actor | NL)* {
        endScope();
        print("------------------------- Pass2 finished -------------------------"+"\n");
        if(errorOccured == 0)
          print(codeData);
        //mips.makeScheduler(actorsList);
        mips.makeOutput();
    }
  ;

actor:
    'actor' actrName = ID '<' CONST_NUM '>' NL
    {
      beginScope();
      try{
        actorsList.add(getActorFromSymTable($actrName.text, $actrName.line));
      }catch(ActorDoesntExistsException e) {}
    }
      (state | receiver[$actrName.text] | NL)*
    'end' {endScope();} (NL | EOF)
  ;

state:
    type var_id = ID {
        globalVarInitialization($var_id.text, $var_id.line);
      } (',' var_id = ID {
        globalVarInitialization($var_id.text, $var_id.line);
      })* NL
  ;

receiver[String actrName]:
    'receiver' currentReceiver = ID {
        int argCnt = 0;
        ArrayList <Type> argumentTypes = new ArrayList <Type>();
      } '(' (tp = type ID {
        localVarInitialization($tp.t);
        argumentTypes.add($tp.t);
        argCnt++;
      }
    (',' tp = type ID {
      localVarInitialization($tp.t);
      argumentTypes.add($tp.t);
      argCnt++;
    })*)? ')' NL
    {
      beginScope();
      String key = makeKey(actrName, $currentReceiver.text, argumentTypes);
      /* mips.jumpToLable("after_" + key); */
      mips.addLable(key);
    }
      statements[$currentReceiver.text, actrName, argCnt]
    'end' {
        endScope();
        /* mips.jumpToLable("end_" + key); */
        mips.addLable("after_" + key);
      } NL
  ;


type returns [Type t]:
  {ArrayList<Integer> dims = new ArrayList<Integer>();}
  (('int') {$t = new IntType();} | ('char') {$t = new CharacterType();})
  ('[' size = CONST_NUM ']'{dims.add(checkDimLenValidationInArray($size.int, $size.line));})*
  {
    for(int i=dims.size()-1; i >= 0; i--)
      $t = new ArrayType(dims.get(i),$t);
  }
  ;

block[String currentReceiver, String currentActor, int argCnt]:
    'begin' {beginScope();} NL
      statements[currentReceiver, currentActor, argCnt]
    'end' {endScope();} NL
  ;

statements[String currentReceiver, String currentActor, int argCnt]:
    (statement[currentReceiver, currentActor, argCnt] | NL)*
  ;

statement[String currentReceiver, String currentActor , int argCnt]:
    stm_vardef
  |  stm_assignment
  |  stm_foreach[currentReceiver, currentActor, argCnt]
  |  stm_if_elseif_else[currentReceiver, currentActor, argCnt]
  |  stm_quit
  |  stm_break
  |  stm_tell[currentReceiver, currentActor, argCnt]
  |  stm_write
  |  block[currentReceiver, currentActor, argCnt]
  ;

stm_vardef:
    t = type ln = ID { localVarInitialization($t.t);}('=' {
        SymbolTableItem item = SymbolTable.top.get($ln.text);
        SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
        if(var.getVariable().getType() instanceof ArrayType)
          mips.addAddressToStack($ln.text, var.getOffset()*-1);
        } tp = expr{
        if(!$t.t.equals($tp.t))
          printErrors($ln.line, "Invalid assignment by types <" + $t.t.toString() + "> and <" + $tp.t.toString() + ">.");
        else{
          if(!initArr){
            addIDtoStack($ln.text, false);
            mips.assignCommand(true);
            if(! (var.getVariable().getType() instanceof ArrayType))
              mips.popStack();
          }
          else
            mips.initArrElem($t.t.size()/4);

          initArr = false;
        }
      }
      )? (',' ID { localVarInitialization($tp.t); } ('=' tp = expr{
          if(!$t.t.equals($tp.t))
            printErrors($ln.line, "Invalid assignment by types <" + $t.t.toString() + "> and <" + $tp.t.toString() + ">.");
          else
             mips.addToStack(Integer.parseInt($tp.text));
          })?)* NL
  ;

stm_tell[String currentReceiver, String currentActor, int argCnt]:
    {ArrayList<Type> argumentsTypes = new ArrayList<Type>();}
    rcvrActor = (ID | 'sender' | 'self') '<<' rcvrName = ID '(' (tp = expr {argumentsTypes.add($tp.t);}
                                                            (',' tp = expr {argumentsTypes.add($tp.t);})*)? ')' NL
      {checkCallValidation(currentActor, currentReceiver, $rcvrActor.text, $rcvrName.text, argumentsTypes, $rcvrName.line, argCnt);}
  ;

stm_write:
    ln = 'write' '(' tp = expr ')' NL
      {checkWriteFuncArgument($tp.t, $ln.line); mips.write($tp.t); if((idsee)&& !($tp.t instanceof ArrayType)){mips.popStack();print($ln.line+"");}//
    idsee=false;}
  ;

stm_if_elseif_else[String currentReceiver, String currentActor, int argCnt]:
    ln = 'if' {
        int elseIfCounter = 0;
        int cnt = ifCounter++;
        beginScope();
      }
      tp = expr {
        checkConditionExprType($tp.t, $ln.line);
        mips.generateConditionCode("end_" + $ln.text + "_" + cnt);
      }
     NL statements[currentReceiver, currentActor, argCnt] {
       mips.jumpToLable("end_if_block_" + cnt);
       endScope();
       mips.addLable("end_" + $ln.text + "_" + cnt);
     }

    (ln = 'elseif' {
        elseIfCounter++;
        beginScope();
      } tp = expr {
        checkConditionExprType($tp.t, $ln.line);
        mips.generateConditionCode("end_" + $ln.text + "_" + cnt + "_" + elseIfCounter);
      }
    NL statements[currentReceiver, currentActor, argCnt] {
        mips.jumpToLable("end_if_block_" + cnt);
        endScope();
        mips.addLable("end_" + $ln.text + "_" + cnt + "_" + elseIfCounter);
      })*

    (ln = 'else' {
        beginScope();
      } NL statements[currentReceiver, currentActor, argCnt] {
          endScope();
        })?
    'end' {mips.addLable("end_if_block_" + cnt);} NL
  ;

stm_foreach[String currentReceiver, String currentActor, int argCnt]:
    'foreach' {beginScope(); forCnt = foreachCounter++;} id = ID {} 'in' tp = expr NL
              {checkIterationExpr($id.text, $id.line, $tp.t);}
              {
                mips.initForeachVarToStack($tp.t.size()/4);
                mips.reInitForeachVar($tp.t.size()/4);
                mips.addLable("foreach_" + forCnt);
              }
      statements[currentReceiver, currentActor, argCnt]
      {
        mips.foreachIteration(forCnt);
      }
    'end' {endScope(); mips.addLable("end_foreach_" + forCnt); mips.endofForeach(); forCnt--;} NL
  ;

stm_quit:
    'quit' NL
  ;

stm_break:
    'break' {mips.jumpToLable("end_foreach_" + forCnt); mips.endofForeach();} NL
  ;

stm_assignment:
    expr NL
  ;

expr returns [Type t, boolean rvalue, int ln_]:
    tp = expr_assign {$t = $tp.t; $rvalue = $tp.rvalue;}
  ;

expr_assign returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_or[false] ln = '=' tp2 = expr_assign
      {$ln_ = findLine($tp1.ln_, $tp2.ln_);
        if($tp1.rvalue)
          printErrors($ln.line, "Invalid Assignment to an rvalue.");
        else{
            $t = assignAssignmentExprType($tp1.t, $tp2.t, $ln_);
            if(!initArr)
              mips.assignCommand(false);
            else
              mips.initArrElem($tp2.t.size()/4);
            initArr = false;
            idsee=false;
          }
        }
  |  tp = expr_or[true] {$t = $tp.t; $rvalue = $tp.rvalue;}
  ;

expr_or[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_and[is_rvalue] tp2 = expr_or_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_or_tmp returns [Type t, boolean rvalue, int ln_]:
    ln = 'or' tp1 = expr_and[true] tp2 = expr_or_tmp
      {$t = assignExprType_tmp($tp1.t, "Invalid operands for <or> operatorby types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln.line);
      $rvalue = true;
      $ln_ = $ln.line;
      mips.operationCommand($ln.text);
    }
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_and[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_eq[is_rvalue] tp2 = expr_and_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_and_tmp returns [Type t, boolean rvalue, int ln_]:
    ln = 'and' tp1 = expr_eq[true] tp2 = expr_and_tmp
      {$t = assignExprType_tmp($tp1.t, "Invalid operands for <and> operator by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln.line);
      $rvalue = true;
      $ln_ = $ln.line;
      mips.operationCommand($ln.text);
    }
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_eq[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_cmp[is_rvalue] tp2 = expr_eq_tmp
      {$ln_ = findLine($tp1.ln_, $tp2.ln_);
        $t = checkEqualityExprType($tp1.t, $tp2.t, $ln_);
        $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;


expr_eq_tmp returns [Type t, boolean rvalue, int ln_]:
    ln = ('==' | '<>') tp1 = expr_cmp[true] tp2 = expr_eq_tmp
      {
        $t = checkEqualityExprType_tmp($tp1.t, $tp2.t, $ln.line);
        $rvalue = true;
        $ln_ = $ln.line;
        mips.compareOperationCommand($ln.text);
      }
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_cmp[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_add[is_rvalue] tp2 = expr_cmp_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_cmp_tmp returns [Type t, boolean rvalue, int ln_]:
    cmp = ('<' | '>') tp = expr_add[true]
      {
        $t = assignExprType_tmp($tp.t, "Invalid operands for comparision operators.", $cmp.line);
        $rvalue = true;
        $ln_ = $cmp.line;
        mips.compareOperationCommand($cmp.text);
      }
    expr_cmp_tmp
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_add[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_mult[is_rvalue] tp2 = expr_add_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_add_tmp returns [Type t, boolean rvalue, int ln_]:
    add = ('+' | '-') tp = expr_mult[true]
      {
        $t = assignExprType_tmp($tp.t, "Invalid operands for +/- operators.", $add.line);
        $rvalue = true;
        $ln_ = $add.line;
        mips.operationCommand($add.text);
      }
    expr_add_tmp
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_mult[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_un[is_rvalue] tp2 = expr_mult_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
     $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
     $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_mult_tmp returns [Type t, boolean rvalue, int ln_]:
    mult = ('*' | '/') tp = expr_un[true]
      {
        $t = assignExprType_tmp($tp.t, "Invalid operands for multiplication operands.", $mult.line);
        $rvalue = true;
        $ln_ = $mult.line;
        mips.operationCommand($mult.text);
      }
    expr_mult_tmp
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_un[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
    ln = ('not' | '-') tp = expr_un[true]
      {
        $t = assignExprType_tmp($tp.t,  "Invalid arithmatic operands.", $ln.line);
        $rvalue = true;
        $ln_ = $ln.line;
        mips.unaryOperationCommand($ln.text);
      }
  |  tp1 = expr_mem[is_rvalue] {$t = $tp1.t; $rvalue = $tp1.rvalue; $ln_ = $tp1.ln_;}
  ;

  expr_mem[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_]:
      tp = expr_other[is_rvalue] dim = expr_mem_tmp {
        $ln_ = findLine($tp.ln_, $dim.ln_);
        try{
          $t = $tp.t.dimensionAccess($dim.dimension);
          int elementsNum = $t.size()/4;
          if($dim.dimension == 0)
            $rvalue = $tp.rvalue;
          else{
            $rvalue = false;
          }
          if($tp.arrType){
            mips.arrayElementOffset($tp.t, $dim.dimension);
            mips.operationCommand("-");
            if($is_rvalue)
              mips.getElement($t);
          }
        }catch(UndefinedDemensionsException ex){
          printErrors($ln_, "Undefined demensions.");
          $t = new NoType();
          $rvalue = false;
        }
      }
    ;
  expr_mem_tmp returns [int dimension, int ln_]:
      ln = '[' tp = expr {
         $ln_ = $ln.line;
        if(!$tp.t.equals(new IntType()))
          printErrors($ln.line, "Invalid index.");
        idsee=true;
        } ']' d = expr_mem_tmp {$dimension = $d.dimension + 1;}
    | {$dimension = 0;  $ln_ = -1;}
    ;

  expr_other[boolean is_rvalue] returns [Type t, boolean rvalue, int ln_, boolean arrType]:
       ln = CONST_NUM {$arrType = false; $t = new IntType(); $rvalue = true; $ln_ = $ln.line; mips.addToStack(Integer.parseInt($ln.text));}
    |  ln = CONST_CHAR {$arrType = false; $t = new CharacterType(); $rvalue = true; $ln_ = $ln.line; mips.addToStack((int) $ln.text.charAt(1));}
    |  str = CONST_STR {
                  $arrType = false; $rvalue = true; $ln_ = $str.line;
                  $t = new ArrayType($str.text.length()-2, new CharacterType());
                  for(int i = 1 ; i <$str.text.length()-1 ; i++)
                    mips.addToStack((int) $str.text.charAt(i));
                }
    |  id = ID {  $t = getIDFromSymTable($id.text, $id.line);
                  addIDtoStack($id.text, $is_rvalue);
                  if($t instanceof ArrayType)
                    $arrType = true;
                  $rvalue = $t.isRvalue();
                  $ln_ = $id.line;
               }
    |  ln = '{' tp1 = expr {int size = 1;} (',' tp2 = expr
            {size = checkAndFindNumOfItemsInExplitArray($tp1.t, $tp2.t, size);})*
            {initArr = true; $arrType = false; $t = assignExplitArrayType(size, $tp1.t, $ln.line); $rvalue = true; $ln_ = $ln.line;}
       '}'
    |  'read' '(' size = CONST_NUM ')' {initArr = true; $arrType = false; $t = new ArrayType($size.int, new CharacterType()); mips.readFunc($size.int); $rvalue = true; $ln_ = $size.line;}
    |  ln = '(' tp = expr ')' {$arrType = false; $t = $tp.t; $rvalue = $tp.rvalue; $ln_ = $ln.line;}
    ;

CONST_NUM:
    ('-')?[0-9]+
  ;

CONST_CHAR:
    '\'' . '\''
  ;

CONST_STR:
    '"' ~('\r' | '\n' | '"')* '"'
  ;

NL:
    '\r'? '\n' { setText("new_line"); }
  ;

ID:
    [a-zA-Z_][a-zA-Z0-9_]*
  ;

COMMENT:
    '#'(~[\r\n])* -> skip
  ;

WS:
      [ \t] -> skip
    ;
