import java.util.*;

public class SymbolTableItemActor extends SymbolTableItem {

	public SymbolTableItemActor(String actorName, int offset, SymbolTable actorSym_) {
		this.actorName = actorName;
		this.offset = offset;
		this.actorSym = actorSym_;
		this.messagesQueue = new LinkedList<String>();
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

	public void addInitRecieverToQueue() {
		HashMap<String, SymbolTableItem> items = actorSym.getItems();
		for (String currentKey : items.keySet()) {
			SymbolTableItem item = items.get(currentKey);
			if(item instanceof SymbolTableItemReceiver){
				SymbolTableItemReceiver recvr = (SymbolTableItemReceiver) item;
				if (recvr.getRecieverName().equals("init"))
					this.messagesQueue.add(recvr.getKey());
			}
		}
	}

	int offset;
	String actorName;
	SymbolTable actorSym;
	Queue<String> messagesQueue;
}
