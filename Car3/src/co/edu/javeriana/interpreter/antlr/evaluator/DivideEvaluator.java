package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class DivideEvaluator implements Evaluator {
	private final Evaluator op1;
	private final Evaluator op2;
	public DivideEvaluator(Evaluator op1, Evaluator op2){
		this.op1=op1;
		this.op2=op2;
	}

	public String toTreeString(String ident)
	{
		return "\n" + ident + "Divide"+ 
				op1.toTreeString(ident + "  ")+
				op2.toTreeString(ident + "  ");
	}

	@Override
	public Object evaluate(Context pila) {
		
			return (Double) op1.evaluate(pila) / (Double) op2.evaluate(pila);
		
	}
}