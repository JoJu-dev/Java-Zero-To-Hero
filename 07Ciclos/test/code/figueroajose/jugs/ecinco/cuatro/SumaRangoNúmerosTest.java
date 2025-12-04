package code.figueroajose.jugs.ecinco.cuatro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SumaRangoNúmerosTest {

	@Test
	@DisplayName("caso de Prueba Uno: \"input - 10,15\" output \"75\"")
	void casoPruebaUno() {
		assertEquals(75, SumaRangoNúmeros.sumaRangosNúmeros(10, 15));
	}
	
	@Test
	@DisplayName("caso de Prueba Dos: \"input - 1,5\" output \"15\"")
	void casoPruebaDos() {
		assertEquals(15, SumaRangoNúmeros.sumaRangosNúmeros(5));
	}
}
