package code.figueroajose.jugs.eonce.tres.dos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MundoTest {

	@Test
	@DisplayName("caso #1")
	void casoPruebaUno() {
		var inicial = new Mundo(5,5,new Coordenada[] {
				 new Coordenada(1, 2),
				 new Coordenada(2, 2),
				 new Coordenada(3, 2),
				 });
		
		assertEquals(new Mundo(5,5,new Coordenada[] {
				 new Coordenada(2, 1),
				 new Coordenada(2, 2),
				 new Coordenada(2, 3),
				 }), inicial.siguienteGeneración());
	}
	
	@Test
	@DisplayName("caso #2")
	void casoPruebaDos() {
		var inicial = new Mundo(6,6,new Coordenada[] {
				 new Coordenada(2, 2),
				 new Coordenada(2, 3),
				 new Coordenada(2, 4),
				 new Coordenada(3, 1),
				 new Coordenada(3, 2),
				 new Coordenada(3, 3),
				 });
				
				 ;
				 assertEquals(new Mundo(6,6,new Coordenada[] {
				 new Coordenada(1, 3),
				 new Coordenada(2, 1),
				 new Coordenada(2, 4),
				 new Coordenada(3, 1),
				 new Coordenada(3, 4),
				 new Coordenada(4, 2),
				 }), inicial.siguienteGeneración());
	}
}
