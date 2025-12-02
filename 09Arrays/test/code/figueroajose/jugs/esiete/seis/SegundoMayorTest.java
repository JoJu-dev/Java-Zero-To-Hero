package code.figueroajose.jugs.esiete.seis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SegundoMayorTest {

	@Test
	@DisplayName("Caso de prueba #1 input - (new int[] {5, 3, 1}) output 3")
	void casoPruebaUno() {

		assertEquals(3, SegundoMayor.segundoMayor(new int[] { 5, 3, 1 }));
	}

	@Test
	@DisplayName("Caso de prueba #2 input - (new int[] {5, 3, 1}) output 3")
	void casoPruebaDos() {

		assertEquals(3, SegundoMayor.segundoMayor(new int[] { 1, 5, 3 }));
	}

	@Test
	@DisplayName("Caso de prueba #  input - (new int[] {5, 3, 1}) output 10")
	void casoPruebas() {

		assertEquals(7, SegundoMayor.segundoMayor(new int[] { -1, 7, 10, 3 }));
	}

	@Test
	@DisplayName("Caso de prueba #2.1 input - (new int[] {5, 3, 1}) output 3")
	void casoPruebaOtraSolucion() {

		assertEquals(3, SegundoMayor.otraSolucion(new int[] { 5, 3, 1 }));
	}
	
	@Test
	@DisplayName("Caso de prueba #2.2  input - (new int[] {5, 3, 1}) output 10")
	void casoPruebaDosOtraSolucion() {

		assertEquals(7, SegundoMayor.segundoMayor(new int[] { -1, 7, 10, 3 }));
	}

}
