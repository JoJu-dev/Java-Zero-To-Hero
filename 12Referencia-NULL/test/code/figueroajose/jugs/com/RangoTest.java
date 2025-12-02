package code.figueroajose.jugs.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RangoTest {

	@Test
	@DisplayName("Caso #1")
	void CasoPruebaUno() {
		var ceroCeroUnoUno=new Rango(new Coordenada(0,0),new Coordenada(1,1));
		 assertEquals("(0, 0) - (1, 1)",ceroCeroUnoUno.toString());
	}
	
}
