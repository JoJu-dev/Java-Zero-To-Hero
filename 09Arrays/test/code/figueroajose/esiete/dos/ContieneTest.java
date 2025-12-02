package code.figueroajose.esiete.dos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.figueroajose.jugs.esiete.dos.Contiene;

public class ContieneTest {

	@Test
	@DisplayName("Caso de Prueba #1 input - (new Streng[]{'a','b','c'}, 'b') output - true")
	void casoPruebaUno() {

		assertEquals(true, Contiene.contiene(new String[] { "a", "b", "c" }, "b"));
	}

	@Test
	@DisplayName("Caso de Prueba #2 input - (new Streng[]{'a','b','c'}, '1') output - false")
	void casoPruebaDos() {

		assertEquals(false, Contiene.contiene(new String[] { "a", "b", "c" }, "1"));
	}
}
