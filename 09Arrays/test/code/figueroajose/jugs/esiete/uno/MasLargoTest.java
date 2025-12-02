package code.figueroajose.jugs.esiete.uno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MasLargoTest {
	
	@Test
	@DisplayName("Caso Prueba #1 input - new String[] {'abc','casa','cc'} output - 1")
	void casoPruebaUno() {
		assertEquals(1, MasLargo.masLargo(new String[] {"abc","casa","cc"}));
	}	
	

	@Test
	@DisplayName("Caso Prueba #2 input - new String[] {'a','b','c'} output - 0")
	void casoPruebaDos() {
		assertEquals(0, MasLargo.masLargo(new String[] {"a","b","c"}));
	}	
}
