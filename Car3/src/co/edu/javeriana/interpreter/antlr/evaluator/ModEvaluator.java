package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class ModEvaluator implements Evaluator {
	private final Evaluator op1;
	private final Evaluator op2;
	public ModEvaluator(Evaluator op1, Evaluator op2){
		this.op1=op1;
		this.op2=op2;
	}

	public String toTreeString (String ident)
	{
		return '\n' + ident + "Mod: " + 
		op1.toTreeString(ident + "  ")+
		op2.toTreeString(ident + "  ");
	}
	@Override
	public Object evaluate(Context pila) {
		
			return (Double) op1.evaluate(pila) % (Double) op2.evaluate(pila);
	
	}
}
