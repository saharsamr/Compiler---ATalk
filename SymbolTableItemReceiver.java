import java.util.ArrayList;

public class SymbolTableItemReceiver extends SymbolTableItem {

	public SymbolTableItemReceiver(String recName_,String actorName_, ArrayList<String> argumentTypes_) {
		this.receiverName = recName_;
		this.actorName=actorName_;
		this.argumentTypes=argumentTypes_;
	}

	@Override
	public int getSize() {
		return 0;
	}

	public String getKey() {
		return this.receiverName;
	}

	public Register getBaseRegister(){
    return Register.SP;
  }

	String receiverName;
	String actorName;
	ArrayList<String> argumentTypes;
}
