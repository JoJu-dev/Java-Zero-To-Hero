package code.figueroajose.jugs.esiete.siete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.figueroajose.jugs.esiete.siete.Moda;

public class ModaTest {

	@Test
	@DisplayName("caso de Prueba #1 input- (new int[]{3, 2, 4, 2, 1}) output- 2")
	void casoDePruebaUno() {
		assertEquals(2, Moda.moda(new int[] { 3, 2, 4, 2, 1 }));
	}

	@Test
	@DisplayName("caso de Prueba #2 input- (new int[]{1, 2, 4, 2, 1}) output- 1")
	void casoDePruebaDos() {
		assertEquals(1, Moda.moda(new int[] { 1, 2, 4, 2, 1 }));
	}

	@Test
	@DisplayName("caso de Prueba #3 input- (new int[]{1,1,1,1,2,2,3,4,4,4,4}) output- 1")
	void casoDePruebaTres() {
		assertEquals(1, Moda.moda(new int[] { 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4 }));
	}

	@Test
	@DisplayName("caso de Prueba #4 input- (new int[]{1,1,1,1,2,2,3,4,4,4,4,4}) output- 4")
	void casoDePruebaCuatro() {
		assertEquals(4, Moda.moda(new int[] { 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4 }));
	}
}
