import java.util.*;

public class ArrayType extends Type {

	private int size;
	private Type arrType;

	public ArrayType(int size_, Type t){
		this.size = size_;
		this.arrType = t;
		if (size_ <= 0)
			this.size=0;
	}

	public int size() {
		return size*arrType.size();
	}

	@Override
	public boolean equals(Object other) {//length
		if(other instanceof ArrayType && this.toString().equals(other.toString()))
			return true;
		return false;
	}

	@Override
	public String toString() {
			return this.arrType.toString() + "[" + this.size + "]";
	}

	@Override
	public Type dimensionAccess(int n)throws UndefinedDemensionsException{
		try{
			if(n == 0)
				return this;
			return arrType.dimensionAccess(n-1);
		}catch (UndefinedDemensionsException ex){
			throw ex;
		}
	}

	public Type getIterationType(){
		return this.arrType;
	}

}
