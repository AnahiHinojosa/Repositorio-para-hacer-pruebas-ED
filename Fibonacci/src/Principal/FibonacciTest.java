package Principal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FibonacciTest {

	static Stream<Arguments> datos()
	{
		return Stream.of
		(				
			Arguments.of(0,0), //Valor 0
			Arguments.of(14,377), //Valor positivos
			Arguments.of(4,3),
			Arguments.of(-1,0) //Valor negativo
			
		);
	}
	@ParameterizedTest
	@MethodSource("datos")
	void FibonacciSucesion(int n,int resultado)
	{
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(resultado,fibonacci.FibonacciSucesion(n));
	}
}
