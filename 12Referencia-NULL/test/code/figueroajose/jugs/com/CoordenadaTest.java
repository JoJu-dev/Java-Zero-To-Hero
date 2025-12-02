package code.figueroajose.jugs.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordenadaTest {

	@Test
	@DisplayName("Caso #1 input -new Coordenada(1,3) output 1 - 3")
	void CadoPruebaUno() {
		var unoTres = new Coordenada(1, 3);
		assertEquals(1, unoTres.hilera());
		assertEquals(3, unoTres.columna());
	}

	@Test
	@DisplayName("Caso #2 input -new Coordenada(1,3) output 1 - 3")
	void CadoPruebaDos() {
		var unoTres = new Coordenada(1, 3);
		assertEquals(1, unoTres.hilera());
		assertEquals(3, unoTres.columna());
	}
	
	
	@Test
	@DisplayName("Caso #3 input -new Coordenada(1,3) output 2 - 4")
	void CadoPruebaTres() {
		var unoTres = new Coordenada(1, 3);
		 var dosCuatro = unoTres.desplazar(1, 1);
		 assertEquals(2, dosCuatro.hilera());
		 assertEquals(4, dosCuatro.columna());
	}
}
