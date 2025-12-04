package code.figueroajose.jugs.ecinco.diez;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.figueroajose.jugs.ecinco.diez.Coordenadas;

public class CoordenadasTest {
	//R: recomendadas
	@Test
	@DisplayName("Caso Prueba Uno: input - 3 output - \"|(1, 1)|(1, 2)|(2, 1)|(2, 2)|\"")
	void casoPruebaUnoCoordenadasR() {
		assertEquals("|(1, 1)|(1, 2)|(2, 1)|(2, 2)|", Coordenadas.coordenadas(2));
		
	}

	@Test
	@DisplayName("Caso Prueba Dos: input - 3 output - \"|(1, 1)|(1, 2)|(2, 1)|(2, 2)|\"")
	void casoPruebaDosCoordenadasR() {
		assertEquals("|(1, 1)|(1, 2)|(1, 3)|(2, 1)|(2, 2)|(2, 3)|(3, 1)|(3, 2)|(3, 3)|", Coordenadas.coordenadas(3));
		
	}
	@Test
	@DisplayName("Caso Prueba Uno: input - 3 output - \"|(1, 1)|(1, 2)|(2, 1)|(2, 2)|\"")
	void casoPruebaUno() {
		assertEquals("|(1, 1)|(1, 2)|(2, 1)|(2, 2)|", Coordenadas.coordenadas(2));
		
	}

	@Test
	@DisplayName("Caso Prueba Dos: input - 3 output - \"|(1, 1)|(1, 2)|(2, 1)|(2, 2)|\"")
	void casoPruebaDos() {
		assertEquals("|(1, 1)|(1, 2)|(1, 3)|(2, 1)|(2, 2)|(2, 3)|(3, 1)|(3, 2)|(3, 3)|", Coordenadas.coordenadas(3));
		
	}
}
