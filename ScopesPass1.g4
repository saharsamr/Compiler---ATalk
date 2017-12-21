grammar ScopesPass1;

@members{
  void beginScope() {
      int localOffset = 0;
      int globalOffset = 0;

      if(SymbolTable.top != null) {
          localOffset = SymbolTable.top.getOffset(Register.SP);
          globalOffset = SymbolTable.top.getOffset(Register.GP);
      }

        SymbolTable.push(new SymbolTable(SymbolTable.top));

        SymbolTable.top.setOffset(Register.SP, localOffset);
        SymbolTable.top.setOffset(Register.GP, globalOffset);
    }

    void endScope() {
        codeData += ("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + "\n\n");
        if(SymbolTable.top.getPreSymbolTable() != null) {
              SymbolTable.top.getPreSymbolTable().setOffset(
                  Register.GP,
                  SymbolTable.top.getOffset(Register.GP)
              );
          }
          SymbolTable.pop();
    }
}
