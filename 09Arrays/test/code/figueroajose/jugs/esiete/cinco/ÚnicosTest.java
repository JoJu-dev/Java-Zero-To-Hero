package code.figueroajose.jugs.esiete.cinco;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ÚnicosTest {

	@Test
	@DisplayName("Caso de Pruena #1 input - (new int[] {5, 1, 3})  output - true")
	void casoPruebaUno() {
		assertEquals(true,Únicos.únicos(new int[] {5, 1, 3}));
	}
	
	@Test
	@DisplayName("Caso de Pruena #2 input - (new int[] {-1, 7, -1, 3})  output - false")
	void casoPruebaDos() {
		assertEquals(false,Únicos.únicos(new int[] {-1, 7, -1, 3}));
	}
	
	
	@Test
	@DisplayName("Caso de Pruena #3 input - (new int[] {-1, 7, 4, 3,1,1})  output - false")
	void casoPruebaTres() {
		assertEquals(false,Únicos.únicos(new int[] {-1, 7, 4, 3,1,1}));
	}
}
