grammar GettingSymbolTableItemsFuncs;

@members{
  Type getIDFromSymTable(String idName, int line) {
    SymbolTableItem item = SymbolTable.top.get(idName);
    if(item == null){
      printErrors(line, "Undefined refrence to variable <" + idName + ">.");
      return new NoType();
    }
    else {
      SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
      codeData += (line + ") Variable " + idName +" used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
      return var.getVariable().getType();
    }
  }

  SymbolTableItemReceiver getRecieverFromSymTable(String name, int line, SymbolTable actorSym) throws ReceiverDoseNotExistsException{
    SymbolTableItem item = actorSym.get(name);
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

  String makeKey(String actr, String rcvr, ArrayList<Type> argumentTypes){
    String key = actr + ": " + rcvr + " (";
    for (int i = 0; i < argumentTypes.size(); i++){
      key += argumentTypes.get(i).toString();
      if (i != argumentTypes.size() - 1)
        key += ", ";
    }
    return key + ")";
  }

  String makeRecieverkey(String currentActor, String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes){
    if(rcvrActor.equals("self"))
      return makeKey(currentActor, rcvrName, argumentTypes);
    /*else if(rcvrActor.equals("sender"))
      return makeKey(senderName, rcvrName, argumentTypes);*/
    else
      return makeKey(rcvrActor, rcvrName, argumentTypes);
  }

  SymbolTableItemReceiver checkRecieverExistance(String currentActor, String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes, int line)
  throws ReceiverDoseNotExistsException, ActorDoesntExistsException{
    String key = makeRecieverkey(currentActor, rcvrActor, rcvrName, argumentTypes);
    if(rcvrActor.equals("self"))
      return getRecieverFromSymTable(key, line, SymbolTable.top);
    else
      return getRecieverFromSymTable(key, line, getActorFromSymTable(rcvrActor, line).getActorSymTable());
  }
}
