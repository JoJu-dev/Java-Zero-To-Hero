package code.figueroajose.jugs.ecinco.cinco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DígitosSumaTest {

	@Test
	@DisplayName("Caso Prueba Uno \"input - 1234\" output - 1")
	void casoPruebaUno() {
		assertEquals(1, DígitosSuma.dígitosSuma(1234));
	}

	@Test
	@DisplayName("Caso Prueba Dos \"input - 555\" output - 6")
	void casoPruebaDos() {
		assertEquals(6, DígitosSuma.dígitosSuma(555));
	}

	@Test
	@DisplayName("Caso Prueba Tres \"input - 1984\" output - 4")
	void casoPruebaTres() {
		assertEquals(4, DígitosSuma.dígitosSuma(1984));
	}

	@Test
	@DisplayName("Caso Prueba Cuatro \"input - 1945\" output - 1")
	void casoPruebaCuatro() {
		assertEquals(1, DígitosSuma.dígitosSuma(1945));
	}
}