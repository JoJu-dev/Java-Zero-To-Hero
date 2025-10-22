package code.figueroajose.jugs.ecinco.dos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ConteoTest {

	@Test
	@DisplayName("Caso de prueba con las entradas: \'abracadabra\'  y  \'abr\'  resultado esperado 2")
	void casoPruebaUno() {
		assertEquals(2, Conteo.conteo("abracadabra", "abr"));
	}

	@Test
	@DisplayName("Caso de Prueba  entrada \"110101110101100\", \"01\" resultado esperado 4")
	void casoDePruebaDos() {
		assertEquals(4, Conteo.conteo("110101110101100", "01"));
	}

	@Test
	@DisplayName("Caso de prueba \"xoxox\" y \"x\" resultado esperado 3")
	void casoDePruebaTres() {
		assertEquals(3, Conteo.conteo("xoxox", "x"));
	}

	@Test
	@DisplayName("Caso de prueba \"sssa\" y \"ss\" resultados esperados 1")
	void casoDePruebaCustro() {
		assertEquals(1, Conteo.conteo("sssa", "sa"));

	}

}
