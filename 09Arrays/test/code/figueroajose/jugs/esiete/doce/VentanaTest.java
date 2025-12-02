package code.figueroajose.jugs.esiete.doce;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VentanaTest {

	@Test
	@DisplayName("caso de Prueba #1 input- ventana(e, 3) output-  {{“1”, “2”, “3”},"
			+ " {“4”, “5”, “6”}, {“7”, “8”, “9”},{“10”, null, null}}")
	void casoPruebaUno() {
		var e = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

		assertArrayEquals(new String[][] {{"1", "2", "3"},
			 {"4", "5", "6"},
			 {"7", "8", "9"},
			 {"10", null, null}}, Ventana.ventana(e, 3) );
	}
	
	@Test
	@DisplayName("caso de Prueba #2 input- ventana(e, 5) output- {“1”, “2”, “3”, “4”, “5”},"
			+ " {“6”, “7”, “8”, “9”, “10”}")
	void casoPruebaDos() {
		var e = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

		assertArrayEquals(new String[][] {{"1", "2", "3", "4","5"},
			 {"6", "7", "8", "9", "10"}}, Ventana.ventana(e, 5) );
	}

}
