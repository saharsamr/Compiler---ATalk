grammar GlobalInTwoPasses;

@header{
      import java.util.ArrayList;
      import java.util.HashMap;
}

@members{
  int actorCounter = 0;
  int recieverCnter = 0;
  HashMap <String, Integer> actorsID = new HashMap <String, Integer> ();
  HashMap <String, Integer> recieversID = new HashMap <String, Integer> ();
  int numOfActors;
  HashMap <Integer, Integer> numOfReciversInActors = new HashMap <Integer, Integer> ();

  String makeKey(String actr, String rcvr, ArrayList<Type> argumentTypes){
    String key = actr + "_" + rcvr;
    for (int i = 0; i < argumentTypes.size(); i++){
      key += argumentTypes.get(i).toString();
      if (i != argumentTypes.size() - 1)
        key += "_";
    }
    return key;
  }
}
