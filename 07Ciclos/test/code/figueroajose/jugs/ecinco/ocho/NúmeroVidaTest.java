package code.figueroajose.jugs.ecinco.ocho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NúmeroVidaTest {

	@Test
	@DisplayName("Caso Prueba Uno \"input - 2000, 1, 20\" output - 5")
	void casoPruebaUno() {
		assertEquals(5, NúmeroVida.númeroVida(LocalDate.of(2000, 1, 20)));
	}

	@Test
	@DisplayName("Caso Prueba Dos \"input - 1945, 10 , 31\" output - 6")
	void casoPruebaDos() {
		assertEquals(6, NúmeroVida.númeroVida(LocalDate.of(1945, 10, 31)));
	}
	
	@Test
	@DisplayName("Caso Prueba Uno \"input - 2000, 1, 20\" output - 5")
	void casoPruebaUnoV1() {
		assertEquals(5, NúmeroVida.númeroVidav1(LocalDate.of(2000, 1, 20)));
	}

	@Test
	@DisplayName("Caso Prueba Dos \"input - 1945, 10 , 31\" output - 6")
	void casoPruebaDosV1() {
		assertEquals(6, NúmeroVida.númeroVidav1(LocalDate.of(1945, 10, 31)));
	}

}
