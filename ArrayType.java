import java.util.*;

public class ArrayType extends Type {

	private int size;
	private Type arrType;

	public ArrayType(int size_, Type t){
		this.size = size_;
		this.arrType = t;
	}

	public int size() {
		return size*arrType.size();
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof ArrayType) //TODO: add dimention checking
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "array";
	}

	private static ArrayType instance;


	// public static ArrayType getInstance() {
	// 	if(instance == null)
	// 		return instance = new ArrayType();
	// 	return instance;
	// }
}
