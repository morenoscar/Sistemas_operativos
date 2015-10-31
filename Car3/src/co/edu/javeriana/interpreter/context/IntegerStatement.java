package co.edu.javeriana.interpreter.context;

import java.util.*;
import co.edu.javeriana.interpreter.*;

public class IntegerStatement extends Statement {

	public Object numero;
	public IntegerStatement(Object numero)
	{
	 super ();
	 this.numero = numero;
	} 
	
	public Object interpret() {
	
		return numero;
	}
	
}
