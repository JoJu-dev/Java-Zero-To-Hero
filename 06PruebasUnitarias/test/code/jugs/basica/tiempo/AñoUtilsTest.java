package code.jugs.basica.tiempo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AñoUtilsTest {
	
	@Test
	@DisplayName("identificar si el año 2025 es bisiesto")
	void foo() {

		assertFalse(AñoUtils.esAñoBisiesto(2025)); // (Resultados esperados,argumentos brindados)
		
	}

	
	@Test
	@DisplayName("identificar si el año 2024 es bisiesto")
	void foo1() {
		assertEquals(true,AñoUtils.esAñoBisiesto(2024)); // (Resultados esperados,argumentos brindados)
		
	}

}
