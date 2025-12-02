package code.figueroajose.jugs.esiete.once;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MatrizCuadradaContrariaTest {

	@Test
	@DisplayName("Caso de Prueba #1 input- (m(3))  output- {{0, 0, 1},"
														 + "{0, 1, 0},"
                                                         + "{1, 0, 0}}")
	void casoDePruebaUno() {
		
	assertArrayEquals(new int[][] {{0, 0, 1},
								   {0, 1, 0},
		                           {1, 0, 0}}, MatrizCuadradaContraria.m2(3));
}
}
