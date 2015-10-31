package co.edu.javeriana.interpreter.antlr.evaluator;
import co.edu.javeriana.interpreter.context.*;

public class MayorIgualEvaluator implements Evaluator{

private final Evaluator op1, op2;
public MayorIgualEvaluator(Evaluator op1, Evaluator op2){
	this.op1=op1;
	this.op2=op2;
}

public String toTreeString (String ident)
{
	return '\n' + ident + "Mayor igual: " +
	op1.toTreeString(ident + "  ")+
	op2.toTreeString(ident + "  ");
}
@Override
public Object evaluate(Context pila) 
{

		if((Double)op1.evaluate(pila)>= (Double)op2.evaluate(pila))
			return true;
		return false;
	}

}