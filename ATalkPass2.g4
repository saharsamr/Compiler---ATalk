grammar ATalkPass2;

@header{
      import java.util.ArrayList;
}

@members{
    void print(String str){
        System.out.println(str);
    }

    void beginScope() {
        SymbolTable.push();
    }

    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }

    Type printErrAndAssignNoType(String msg){
      print(msg);
      return new NoType();
    }

    Type checkArithOperandValidation(Type tp)throws ArithmaticsOperandsException{
      if(!tp.equals(new IntType()))
        throw new ArithmaticsOperandsException();
      else
        return tp;
    }

    Type assignExprType_tmp (Type tp, String msg) {
      try {
        return checkArithOperandValidation(tp);
      } catch(ArithmaticsOperandsException ex) {
        return printErrAndAssignNoType(msg);
      }
    }

    Type checkCombinedArithExprTypes(Type tp1,Type tp2)throws ArithmaticsOperandsException{
      if((!tp1.equals(new IntType())) && (!tp2.equals(new NoType())))
       throw new ArithmaticsOperandsException();
     else
       return tp1;
   }

    Type assignExprType(Type tp1, Type tp2, String msg) {
      try {
        return checkCombinedArithExprTypes(tp1, tp2);
      } catch(ArithmaticsOperandsException ex) {
        return printErrAndAssignNoType(msg);
      }
    }

    Type getIDFromSymTable(String idName, int line) {
      SymbolTableItem item = SymbolTable.top.get(idName);
      if(item == null)
        return printErrAndAssignNoType(line + ") Item " + idName + " doesnt exist.");
      else {
        SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
        print(line + ") Variable " + idName +" used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
        return var.getVariable().getType();
      }
    }

    SymbolTableItemReceiver getRecieverFromSymTable(String name, int line) throws ReceiverDoseNotExistsException{
      SymbolTableItem item = SymbolTable.top.get(name);
      if(item == null)
        throw new ReceiverDoseNotExistsException();
      SymbolTableItemReceiver var = (SymbolTableItemReceiver) item;
      /* print(line + ") Reciever " + name + " used.\t\t"); */
      return var;
    }

    SymbolTableItemActor getActorFromSymTable(String name, int line)throws ActorDoesntExistsException{
      SymbolTableItem item = SymbolTable.top.get(name);
      if(item == null)
        throw new ActorDoesntExistsException();
      SymbolTableItemActor var = (SymbolTableItemActor) item;
      /* print(line + ") Reciever " + name + " used.\t\t"); */
      return var;
    }

    int checkAndFindNumOfItemsInExplitArray(Type tp1,Type tp2, int size) {
      if(!tp2.equals(tp1))
        size = -1;
      else if(size != -1)
        size ++;
      return size;
    }

    Type assignExplitArrayType(int size, Type tp) {
      if(size != -1)
        return new ArrayType(size, tp);
      else
        return printErrAndAssignNoType("Invalid combination for a array type.");
    }

    Type checkEqualityExprType_tmp(Type tp1, Type tp2) {
      if(tp1.equals(tp2) || tp2.equals(new NoType()))
        return tp1;
      else
        return printErrAndAssignNoType("Incompatible types for checking equality.");
    }

    Type checkEqualityExprType(Type tp1, Type tp2) {
      if(tp1.equals(tp2))
        return new IntType();
      else if(tp2.equals(new NoType()))//NOTE: notype & notype is not handled?
        return tp1;
      else
        return printErrAndAssignNoType("Incompatible types for checking equality.");
    }

    Type assignAssignmentExprType(Type tp1, Type tp2) {
      if(tp1.equals(tp2))
        return tp1;
      else
        return printErrAndAssignNoType("Invalid assignment.");
    }

    void checkIterationExpr(String id, int line, Type tp){
      try{
      Type t = getIDFromSymTable(id, line);
      tp = tp.dimensionAccess(1);
      if(!t.equals(new NoType()))
        printErrAndAssignNoType("variable <" + id + "> already declared in this scope.");
      }catch(UndefinedDemensionsException ex){
        printErrAndAssignNoType("Undefined demensions.");
      }
    }

    void checkWriteFuncArgument(Type tp){
      try{
        if(!(tp.equals(new IntType()) || tp.equals(new CharacterType())))
          if(!tp.dimensionAccess(1).equals(new CharacterType()))
            printErrAndAssignNoType("Invalid argument for function <write>.");
      }catch(UndefinedDemensionsException ex){
        printErrAndAssignNoType("Invalid argument for function <write>.");
      }
    }

    String makeKey(String actr, String rcvr, ArrayList<Type> argumentTypes){
      String key = actr + ": " + rcvr + " (";
  		for (int i = 0; i < argumentTypes.size(); i++){
  			key += argumentTypes.get(i).toString();
  			if (i != argumentTypes.size() - 1)
  				key += ", ";
  		}
  		return key + ")";
    }

    String makeRecieverkey(String currentActor, String senderName, String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes){
      if(rcvrActor.equals("self"))
        return makeKey(currentActor, rcvrName, argumentTypes);
      else if(rcvrActor.equals("sender"))
        return makeKey(senderName, rcvrName, argumentTypes);
      else
        return makeKey(rcvrActor, rcvrName, argumentTypes);
    }

    SymbolTableItemReceiver checkRecieverExistance(String currentActor, String senderName, String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes, int line)
    throws ReceiverDoseNotExistsException{
      String key = makeRecieverkey(currentActor, senderName, rcvrActor, rcvrName, argumentTypes);
      return getRecieverFromSymTable(key, line);
    }

    void checkInitAndSender(String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes) throws SenderInInitException{
      if(rcvrActor.equals("sender"))
        if(argumentTypes.size() == 0 && rcvrName.equals("init"))
          throw new SenderInInitException();
    }

    void checkCallValidation(String currentActor, String senderName, String rcvrActor, String rcvrName, ArrayList<Type> argumentsTypes, int line){
      try{
        checkInitAndSender(rcvrActor, rcvrName, argumentsTypes);
        if(!rcvrActor.equals("sender") && !rcvrActor.equals("self"))
          getActorFromSymTable(rcvrActor, line);
        checkRecieverExistance(currentActor, senderName, rcvrActor, rcvrName, argumentsTypes, line);
      }catch(ReceiverDoseNotExistsException ex){
          printErrAndAssignNoType("Reciever: " + rcvrName + " does not exist.");
      }catch(ActorDoesntExistsException ex){
          printErrAndAssignNoType("Actor: " + rcvrActor + " does not exist.");
      }catch(SenderInInitException ex){
          printErrAndAssignNoType("Invalid use of keyword <sender>.");
      }
    }
}


program: {
        print("Pass2 started -------------------------");
        beginScope();
    }
    (actor | NL)* {
        endScope();
        print("Pass2 finished -------------------------");
    }
  ;

actor:
    'actor' actrName = ID '<' CONST_NUM '>' NL
    {beginScope();}
      (state | receiver[$actrName.text] | NL)*
    'end' {endScope();} (NL | EOF)
  ;

state:
    /* type ID { SymbolTable.define(); } (',' ID { SymbolTable.define(); })* NL */
    type ID (',' ID)* NL
  ;

receiver[String actrName]:
    'receiver' senderName = ID { SymbolTable.define(); } '(' (type ID { SymbolTable.define(); }
    (',' type ID { SymbolTable.define(); })*)? ')' NL
    {beginScope();}
      statements[$senderName.text, actrName]
    'end' {endScope();} NL
  ;

type: //TODO:{ $return_type = IntType.getInstance(); }
    'char' ('[' CONST_NUM ']')*
  |  'int' ('[' CONST_NUM ']')*
  ;

block[String senderName, String currentActor]:
    'begin' {beginScope();} NL
      statements[senderName, currentActor]
    'end' {endScope();} NL
  ;

statements[String senderName, String currentActor]:
    (statement[senderName, currentActor] | NL)*
  ;

statement[String senderName, String currentActor]:
    stm_vardef
  |  stm_assignment
  |  stm_foreach[senderName, currentActor]
  |  stm_if_elseif_else[senderName, currentActor]
  |  stm_quit
  |  stm_break
  |  stm_tell[senderName, currentActor]
  |  stm_write
  |  block[senderName, currentActor]
  ;

stm_vardef:
    type ID { SymbolTable.define(); }('=' expr)? (',' ID { SymbolTable.define(); } ('=' expr)?)* NL
  ;

stm_tell[String senderName, String currentActor]:
    {ArrayList<Type> argumentsTypes = new ArrayList<Type>();}
    rcvrActor = (ID | 'sender' | 'self') '<<' rcvrName = ID '(' (tp = expr {argumentsTypes.add($tp.t);}
                                                            (',' tp = expr {argumentsTypes.add($tp.t);})*)? ')' NL
      {checkCallValidation(currentActor, senderName, $rcvrActor.text, $rcvrName.text, argumentsTypes, $rcvrName.line);}
  ;

stm_write:
    'write' '(' tp = expr ')' NL
      {checkWriteFuncArgument($tp.t);}
  ;

stm_if_elseif_else[String senderName, String currentActor]:
    'if' {beginScope();} tp = expr
      {if(!$tp.t.equals(new IntType()))
          printErrAndAssignNoType("Invalid use of expression as a condition.");
      }
     NL statements[senderName, currentActor] {endScope();}
    ('elseif' {beginScope();} tp = expr
      {if(!$tp.t.equals(new IntType()))
          printErrAndAssignNoType("Invalid use of expression as a condition.");
      }
    NL statements[senderName, currentActor] {endScope();})*
    ('else' {beginScope();} NL statements[senderName, currentActor] {endScope();})?
    'end' NL
  ;

stm_foreach[String senderName, String currentActor]:
    'foreach' {beginScope();} id = ID 'in' tp = expr NL
              {checkIterationExpr($id.text, $id.line, $tp.t);}
      statements[senderName, currentActor]
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

expr returns [Type t, boolean rvalue]:
    tp = expr_assign {$t = $tp.t; $rvalue = $tp.rvalue;}
  ;

expr_assign returns [Type t, boolean rvalue]:
    tp1 = expr_or '=' tp2 = expr_assign
      {$t = assignAssignmentExprType($tp1.t, $tp2.t);}
  |  tp = expr_or {$t = $tp.t; $rvalue = $tp.rvalue;}
  ;

expr_or returns [Type t, boolean rvalue]:
    tp1 = expr_and tp2 = expr_or_tmp
    {$t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands");
      $rvalue = $tp1.rvalue && $tp2.rvalue;}
  ;

expr_or_tmp returns [Type t, boolean rvalue]:
    'or' tp1 = expr_and tp2 = expr_or_tmp
      {$t = assignExprType_tmp($tp1.t, "Invalid operands for <or> operator."); $rvalue = false;}
  | {$t = new NoType(); $rvalue = true;}
  ;

expr_and returns [Type t, boolean rvalue]:
    tp1 = expr_eq tp2 = expr_and_tmp
    {$t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands");
      $rvalue = $tp1.rvalue && $tp2.rvalue;}
  ;

expr_and_tmp returns [Type t, boolean rvalue]:
    'and' tp1 = expr_eq tp2 = expr_and_tmp
      {$t = assignExprType_tmp($tp1.t, "Invalid operands for <and> operator."); $rvalue = false;}
  | {$t = new NoType(); $rvalue = true;}
  ;

expr_eq returns [Type t, boolean rvalue]:
    tp1 = expr_cmp tp2 = expr_eq_tmp
      {$t = checkEqualityExprType($tp1.t, $tp2.t);
        $rvalue = $tp1.rvalue && $tp2.rvalue;}
  ;


expr_eq_tmp returns [Type t, boolean rvalue]:
    ('==' | '<>') tp1 = expr_cmp tp2 = expr_eq_tmp
      {$t = checkEqualityExprType_tmp($tp1.t, $tp2.t); $rvalue = false;}
  | {$t = new NoType(); $rvalue = true;}
  ;

expr_cmp returns [Type t, boolean rvalue]:
    tp1 = expr_add tp2 = expr_cmp_tmp
    {$t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands");
      $rvalue = $tp1.rvalue && $tp2.rvalue;}
  ;

expr_cmp_tmp returns [Type t, boolean rvalue]:
    (cmp = '<' | cmp = '>') tp = expr_add
      {$t = assignExprType_tmp($tp.t, $cmp.text); $rvalue = false;}
    expr_cmp_tmp
  | {$t = new NoType(); $rvalue = true;}
  ;

expr_add returns [Type t, boolean rvalue]:
    tp1 = expr_mult tp2 = expr_add_tmp
    {$t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands");
      $rvalue = $tp1.rvalue && $tp2.rvalue;}
  ;

expr_add_tmp returns [Type t, boolean rvalue]:
    add = ('+' | '-') tp = expr_mult
      {$t = assignExprType_tmp($tp.t, $add.text); $rvalue = false;}
    expr_add_tmp
  | {$t = new NoType(); $rvalue = true;}
  ;

expr_mult returns [Type t, boolean rvalue]:
    tp1 = expr_un tp2 = expr_mult_tmp
    {$t = assignExprType ($tp1.t, $tp2.t, "Invalid arithmatic operands");
     $rvalue = $tp1.rvalue && $tp2.rvalue;}
  ;

expr_mult_tmp returns [Type t, boolean rvalue]:
    mult = ('*' | '/') tp = expr_un
      {$t = assignExprType_tmp($tp.t, $mult.text); $rvalue = false;}
    expr_mult_tmp
  | {$t = new NoType(); $rvalue = true;}
  ;

expr_un returns [Type t, boolean rvalue]:
    ('not' | '-') tp = expr_un
      {$t = assignExprType_tmp($tp.t,  "Invalid arithmatic operands"); $rvalue = false;}
  |  tp1 = expr_mem {$t = $tp1.t; $rvalue = $tp1.rvalue;}
  ;

expr_mem returns [Type t, boolean rvalue]:
    tp = expr_other dim = expr_mem_tmp {
      try{
        $t = $tp.t.dimensionAccess($dim.dimension);
        if($dim.dimension == 0)
          $rvalue = $tp.rvalue;
        else
          $rvalue = false;
      }catch(UndefinedDemensionsException ex){
        $t = printErrAndAssignNoType("Undefined demensions.");
        $rvalue = false;
      }
    }
  ;

expr_mem_tmp returns [int dimension]:
    '[' tp = expr {
      if(!$tp.t.equals(new IntType()))
        print("invalid index.");
      } ']' d = expr_mem_tmp {$dimension = $d.dimension + 1;}
  | {$dimension = 0;}
  ;

expr_other returns [Type t, boolean rvalue]:
     CONST_NUM {$t = new IntType(); $rvalue = true;}
  |  CONST_CHAR {$t = new CharacterType(); $rvalue = true;}
  |  str = CONST_STR {$t = new ArrayType($str.text.length()-2, new CharacterType()); $rvalue = true;}
  |  id = ID {$t = getIDFromSymTable($id.text, $id.line);}
  |  '{' tp1 = expr {int size = 1;} (',' tp2 = expr
          {size = checkAndFindNumOfItemsInExplitArray($tp1.t, $tp2.t, size);})*
          {$t = assignExplitArrayType(size, $tp1.t); $rvalue = false;}
     '}'
  |  'read' '(' size = CONST_NUM ')' {$t = new ArrayType($size.int, new CharacterType()); $rvalue = true;}
  |  '(' tp = expr ')' {$t = $tp.t; $rvalue = $tp.rvalue;}
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
