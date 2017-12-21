grammar HandleExprsTypesFuncs;

@members{
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

  Type assignExprType(Type tp1, Type tp2, String msg) {
    try {
      return checkCombinedArithExprTypes(tp1, tp2);
    } catch(ArithmaticsOperandsException ex) {
      return printErrAndAssignNoType(msg);
    }
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
}
