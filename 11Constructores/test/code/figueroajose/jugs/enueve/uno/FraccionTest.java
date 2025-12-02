package code.figueroajose.jugs.enueve.uno;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.figueroajose.jugs.enueve.uno.Fraccion;

public class FraccionTest {

	@Test
	@DisplayName("Caos #1 Comparar igualdad en los constructores")
	void pruebaUnoEquals() {
		assertAll( 
		() -> assertEquals(new Fraccion(2,1), new Fraccion(2)),
		() -> assertThrows(IllegalArgumentException.class,()-> new Fraccion(1,0))
		);
	}
}
