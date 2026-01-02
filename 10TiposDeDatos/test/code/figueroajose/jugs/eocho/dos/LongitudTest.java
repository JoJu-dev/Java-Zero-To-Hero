package code.figueroajose.jugs.eocho.dos;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongitudTest {

	@Test
	@DisplayName("Caso de Prueba #1 input- output- ")
	void casoPruebaUno() {
		var measure = 3.14;
		
		assertAll(
				() -> assertEquals(measure,new Longitud(measure).medida(), 0.0), 
				() -> assertEquals(new Longitud(3.0), new Longitud(1.0).sumar(new Longitud(2.0)),"0.0"),
				() -> assertEquals(new Longitud(3.25),new Longitud(0.75).sumar(new Longitud(2.50)),"0.0")
				);		
	}
}
