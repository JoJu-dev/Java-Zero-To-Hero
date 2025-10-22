package code.figueroajose.jugs.ecinco.siete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CerosInicialesTest {

	@Test
	@DisplayName("Caso Prueba Uno \"input ABC\" \'OUTPUT - 0\'")
	void cadoPruebaUno() {
		assertEquals(0, CerosIniciales.cerosIniciales("ABC"));
	}

	@Test
	@DisplayName("Caso Prueba Dos \"input 00ABC\" \'OUTPUT - 2\'")
	void cadoPruebaDos() {
		assertEquals(2, CerosIniciales.cerosIniciales("00ABC"));
	}

	@Test
	@DisplayName("Caso Prueba Tres \"input 0ABC00\" \'OUTPUT - 1\'")
	void cadoPruebaTres() {
		assertEquals(1, CerosIniciales.cerosIniciales("0ABC00"));
	}

	@Test
	@DisplayName("Caso Prueba Cuatro \"input 0000\" \'OUTPUT - 4\'")
	void cadoPruebaCuatro() {
		assertEquals(4, CerosIniciales.cerosIniciales("0000"));
	}

	@Test
	@DisplayName("Caso Prueba Cinco \"input 012AB\" \'OUTPUT - 1\'")
	void cadoPruebaCinco() {
		assertEquals(1, CerosIniciales.cerosIniciales("012AB"));
	}

}
