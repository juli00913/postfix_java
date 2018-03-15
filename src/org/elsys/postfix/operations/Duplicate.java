package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class Duplicate extends AbstractOperation {

	public Duplicate(Calculator calculator) {
		super(calculator, "dup");
	}


	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		getCalculator().addValue(getCalculator().lastValue());
	}
	

	
}
