grammar ArrayFuncs;

@members{
  int checkAndFindNumOfItemsInExplitArray(Type tp1,Type tp2, int size) {
    if(!tp2.equals(tp1))
      size = -1;
    else if(size != -1)
      size ++;
    return size;
  }

  Type assignExplitArrayType(int size, Type tp, int line) {
    if(size != -1)
      return new ArrayType(size, tp);
    else{
      printErrors(line, "Invalid combination for a array type.");
      return new NoType();
    }
  }

  int checkDimLenValidationInArray(int size, int line){
    if(size <= 0){
      printErrors(line,"size of array is negative");
      size = 0;
    }
    return size;
  }
}
