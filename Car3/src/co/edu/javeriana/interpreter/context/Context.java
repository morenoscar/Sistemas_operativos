package co.edu.javeriana.interpreter.context;
import co.edu.javeriana.interpreter.antlr.evaluator.Evaluator;
import java.util.HashMap;


public class Context {

	private HashMap<String, Object> tabla;
	protected Context anterior = null;

	public Context(Context ant) {
		this.tabla = new HashMap<String, Object>();
		anterior = ant;
	}

	public Context() {
		tabla = new HashMap<String, Object>();
	}

	public void put(String simbolo, Evaluator statement) {
		tabla.put(simbolo, statement);
	}

	public Evaluator get(String palabra) {
		for (Context e = this; e != null; e = e.anterior) {
			Evaluator encontrado = (Evaluator) (e.tabla.get(palabra));
			if (encontrado != null)
				return encontrado;
		   }
		return null;
	}
	

}
