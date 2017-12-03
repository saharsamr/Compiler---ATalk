public class SymbolTableItemActor extends SymbolTableItem {

	public SymbolTableItemActor(String actorName, int offset) {
		this.actorName = actorName;
		this.offset = offset;
	}

	public int getOffset() {
		return this.offset;
	}

	public String getKey() {
		return this.actorName;
	}

	public Register getBaseRegister(){
    return Register.GP;
  }

	int offset;
	String actorName;
}
