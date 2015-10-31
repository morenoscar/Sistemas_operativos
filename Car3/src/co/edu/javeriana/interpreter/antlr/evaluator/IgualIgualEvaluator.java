package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class IgualIgualEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public IgualIgualEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(Context pila) {
		// TODO: make it also work for strings.

			//Both double.
			if(op1.evaluate(pila) instanceof Double && op2.evaluate(pila) instanceof Double ) {
				if ((double) ((Double) op1.evaluate(pila)) == (double) ((Double) op2
						.evaluate(pila))) {
					return true;
			}else 
				return false;
			}
			//Both String.
			if(op1.evaluate(pila) instanceof String && op2.evaluate(pila) instanceof String ) {
				if  (((String)op1.evaluate(pila)).equals(((String)op2.evaluate(pila)))) {
					return true;
			}else 
				return false;
			}
			
			//Both Boolean.
			if(op1.evaluate(pila) instanceof Boolean && op2.evaluate(pila) instanceof Boolean ) {
				if  (((Boolean)op1.evaluate(pila)).equals(((Boolean)op2.evaluate(pila)))) {
					return true;
			}else 
				return false;
			}
			
			//Double and String
			if(op1.evaluate(pila) instanceof Double && op2.evaluate(pila) instanceof String ) {
				if  (((Double)op1.evaluate(pila)).equals(Double.valueOf((((String)op2.evaluate(pila)))))) {
					return true;
			}else 
				return false;
			}
			
			//String and Double
			if(op1.evaluate(pila) instanceof String && op2.evaluate(pila) instanceof Double ) {
				if  (((Double)op2.evaluate(pila)).equals(Double.valueOf((((String)op1.evaluate(pila)))))) {
					return true;
			}else 
				return false;
			}

			//Change for an exception.
			return false;
		} 

	@Override
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}

}