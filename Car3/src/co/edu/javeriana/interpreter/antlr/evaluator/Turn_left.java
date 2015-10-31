package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.car.Car;
import co.edu.javeriana.interpreter.context.Context;

public class Turn_left implements Evaluator {
	private final Evaluator op1;
	private final Car car;

	public Turn_left(Evaluator op1, Car car) {
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
	
			car.left(((Integer) op1.evaluate(pila)));
			System.out.println("El carro rot� " + ((Integer) op1.evaluate(pila))
					+ " grados a la izquierda");
			return null;

	}

}
