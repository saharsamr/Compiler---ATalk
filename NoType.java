public class NoType extends Type {

	public int size() {
		return 0;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof NoType)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "noType";
	}

	private static NoType instance;

	public static NoType getInstance() {
		if(instance == null)
			return instance = new NoType();
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
