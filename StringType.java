public class StringType extends Type {

	public int size() {
		return Type.WORD_BYTES;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof StringType)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "string";
	}

	private static StringType instance;

	public static StringType getInstance() {
		if(instance == null)
			return instance = new StringType();
		return instance;
	}
}
