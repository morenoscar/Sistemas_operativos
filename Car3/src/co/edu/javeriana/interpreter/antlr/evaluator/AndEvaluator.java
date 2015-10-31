package co.edu.javeriana.interpreter.antlr.evaluator;
import co.edu.javeriana.interpreter.context.*;

public class AndEvaluator implements Evaluator {
	private final Evaluator op1, op2;
	public AndEvaluator(Evaluator op1, Evaluator op2){
		this.op1=op1;
		this.op2=op2;
	}

	public Object evaluate(Context pila) {
	
       if ((Boolean)op1.evaluate(pila)==true &&
    		   (Boolean) op2.evaluate(pila)==true)
		return true;
		return false;
	}
	public String toTreeString (String ident)
	{
		return '\n' + ident + "Plus: " +
		op1.toTreeString(ident + "  ")+
		op2.toTreeString(ident + "  ");
	}


}
