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
    if(tp.equals(new ArrayType())){
      for (int i=0 ; i < tp.size() ; i++)
        mips.addToStack(0);
    }
  }

  void addIDtoStack(String id, boolean isRvalue) {
    SymbolTableItem item = SymbolTable.top.get(id);
    SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
    //print(""+var.getOffset());
    if(var.getVariable().getType.equals(new ArrayType())){
      mips.addAddressToStack($id.text, var.getOffset()*-1);
    }
    if (var.getBaseRegister() == Register.SP){
        if (isRvalue) mips.addToStack($id.text, var.getOffset()*-1);
        else mips.addAddressToStack($id.text, var.getOffset()*-1);
    }
    else {
        if (isRvalue) mips.addGlobalToStack(var.getOffset());
        else mips.addGlobalAddressToStack($id.text, var.getOffset());
    }
  }
}
