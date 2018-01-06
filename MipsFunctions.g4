grammar MipsFunctions;

@members{
  void globalVarInitialization(String var_id, int line){
      SymbolTableItem item = SymbolTable.top.get(var_id);
      SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
      print(line + ") Variable " + var_id + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
      mips.addGlobalVariable(var.getOffset(), -1);
  }

  void localVarInitialization(Type tp){
    SymbolTable.define();
    if(tp.equals(new IntType()) || tp.equals(new CharacterType()))
      mips.addToStack(0);
    if(tp instanceof ArrayType){
      for (int i=0 ; i < tp.size()/4 ; i++)
        mips.addToStack(0);
    }
  }

  void addIDtoStack(String id, boolean isRvalue) {
    SymbolTableItem item = SymbolTable.top.get(id);
    SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
    if(var.getVariable().getType() instanceof ArrayType){
      mips.addAddressToStack(id, var.getOffset()*-1);
      return ;
    }
    if (var.getBaseRegister() == Register.SP){
        if (isRvalue) mips.addToStack(id, var.getOffset()*-1);
        else mips.addAddressToStack(id, var.getOffset()*-1);
    }
    else {
        if (isRvalue) mips.addGlobalToStack(var.getOffset());
        else mips.addGlobalAddressToStack(id, var.getOffset());
    }
  }
}
