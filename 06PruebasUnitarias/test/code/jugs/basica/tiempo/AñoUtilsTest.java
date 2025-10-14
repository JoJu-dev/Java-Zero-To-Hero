package code.jugs.basica.tiempo;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AñoUtilsTest {
	
	@Test
	@DisplayName("identificar si el año 2025 es bisiesto")
	void foo() {
		//assertEquals(false,AñoUtils.esAñoBisiesto(2025)); // (Resultados esperados,argumentos brindados)
		assertFalse(AñoUtils.esAñoBisiesto(2025)); // (Resultados esperados,argumentos brindados)
		
	}

	
	@Test
	@DisplayName("identificar si el año 2024 es bisiesto")
	void foo1() {
		assertEquals(true,AñoUtils.esAñoBisiesto(2024)); // (Resultados esperados,argumentos brindados)
		
	}

}
