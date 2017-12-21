grammar PrintLogsPass2;

@members{
  int findLine(int ln1, int ln2){
    if(ln1 == -1 && ln2 == -1)
       return -1;
    else if(ln1 == -1)
       return ln2;
    else if(ln2 == -1)
       return ln1;
    else
      return ln1;
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

  Type printErrAndAssignNoType(String msg){
    print(msg);
    return new NoType();
  }
}
