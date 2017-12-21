grammar PrintLogsPass1;

@members{
  void printVarData(String name, Type type, Register reg){
    codeData += ("Variable \n\tname: "+ name + "\n\tType: " + type + "\n\tOffset:" + (SymbolTable.top.getOffset(reg) - type.size())
          + "\n\tVarible size: " + type.size() + "\n\n");
  }

  void printRecieverData(String recName, ArrayList<Type> argumentTypes){
    String arguments = "(";
    for (int i = 0; i < argumentTypes.size(); i++){
      arguments += argumentTypes.get(i).toString();
      if (i!=argumentTypes.size()-1)
        arguments+=", ";
    }
    arguments += ")";
    codeData += ("Reciever: " + recName + arguments + "\n\n.");
  }

  void printErrors(int lineNum, String err){
    errorOccured ++;
    if(lineNum >= 0)
      print("Error(" + lineNum + "): " + err + "\n");
    else
      print("Error: " + err + "\n");
  }

  void print(String str){
      System.out.println(str);
  }
}
