grammar ScopesPass2;

@members{
  void beginScope() {
      SymbolTable.push();
  }

  void endScope() {
      codeData += ("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP)+"\n\n");
      SymbolTable.pop();
  }
}
