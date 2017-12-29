grammar MipsVarInitialization;

@members{
  void globalVarInitialization(String var_id, int line){
      SymbolTableItem item = SymbolTable.top.get(var_id);
      SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
      print(line + ") Variable " + var_id + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
      mips.addGlobalVariable(var.getOffset(), -1);
  }

  void localVarInitialization(){
    SymbolTable.define();
    mips.addToStack(0);
  }
}
