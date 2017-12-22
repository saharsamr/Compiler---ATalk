public class SymbolTableItemForeachIterator extends SymbolTableVariableItemBase {

	public SymbolTableItemForeachIterator(Variable variable, int offset) {
		super(variable, offset);
	}

	@Override
	public Register getBaseRegister() {
		return Register.TEMP0;
	}

	@Override
	public boolean useMustBeComesAfterDef() {
		return false;
	}
}
