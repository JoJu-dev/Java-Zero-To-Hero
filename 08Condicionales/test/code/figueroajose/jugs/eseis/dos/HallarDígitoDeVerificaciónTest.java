package code.figueroajose.jugs.eseis.dos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HallarDígitoDeVerificaciónTest {

	@Test
	@DisplayName("caso de Prueba 1 input -> 116 output -> true")
	void casoPruebaUno() {
		assertTrue(HallarDígitoDeVerificación.upcVálido("116"));
	}

	@Test
	@DisplayName("caso de Prueba #2 input -> 111 output -> false")
	void casoPruebaDos() {
		assertFalse(HallarDígitoDeVerificación.upcVálido("111"));
	}

	@Test
	@DisplayName("caso de Prueba #3 input -> 019 output -> true")
	void casoPruebaTres() {
		assertTrue(HallarDígitoDeVerificación.upcVálido("019"));
	}

	@Test
	@DisplayName("caso de Prueba #4 input -> 107 output -> true")
	void casoPruebaCuatro() {
		assertTrue(HallarDígitoDeVerificación.upcVálido("107"));
	}

	@Test
	@DisplayName("caso de Prueba #5 input -> 240 output -> true")
	void casoPruebaCinco() {
		assertTrue(HallarDígitoDeVerificación.upcVálido("240"));
	}

	@Test
	@DisplayName("caso de Prueba #6 input -> 036000241457 output -> true")
	void casoPruebaSeis() {
		assertTrue(HallarDígitoDeVerificación.upcVálido("036000241457"));
	}
}
