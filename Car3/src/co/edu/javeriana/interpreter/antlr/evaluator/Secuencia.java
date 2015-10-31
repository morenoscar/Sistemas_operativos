package co.edu.javeriana.interpreter.antlr.evaluator;

import java.util.ArrayList;

import co.edu.javeriana.interpreter.context.Context;

public class Secuencia implements Evaluator{
	
	private ArrayList<Evaluator>lista = new ArrayList<Evaluator>();
	
	public Secuencia(){
		
	}
	
	
	public Object evaluate(Context pila) {
		for(Evaluator evaluador: lista){
			evaluador.evaluate(pila);
		}
		
		return null;
	}

	public void add(Evaluator e){
		lista.add(e);
	}
	
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}

}
