package co.edu.javeriana.interpreter.antlr.evaluator;

import java.util.ArrayList;
import java.util.List;

import co.edu.javeriana.interpreter.context.Context;

/**
 * This class creates a new list, for examle: list a;
 * 
 */
public class ListEvaluator implements Evaluator {

	private List<Object> lista;

	@Override
	public Object evaluate(Context pila) {
		return lista;
	}

	public ListEvaluator() {
		lista = new ArrayList<Object>();
	}

	public List<Object> getLista() {
		return lista;
	}

	public void setLista(List<Object> lista) {
		this.lista = lista;
	}

	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}