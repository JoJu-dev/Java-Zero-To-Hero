package code.figueroajose.jugs.esiete.ocho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HistogramaTest {

	@Test
	@DisplayName("Caso de Prueba #1 input- (new int[]{5,1,3} output - ( ***** " + "*" + "***")
	void casoDePruebaUno() {

		assertEquals("""
				*****
				*
				***
				""".replace("\n", System.lineSeparator()), Histograma.histograma(new int[] { 5, 1, 3 }));
	}

	@Test
	@DisplayName("Caso de Prueba #2 input- (new int[]{5,1,3} output - ( *** " + " " + "***")
	void casoDePruebaDos() {

		assertEquals("""
				***
				
				***
				""".replace("\n", System.lineSeparator()), Histograma.histograma(new int[] { 3, 0, 3 }));
	}
}
