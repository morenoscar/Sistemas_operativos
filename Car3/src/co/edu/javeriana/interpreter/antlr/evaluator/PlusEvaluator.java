package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class PlusEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public PlusEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public String toTreeString(String ident) {
		return '\n' + ident + "Plus: " + op1.toTreeString(ident + "  ")
				+ op2.toTreeString(ident + "  ");
	}

	@Override
	public Object evaluate(Context pila) {

		Object ob1 = op1.evaluate(pila);
		Object ob2 = op2.evaluate(pila);
		System.out.println(ob1 + " + " + ob2 + " = "
				+ ((Double) ob1 + (Double) ob2));
		if (ob1 instanceof Double && ob2 instanceof Double) {
			return ((Double) ob1 + (Double) ob2);
		}
		if (ob1 instanceof String && ob2 instanceof String) {
			return ((String) ob1).concat((String) ob2);
		}
		return ob2;

	}
}
