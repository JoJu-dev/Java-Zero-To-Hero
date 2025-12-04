package code.figueroajose.jugs.ecinco.nueve;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PatronAjedrezTest {
	@Test
	@DisplayName("Caso prueba uno")
	void casoPruebaUnoPatrónRecomendado() {

		assertEquals("""
				*.*
				.*.
				*.*
				""", PatronAjedrez.patronAjedrez(3));

	}

	@Test
	@DisplayName("Caso prueba uno")
	void casoPruebaDosPatrónRecomendado() {

		assertEquals("""
				*.*
				.*.
				*.*
				""", PatronAjedrez.patronAjedrez(3));

	}


	@DisplayName("Caso prueba uno")
	void casoPruebaUno() {

		assertEquals("""
				*.*
				.*.
				*.*
				""", PatronAjedrez.patronAjedrez(3));

	}
	@Test
	@DisplayName("Caso de prueba Dos")
	void casoPruebaDos() {
		assertEquals("""
				*.*.*.
				.*.*.*
				*.*.*.
				.*.*.*
				*.*.*.
				.*.*.*
				""", PatronAjedrez.patronAjedrez(6));
	}

}
