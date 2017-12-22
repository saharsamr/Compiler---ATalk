grammar RecieversFuncs;

@members{
  void checkWriteFuncArgument(Type tp, int line){
    try{
      if(!(tp.equals(new IntType()) || tp.equals(new CharacterType())))
        if(!tp.dimensionAccess(1).equals(new CharacterType()))
          printErrors(line, "Invalid argument for function <write>.");
    }catch(UndefinedDemensionsException ex){
      printErrors(line, "Invalid argument for function <write>.");
    }
  }

  void checkInitAndSender(String rcvrActor, String rcvrName, int argCnt) throws SenderInInitException{
    if(rcvrActor.equals("sender"))
      if(argCnt == 0 && rcvrName.equals("init"))
        throw new SenderInInitException();
  }

  void checkCallValidation(String currentActor, String currentReceiver, String rcvrActor, String rcvrName, ArrayList<Type> argumentsTypes, int line, int argCnt){
    try{
      checkInitAndSender(rcvrActor, currentReceiver, argCnt);
      if(!rcvrActor.equals("sender") && !rcvrActor.equals("self"))
        getActorFromSymTable(rcvrActor, line);
      checkRecieverExistance(currentActor, rcvrActor, rcvrName, argumentsTypes, line);
    }catch(SenderInInitException ex){
        printErrors(line, "Invalid use of keyword <sender>.");
    }catch(ActorDoesntExistsException ex){
        printErrors(line, "Undefined refrence to actor<" + rcvrActor + ">.");
    }catch(ReceiverDoseNotExistsException ex){
        printErrors(line, "Undefined refrence to reciever<" + rcvrName + ">.");
    }
  }
}
