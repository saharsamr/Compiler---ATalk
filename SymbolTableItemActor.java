public class SymbolTableItemActor extends SymbolTableItem {

	public SymbolTableItemActor(String actorName, int offset, SymbolTable actorSym_) {
		this.actorName = actorName;
		this.offset = offset;
		this.actorSym = actorSym_;
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

	@Override
	public int getSize(){
		return 0;
	}

	public SymbolTable getActorSymTable(){
		return this.actorSym;
	}

	int offset;
	String actorName;
	SymbolTable actorSym;
}
