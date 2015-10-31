package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.interpreter.context.Context;

public class DeclareEvaluator implements Evaluator {
	private String name;
	private Evaluator e;
	
	public DeclareEvaluator(String name, Evaluator e) {
		super();
		this.name = name;
		this.e = e;
	}



	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object evaluate(Context pila) {
		pila.put(name,e);
		return this;
	}


	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}
}
