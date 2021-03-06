package co.edu.javeriana.interpreter.antlr.evaluator;

import co.edu.javeriana.car.Car;
import co.edu.javeriana.interpreter.context.Context;

public class Color implements Evaluator {

	private final Evaluator a;
	private final Evaluator b;
	private final Evaluator c;
	private final Evaluator d;
	private final Car car;

	public Color(Car car, Evaluator a, Evaluator b, Evaluator c, Evaluator d) {
		this.car = car;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}


	@Override
	public String toTreeString(String ident) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(Context pila) {
		
		car.color(Integer.parseInt(a.evaluate(pila).toString()), Integer.parseInt(b.evaluate(pila).toString()),
				Integer.parseInt(c.evaluate(pila).toString()), Integer.parseInt(d.evaluate(pila).toString()));
		System.out.println("El nuevo color (rgba)del carro es: "
				+  a.evaluate(pila).toString() + " " +  b.evaluate(pila).toString()
				+ " " +  c.evaluate(pila).toString() + " "
				+ d.evaluate(pila).toString());
		return null;
		
	}

}
