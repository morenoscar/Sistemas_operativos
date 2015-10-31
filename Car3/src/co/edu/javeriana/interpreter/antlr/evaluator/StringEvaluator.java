package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class StringEvaluator implements Evaluator  {

	private String value = "";


	public StringEvaluator(String a) {
		if(a.charAt(0) == ('"'))
			value = a.substring(1, a.length() - 1);
		else
			value = a;
	}
	
	@Override
	public Object evaluate(Context pila) {
		return value;
	}

	@Override
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}

}
