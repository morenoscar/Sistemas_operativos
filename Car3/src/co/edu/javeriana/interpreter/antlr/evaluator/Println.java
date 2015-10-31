package co.edu.javeriana.interpreter.antlr.evaluator;

import java.util.ArrayList;

import co.edu.javeriana.interpreter.context.Context;

public class Println implements Evaluator{
	private ArrayList<Evaluator> evaluators;

	public Println() {
		this.evaluators = new ArrayList<Evaluator>();
	}

	public void addEvaluator(Evaluator ev)
	{
		evaluators.add(ev);
	}
	@Override
	public Object evaluate(Context pila) {
		
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < evaluators.size(); i++)
		{
			System.out.println("evaluando en print");
			Object objeto = evaluators.get(i).evaluate(pila);
			String aux  = objeto.toString();
			if(objeto instanceof Double )
			{
				Double num = (Double) objeto;
				if(num - (num) == 0)
				{
					aux = String.valueOf(num);
				}
			}
			s.append(aux);
		}
		s.append("\n");
		System.out.println("Imprimir:" +  s);
		
		return s.toString();
	}


	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}


}



