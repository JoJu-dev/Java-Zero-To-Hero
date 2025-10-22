package code.figueroajose.jugs.ecinco.tres;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CuentaPalabrasTest {

	@Test
	@DisplayName("Caso de prueba input : \"one\" resultados esperados : 1")
	void casoDePruebaUno() {
		assertEquals(1, CuentaPalabras.cuentaPalabras("one"));
	}

	@Test
	@DisplayName("Caso de prueba input: \"one two three\" resultados esperados: 3 ")
	void casoDePruebaDos() {
		assertEquals(3, CuentaPalabras.cuentaPalabras("one two three"));
	}

	@Test
	@DisplayName("Caso de prueba input: \"java is fun\" resultados esperados: 3 ")
	void casoDePruebaTres() {
		assertEquals(3, CuentaPalabras.cuentaPalabras("java is fun"));
	}
}
