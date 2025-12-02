package code.figueroajose.jugs.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SopaDeLetrasTest {

	 private static final String[] board = {
			 "VBREEFISHRACHP",
			 "ANACROCODILEEB",
			 "AOSTRICHTEGRDA",
			 "IADDHCHEETAHGD",
			 "BHRODRAVENENEG",
			 "EYWDLSAMOLELHE",
			 "ARTPVPRCBOLROR",
			 "RHTOAAHCROWAGH",
			 "CCANNORIAZEBRA",
			 "HANYTAEKNINAWA"
			 };
	
	
	@Test
	@DisplayName("Caso prueba #1 enviando Coordenadas")
	void CasoPruebaUno() {
	  var juego  = new SopaDeLetras(10, 14, board);
	  assertEquals(new Rango(new Coordenada(0, 5), new Coordenada(0, 8)), juego.buscar("FISH"));
	}
	
	@Test
	@DisplayName("casoPrueba 2")
	void casoPruebaDos() {
		  var juego  = new SopaDeLetras(10, 14, board);
		  assertEquals(new Rango(new Coordenada(0, 1), new Coordenada(2, 3)), juego.buscar("BAT") );	
	}
	
	@Test
	@DisplayName("casoPrueba #3")
	void casoPruebaTres() {
		  var juego  = new SopaDeLetras(10, 14, board);
		  assertEquals(new Rango(new Coordenada(0, 12), new Coordenada(7, 12)), juego.buscar("hedgehog") );	
	}
}
