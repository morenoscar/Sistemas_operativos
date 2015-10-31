package co.edu.javeriana.interpreter;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import co.edu.javeriana.car.Car;
import co.edu.javeriana.interpreter.antlr.CarLexer;
import co.edu.javeriana.interpreter.antlr.CarParser;

public class ANTLRInterpreter extends Interpreter {

	@Override
	public void executeProgram(String program, Car car) {
        try {
        	CarLexer lexer = new CarLexer(new ANTLRFileStream(program));
        	CommonTokenStream tokens = new CommonTokenStream(lexer);
        	CarParser parser = new CarParser(car, tokens);
        	parser.program();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
}
