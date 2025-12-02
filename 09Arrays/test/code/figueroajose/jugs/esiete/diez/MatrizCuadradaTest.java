package code.figueroajose.jugs.esiete.diez;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatrizCuadradaTest {
	
	@Test
	@DisplayName("Caso de Prueba #1 input- (m(3))  output- {{1, 0, 0},"
														 + "{0, 1, 0},"
                                                         + "{0, 0, 1}}")
	void casoDePruebaUno() {
		
		assertArrayEquals(new int[][] {{1, 0, 0},
			 						   {0, 1, 0},
			 						   {0, 0, 1}}, MatrizCuadrada.m(3));
	}
	
}
