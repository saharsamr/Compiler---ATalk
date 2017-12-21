grammar FillSymbolTalbesFuncs;

@header{
      import java.util.ArrayList;
}

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

    void addVarItem(String name, Type type, int lineNum, Register reg){
      try{
        if (reg == Register.SP)
          putLocalVar(name, type);
        else if (reg == Register.GP)
          putGlobalVar(name, type);
        printVarData(name, type, reg);
      }catch(ItemAlreadyExistsException e){
        repeatedVarCount++;
        printErrors(lineNum , "Variable <" + name + "> already exist!");
        try{
          if (reg == Register.SP)
            putLocalVar(name + "_temporary_" + repeatedVarCount, type);
          else if (reg == Register.GP)
            putGlobalVar(name + "_temporary_" + repeatedVarCount, type);
        }catch(ItemAlreadyExistsException ex){}
      }
    }

    void addActor(int size, String name, int lineNum){
      if( size <= 0 ){
        size=0;
        printErrors(lineNum, "size of Actor queue is negative.");
      }
      codeData += ("Actor\n\tname: "+ name
          + "\n\tActor queue size: " + size + "\n\n");
      try{
        putActor(name, SymbolTable.top.getOffset(Register.GP));
      }catch(ActorAlreadyExistsException e){
        actorCount++;
        printErrors(lineNum,"Actor <" + name + "> already exist!");
        String new_name = name + "_temporary_" + actorCount;
        try{
          putActor(new_name, SymbolTable.top.getOffset(Register.GP));
        }catch(ActorAlreadyExistsException ex){}
      }
    }

    void addReceiver(String receiverName,String actorName, int lineNum, ArrayList<Type> argumentTypes){
       try{
         putReceiver(receiverName, actorName, argumentTypes);
         printRecieverData(receiverName, argumentTypes);
       }catch(ReceiverAlreadyExistsException e){
         receiverCount++;
         SymbolTableItemReceiver temp = new SymbolTableItemReceiver(receiverName,actorName,argumentTypes);
         printErrors(lineNum,"Reciever <" + temp.getKey() + "> already exist!");
         String new_name = receiverName + "_temporary_" + receiverCount;
         try{
           putReceiver(new_name, actorName, argumentTypes);
         }catch(ReceiverAlreadyExistsException ex){}
       }
    }

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableLocalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.SP)
            )
        );
    }

    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableGlobalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.GP)
            )
        );
    }

    void putActor(String name, int offset)throws ActorAlreadyExistsException{
      try{
        SymbolTable.top.put(
            new SymbolTableItemActor(name,
                SymbolTable.top.getOffset(Register.GP)
            )
        );
      }catch(ItemAlreadyExistsException e){
        throw new ActorAlreadyExistsException();
      }
    }

    void putReceiver(String name,String actorName, ArrayList<Type> argumentTypes)throws ReceiverAlreadyExistsException{
      try{
        SymbolTable.top.put(
            new SymbolTableItemReceiver(name,actorName,argumentTypes)
        );
      }catch(ItemAlreadyExistsException e){
        throw new ReceiverAlreadyExistsException();
      }
    }

    void addRecieverArguments(ArrayList<Type> argumentTypes, ArrayList<String> argumentsNames, int lineNum){
      for (int i = 0; i < argumentTypes.size(); i++)
        addVarItem(argumentsNames.get(i), argumentTypes.get(i), lineNum, Register.SP);
    }
}
