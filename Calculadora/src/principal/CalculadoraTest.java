package principal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTest {
	//Argumenos que se le dan , el primero es el resultado, y los otros con los q operas
	static Stream <Arguments>datos(){
		return Stream.of(
				
			Arguments.of(3,2,1),
			Arguments.of(7,3,4),
			Arguments.of(2,-1,3),
			Arguments.of(1,1,0),
			Arguments.of(-3,-1,-2)
		);
					
	}

 	//se crea si o si, y se pone en el methodsource el nombre del stream
	@ParameterizedTest
	@MethodSource("datos")
	void Sumar(int resultado,int num1, int num2) {
		Calculadora cal  = new Calculadora ();
		assertEquals(resultado,cal.Suma(num1, num2));
	}
	//por cada metodo se crea uno por separado 
	static Stream <Arguments>resta(){
		return Stream.of(
				
			Arguments.of(1,2,1),
			Arguments.of(-1,3,4),
			Arguments.of(-4,-1,3),
			Arguments.of(1,1,0),
			Arguments.of(1,-1,-2)
		);
					
	}
	@ParameterizedTest
	@MethodSource("resta")
	void Restar(int resultado, int num1, int num2) {
		Calculadora cal  = new Calculadora ();
		assertEquals(resultado,cal.Rest(num1, num2));
	}

}
