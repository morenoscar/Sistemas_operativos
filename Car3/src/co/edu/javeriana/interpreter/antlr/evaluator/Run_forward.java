package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.car.Car;
import co.edu.javeriana.interpreter.context.Context;

public class Run_forward implements Evaluator{
	private final Evaluator op1;
	private final Car car;
public Run_forward (Evaluator op1, Car car) {
	this.op1 = op1;
	this.car=car;
}

	@Override
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object evaluate(Context pila) {
		
			car.forward(((Integer) op1.evaluate(pila)));
			System.out.println("El carro avanz� " + ((Integer) op1.evaluate(pila))
					+ " p�xeles");
			return null;

	}

}
