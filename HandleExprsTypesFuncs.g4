grammar HandleExprsTypesFuncs;

@members{

  void putForeachVar(String name, Type type) throws ItemAlreadyExistsException {
      SymbolTable.top.put(
          new SymbolTableItemForeachIterator(
              new Variable(name, type),
              SymbolTable.top.getOffset(Register.TEMP0)
          )
      );
  }

  void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
      SymbolTable.top.put(
          new SymbolTableLocalVariableItem(
              new Variable(name, type),
              SymbolTable.top.getOffset(Register.SP)
          )
      );
  }

  Type checkArithOperandValidation(Type tp)throws ArithmaticsOperandsException{
    if(!tp.equals(new IntType()))
      throw new ArithmaticsOperandsException();
    else
      return tp;
  }

  Type assignExprType_tmp (Type tp, String msg, int line) {
    try {
      return checkArithOperandValidation(tp);
    } catch(ArithmaticsOperandsException ex) {
      printErrors(line, msg);
      return new NoType();
    }
  }

  Type checkCombinedArithExprTypes(Type tp1,Type tp2)throws ArithmaticsOperandsException{
    if((!tp1.equals(new IntType())) && (!tp2.equals(new NoType())))
     throw new ArithmaticsOperandsException();
   else
     return tp1;
 }

  Type assignExprType(Type tp1, Type tp2, String msg, int line) {
    try {
      return checkCombinedArithExprTypes(tp1, tp2);
    } catch(ArithmaticsOperandsException ex) {
      printErrors(line, msg);
      return new NoType();
    }
  }

  Type checkEqualityExprType_tmp(Type tp1, Type tp2, int line) {
    if(tp1.equals(tp2) || tp2.equals(new NoType()))
      return tp1;
    else{
      printErrors(line, "Incompatible types for checking equality.");
      return new NoType();
    }
  }

  Type checkEqualityExprType(Type tp1, Type tp2, int line) {
    if(tp1.equals(tp2))
      return new IntType();
    else if(tp2.equals(new NoType()))//NOTE: notype & notype is not handled?
      return tp1;
    else{
      printErrors(line, "Incompatible types for checking equality.");
      return new NoType();
    }
  }

  Type assignAssignmentExprType(Type tp1, Type tp2, int line) {
    if(tp1.equals(tp2))
      return tp1;
    else{
      printErrors(line, "Invalid assignment.");
      return new NoType();
    }
  }

  void checkIterationExpr(String id, int line, Type tp){
    try{
      tp = tp.getIterationType();
      SymbolTableItem item = SymbolTable.top.get(id);
      if(item == null)
        putForeachVar(id, tp);
      else
        printErrors(line, "variable <" + id + "> already declared in this scope.");
    }catch(UndefinedDemensionsException ex){
      printErrors(line, "Invalid iteration on variable.");
    }catch(ItemAlreadyExistsException ex){}
  }

  void checkConditionExprType(Type tp, int line){
    if(!tp.equals(new IntType()))
      printErrors(line, "Invalid use of expression as a condition.");
  }
}
