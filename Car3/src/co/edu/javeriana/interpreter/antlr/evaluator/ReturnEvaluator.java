package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class ReturnEvaluator implements Evaluator {

	
	Evaluator ev;

	public ReturnEvaluator(Evaluator ev2) {
		ev = ev2;
	}

	@Override
	public Object evaluate(Context pila) {
		Object oj;
		oj = ev.evaluate(pila);

		return oj;
	}

	@Override
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}

}
