grammar ATalkPass2;

import HandleExprsTypesFuncs, GettingSymbolTableItemsFuncs, ArrayFuncs, RecieversFuncs, PrintLogsPass2, ScopesPass2;

@header{
      import java.util.ArrayList;
}

@members{
    int errorOccured = 0;
    String codeData = "";
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
    }
  ;

actor:
    'actor' actrName = ID '<' CONST_NUM '>' NL
    {beginScope();}
      (state | receiver[$actrName.text] | NL)*
    'end' {endScope();} (NL | EOF)
  ;

state:
    type ID (',' ID)* NL
  ;

receiver[String actrName]:
    'receiver' currentReceiver = ID {int argCnt = 0;} '(' (type ID { SymbolTable.define(); argCnt++;}
    (',' type ID { SymbolTable.define(); })*)? ')' NL
    {beginScope();}
      statements[$currentReceiver.text, actrName, argCnt]
    'end' {endScope();} NL
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
    t = type ln = ID { SymbolTable.define(); }('=' tp = expr{
        if(!$t.t.equals($tp.t))
          printErrors($ln.line, "Invalid assignment by types <" + $t.t.toString() + "> and <" + $tp.t.toString() + ">.");
        }
      )? (',' ID { SymbolTable.define(); } ('=' tp = expr{
          if(!$t.t.equals($tp.t))
            printErrors($ln.line, "Invalid assignment by types <" + $t.t.toString() + "> and <" + $tp.t.toString() + ">.");
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
      {checkWriteFuncArgument($tp.t, $ln.line);}
  ;

stm_if_elseif_else[String currentReceiver, String currentActor, int argCnt]:
    ln = 'if' {beginScope();} tp = expr
      {checkConditionExprType($tp.t, $ln.line);}
     NL statements[currentReceiver, currentActor, argCnt] {endScope();}

    (ln = 'elseif' {beginScope();} tp = expr
      {checkConditionExprType($tp.t, $ln.line);}
    NL statements[currentReceiver, currentActor, argCnt] {endScope();})*

    ('else' {beginScope();} NL statements[currentReceiver, currentActor, argCnt] {endScope();})?
    'end' NL
  ;

stm_foreach[String currentReceiver, String currentActor, int argCnt]:
    'foreach' {beginScope();} id = ID 'in' tp = expr NL
              {checkIterationExpr($id.text, $id.line, $tp.t);}
      statements[currentReceiver, currentActor, argCnt]
    'end' {endScope();} NL
  ;

stm_quit:
    'quit' NL
  ;

stm_break:
    'break' NL
  ;

stm_assignment:
    expr NL
  ;

expr returns [Type t, boolean rvalue, int ln_]:
    tp = expr_assign {$t = $tp.t; $rvalue = $tp.rvalue;}
  ;

expr_assign returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_or ln = '=' tp2 = expr_assign
      {$ln_ = findLine($tp1.ln_, $tp2.ln_);
        if($tp1.rvalue)
          printErrors($ln.line, "Invalid Assignment to an rvalue.");
        else
          $t = assignAssignmentExprType($tp1.t, $tp2.t, $ln_);}
  |  tp = expr_or {$t = $tp.t; $rvalue = $tp.rvalue;}
  ;

expr_or returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_and tp2 = expr_or_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_or_tmp returns [Type t, boolean rvalue, int ln_]:
    ln = 'or' tp1 = expr_and tp2 = expr_or_tmp
      {$t = assignExprType_tmp($tp1.t, "Invalid operands for <or> operatorby types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln.line); $rvalue = true; $ln_ = $ln.line;}
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_and returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_eq tp2 = expr_and_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_and_tmp returns [Type t, boolean rvalue, int ln_]:
    ln = 'and' tp1 = expr_eq tp2 = expr_and_tmp
      {$t = assignExprType_tmp($tp1.t, "Invalid operands for <and> operator by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln.line); $rvalue = true; $ln_ = $ln.line;}
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_eq returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_cmp tp2 = expr_eq_tmp
      {$ln_ = findLine($tp1.ln_, $tp2.ln_);
        $t = checkEqualityExprType($tp1.t, $tp2.t, $ln_);
        $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;


expr_eq_tmp returns [Type t, boolean rvalue, int ln_]:
    ln = ('==' | '<>') tp1 = expr_cmp tp2 = expr_eq_tmp
      {$t = checkEqualityExprType_tmp($tp1.t, $tp2.t, $ln.line); $rvalue = true; $ln_ = $ln.line;}
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_cmp returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_add tp2 = expr_cmp_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_cmp_tmp returns [Type t, boolean rvalue, int ln_]:
    (cmp = '<' | cmp = '>') tp = expr_add
      {$t = assignExprType_tmp($tp.t, "Invalid operands for comparision operators.", $cmp.line); $rvalue = true; $ln_ = $cmp.line;}
    expr_cmp_tmp
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_add returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_mult tp2 = expr_add_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
      $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
      $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_add_tmp returns [Type t, boolean rvalue, int ln_]:
    add = ('+' | '-') tp = expr_mult
      {$t = assignExprType_tmp($tp.t, "Invalid operands for +/- operators.", $add.line); $rvalue = true; $ln_ = $add.line;}
    expr_add_tmp
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_mult returns [Type t, boolean rvalue, int ln_]:
    tp1 = expr_un tp2 = expr_mult_tmp
    {$ln_ = findLine($tp1.ln_, $tp2.ln_);
     $t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands by types <" + $tp1.t.toString() + "> and <" + $tp2.t.toString() + ">.", $ln_);
     $rvalue = $tp1.rvalue || $tp2.rvalue;}
  ;

expr_mult_tmp returns [Type t, boolean rvalue, int ln_]:
    mult = ('*' | '/') tp = expr_un
      {$t = assignExprType_tmp($tp.t, "Invalid operands for multiplication operands.", $mult.line); $rvalue = true;  $ln_ = $mult.line;}
    expr_mult_tmp
  | {$t = new NoType(); $rvalue = false; $ln_ = -1;}
  ;

expr_un returns [Type t, boolean rvalue, int ln_]:
    ln = ('not' | '-') tp = expr_un
      {$t = assignExprType_tmp($tp.t,  "Invalid arithmatic operands.", $ln.line); $rvalue = true; $ln_ = $ln.line;}
  |  tp1 = expr_mem {$t = $tp1.t; $rvalue = $tp1.rvalue; $ln_ = $tp1.ln_;}
  ;

expr_mem returns [Type t, boolean rvalue, int ln_]:
    tp = expr_other dim = expr_mem_tmp {
      $ln_ = findLine($tp.ln_, $dim.ln_);
      try{
        $t = $tp.t.dimensionAccess($dim.dimension);
        if($dim.dimension == 0)
          $rvalue = $tp.rvalue;
        else
          $rvalue = false;
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
      } ']' d = expr_mem_tmp {$dimension = $d.dimension + 1;}
  | {$dimension = 0;  $ln_ = -1;}
  ;

expr_other returns [Type t, boolean rvalue, int ln_]:
     ln = CONST_NUM {$t = new IntType(); $rvalue = true; $ln_ = $ln.line;}
  |  ln = CONST_CHAR {$t = new CharacterType(); $rvalue = true; $ln_ = $ln.line;}
  |  str = CONST_STR {$t = new ArrayType($str.text.length()-2, new CharacterType()); $rvalue = true; $ln_ = $str.line;}
  |  id = ID {$t = getIDFromSymTable($id.text, $id.line); $ln_ = $id.line;}
  |  ln = '{' tp1 = expr {int size = 1;} (',' tp2 = expr
          {size = checkAndFindNumOfItemsInExplitArray($tp1.t, $tp2.t, size);})*
          {$t = assignExplitArrayType(size, $tp1.t, $ln.line); $rvalue = false; $ln_ = $ln.line;}
     '}'
  |  'read' '(' size = CONST_NUM ')' {$t = new ArrayType($size.int, new CharacterType()); $rvalue = true; $ln_ = $size.line;}
  |  ln = '(' tp = expr ')' {$t = $tp.t; $rvalue = $tp.rvalue; $ln_ = $ln.line;}
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
