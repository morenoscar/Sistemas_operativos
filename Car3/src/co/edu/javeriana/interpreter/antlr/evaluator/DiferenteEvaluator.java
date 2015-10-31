package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class DiferenteEvaluator implements Evaluator{
	private final Evaluator op1;
	private final Evaluator op2;
	public DiferenteEvaluator(Evaluator op1, Evaluator op2){
		this.op1=op1;
		this.op2=op2;
	}
	

	public String toTreeString (String ident)
	{
		return '\n' + ident + "Diferente: " +
		op1.toTreeString(ident + "  ")+
		op2.toTreeString(ident + "  ");
	}


	@Override
	public Object evaluate(Context pila) {
	
			// Both double.
			if (op1.evaluate(pila) instanceof Double
					&& op2.evaluate(pila) instanceof Double) {
				if ((double) ((Double) op1.evaluate(pila)) == (double) ((Double) op2
						.evaluate(pila))) {
					return false;
				} else
					return true;
			}
			// Both String.
			if (op1.evaluate(pila) instanceof String
					&& op2.evaluate(pila) instanceof String) {
				if (((String) op1.evaluate(pila)).equals(((String) op2
						.evaluate(pila)))) {
					return false;
				} else
					return true;
			}

			// Both Boolean.
			if (op1.evaluate(pila) instanceof Boolean
					&& op2.evaluate(pila) instanceof Boolean) {
				if (((Boolean) op1.evaluate(pila)).equals(((Boolean) op2
						.evaluate(pila)))) {
					return false;
				} else
					return true;
			}

			// Double and String
			if (op1.evaluate(pila) instanceof Double
					&& op2.evaluate(pila) instanceof String) {
				if (((Double) op1.evaluate(pila)).equals(Double
						.valueOf((((String) op2.evaluate(pila)))))) {
					return false;
				} else
					return true;
			}

			// String and Double
			if (op1.evaluate(pila) instanceof String
					&& op2.evaluate(pila) instanceof Double) {
				if (((Double) op2.evaluate(pila)).equals(Double
						.valueOf((((String) op1.evaluate(pila)))))) {
					return false;
				} else
					return true;
			}

			// Change for an exception.
			return false;
	
	}
}
