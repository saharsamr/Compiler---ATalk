public class Variable {

	public Variable(String name, Type type, boolean rvalue) {
		this.name = name;
		this.type = type;
		if(rvalue)
			this.type.setRvalue();
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public int size() {
		return type.size();
	}

	@Override
	public String toString() {
		return String.format("%s %s", type.toString(), name);
	}

	private String name;
	private Type type;
}
