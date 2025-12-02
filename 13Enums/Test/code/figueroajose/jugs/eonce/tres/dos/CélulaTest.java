package code.figueroajose.jugs.eonce.tres.dos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CélulaTest {
	
	@Test
	@DisplayName("Caso Prueba Célula input: 1 - output: Muerta")
	void casoPrueba() {
		assertEquals(Célula.MUERTA, Célula.VIVA.siguienteGeneración(1));
	}
	
	@Test
	@DisplayName("Caso #2 Prueba Célula input: 4 - output Muerta")
	void casoPrueba2() {
		assertEquals(Célula.MUERTA, Célula.VIVA.siguienteGeneración(4));
	}

	@Test
	@DisplayName("Caso #3 Prueba Célula input: 2 - output viva")
	void casoPrueba3() {
		assertEquals(Célula.VIVA, Célula.VIVA.siguienteGeneración(2));
	}
	
	@Test
	@DisplayName("Caso #4 Prueba Célula input: 3 - output viva")
	void casoPrueba4() {
		assertEquals(Célula.VIVA, Célula.VIVA.siguienteGeneración(3));
	}
	
	@Test
	@DisplayName("Caso #5 Prueba Célula input: 2 - output Muerta")
	void casoPrueba5() {
		assertEquals(Célula.MUERTA, Célula.MUERTA.siguienteGeneración(2));
	}
	
	@Test
	@DisplayName("Caso #6 Prueba Célula input: 3 - output viva")
	void casoPrueba6() {
		assertEquals(Célula.VIVA, Célula.MUERTA.siguienteGeneración(3));
	}
	
	@Test
	@DisplayName("Caso #7 Prueba Célula input: 4 - output Muerta")
	void casoPrueba7() {
		assertEquals(Célula.MUERTA, Célula.MUERTA.siguienteGeneración(4));
	}
}
