public class CharacterType extends Type {

	public int size() {
		return Type.WORD_BYTES;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof CharacterType)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "char";
	}

	private static CharacterType instance;

	public static CharacterType getInstance() {
		if(instance == null)
			return instance = new CharacterType();
		return instance;
	}

	@Override
	public Type dimensionAccess(int n)throws UndefinedDemensionsException{
		if(n == 0)
			return this;
		throw new UndefinedDemensionsException();
	}

	@Override
	public Type getIterationType() throws UndefinedDemensionsException{
		throw new UndefinedDemensionsException();
	}
}
