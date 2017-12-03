import java.util.*;

public class ArrayType extends Type {

  private int dimension;
          ArrayList<int> dimsLength;

  public ArrayType (int dimension_, ArrayList<int> dimsLength_){
    this.dimension = dimension_;
    this.dimsLength = dimsLength_;
  }

	public int size() {
		return Type.WORD_BYTES;
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

	public static ArrayType getInstance() {
		if(instance == null)
			return instance = new ArrayType();
		return instance;
	}
}
