package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class NegationEvaluator implements Evaluator {
	private final Evaluator op1;
	
	public NegationEvaluator(Evaluator op1){
		this.op1= op1;
	}

	public String toTreeString (String ident)
	{
		return '\n' + ident + "Negation: " +
		op1.toTreeString(ident + "  ");
	}

	@Override
	public Object evaluate(Context pila) {
	
			return -1 * (Double) op1.evaluate(pila);
	
	}
}
