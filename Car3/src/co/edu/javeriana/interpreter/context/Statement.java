package co.edu.javeriana.interpreter.context;

public abstract class  Statement {

	public Statement(){
		super();
	}
	abstract public Object interpret();
}
