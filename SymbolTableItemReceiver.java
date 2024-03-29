import java.util.ArrayList;

public class SymbolTableItemReceiver extends SymbolTableItem {

	public SymbolTableItemReceiver(String recName_,String actorName_, ArrayList<Type> argumentTypes_) {
		this.receiverName = recName_;
		this.actorName=actorName_;
		this.argumentTypes=argumentTypes_;
	}

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public String getKey() {
		String key = actorName + "_" + this.receiverName;
		for (int i = 0; i < argumentTypes.size(); i++){
			key += argumentTypes.get(i).toString();
			if (i != argumentTypes.size() - 1)
				key += "_";
		}
		return key;
	}

	public String getRecieverName(){
		return this.receiverName;
	}

	// public Register getBaseRegister(){
  //   return Register.GP; //in SP bud
  // }

	String receiverName;
	String actorName;
	ArrayList<Type> argumentTypes;
}
