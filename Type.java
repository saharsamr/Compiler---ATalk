public abstract class Type {

	public abstract int size();

	public abstract boolean equals(Object other);

	public abstract String toString();

	public static final int WORD_BYTES = 4;

	private boolean rvalue = false;

	public abstract Type dimensionAccess(int n)throws UndefinedDemensionsException;

	public abstract Type getIterationType() throws UndefinedDemensionsException;

	public boolean isRvalue(){
		return this.rvalue;
	}

	public void setRvalue(){
		this.rvalue = true;
	}
}
