package co.edu.javeriana.interpreter.antlr.evaluator;
import co.edu.javeriana.interpreter.context.*;
public interface Evaluator {
	Object evaluate(Context pila);

	String toTreeString (String ident);
}
