package code.figueroajose.jugs.esiete.tres;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuscarTest {
	
	@Test
	@DisplayName("Caso de prueba #1 input - new int[]{ 5, 10, 3, 100} output- 2")
	void casoPruebaUno() {
		assertEquals(2, Buscar.buscar(new int[] {5, 10, 3, 100}));
	}
	
	@Test
	@DisplayName("Caso de prueba #2 input - new int[]{ 10, 10, 10} output- -1")
	void casoPruebaDos() {
		assertEquals(2, Buscar.buscar(new int[] {5, 10, 3, 100}));
	}
}
