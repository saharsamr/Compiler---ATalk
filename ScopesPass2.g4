grammar ScopesPass2;

@members{
  void beginScope() {
    int temp_0Offset = 0;
      if(SymbolTable.top != null)
        temp_0Offset = SymbolTable.top.getOffset(Register.TEMP0);
      SymbolTable.push();
    SymbolTable.top.setOffset(Register.TEMP0, temp_0Offset);
  }

  void endScope() {
      codeData += ("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP)+"\n\n");
      SymbolTable.pop();
  }
}
