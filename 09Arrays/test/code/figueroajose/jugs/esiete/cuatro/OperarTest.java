package code.figueroajose.jugs.esiete.cuatro;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperarTest {

	@Test
	@DisplayName("Caso Prueba #1 input - new String[]{1 , 2 , 0 } output - new int[]{4, 7, 1}")
	void casoPruebaUno() {

		assertArrayEquals(new int[] { 4, 7, 1 }, Operar.operar(new int[] { 1, 2, 0 }));
	}
	
	@Test
	@DisplayName("Caso Prueba #2 input - new String[]{10 , 13 , 16 } output - new int[]{3, 4, 5}")
	void casoPruebaDos() {

		assertArrayEquals(new int[] {10 , 13 , 16 }, Operar.operar(new int[] { 3, 4, 5 }));
	}
}
