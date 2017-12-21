grammar PrintLogsPass2;

@members{
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

  Type printErrAndAssignNoType(String msg){
    print(msg);
    return new NoType();
  }
}
