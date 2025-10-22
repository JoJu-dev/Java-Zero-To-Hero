package code.figueroajose.jugs.ecinco.seis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SerieÁrmonicaTest {

	@Test
	@DisplayName("Caso Prueba Uno \"input - 1\" output \"1.0\"")
	void casoPruebaUno() {
		assertEquals(1.0, SerieÁrmonica.serieÁrmonica(1));
	}

	@Test
	@DisplayName("Caso Prueba Dos \"input - 2\" output \"1.5\"")
	void casoPruebaDos() {
		assertEquals(1.5, SerieÁrmonica.serieÁrmonica(2));
	}

	@Test
	@DisplayName("Caso Prueba Tres \"input - 4\" output \"2.0833\"")
	void casoPruebaTres() {
		assertEquals(2.0833, SerieÁrmonica.serieÁrmonica(4), 1e-4);
	}
}
