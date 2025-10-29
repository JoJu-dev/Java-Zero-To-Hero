package code.figueroajose.jugs.esesi.uno;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.figueroajose.jugs.eseis.uno.EsPrimo;

public class EsPrimoTest {

	@Test
	@DisplayName("Caso de prueba uno Input: 1 output: false")
	void casoPruebaUno() {
		assertFalse(EsPrimo.esPrimo(1));
	}
	
	@Test
	@DisplayName("Caso de prueba Dos Input: 7 output: true")
	void casoPruebaDos() {
		assertTrue(EsPrimo.esPrimo(7));
	}
	
	@Test
	@DisplayName("Caso de prueba Tres Input: 100 output: false")
	void casoPruebaTres() {
		assertFalse(EsPrimo.esPrimo(100));
	}
}
