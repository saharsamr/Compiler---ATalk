grammar CheckValidationsFuncs;

@members{
  int checkDimLenValidationInArray(int size){
    if(size <= 0){
      printErrors(size,"size of array is negative");
      size = 0;
    }
    return size;
  }
}
