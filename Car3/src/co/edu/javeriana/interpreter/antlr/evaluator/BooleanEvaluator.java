package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class BooleanEvaluator implements Evaluator {

	boolean valor;
	
	public BooleanEvaluator(Boolean value){
		this.valor= value;
	}
	
	
	@Override
	public Object evaluate(Context pila) {
		return valor;
	}


	@Override
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}

}
