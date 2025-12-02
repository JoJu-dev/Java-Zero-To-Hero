package code.figueroajose.jugs.esiete.trece;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExpandirTest {
	@Test
	@DisplayName("Caso Prueba #1 input- { ' ', ' ', ' ' }, { ' ', '*', ' ' }, { ' ', ' ', ' ' }"
			+ "  output- { ' ', '.', ' ' }, { '.', '*', '.' }, { ' ', '.', ' ' }")
	void casoPruebaUno() {
		char[][] inicial = { { ' ', ' ', ' ' }, { ' ', '*', ' ' }, { ' ', ' ', ' ' } };
		char[][] esperado = { { ' ', '.', ' ' }, { '.', '*', '.' }, { ' ', '.', ' ' } };
		assertArrayEquals(esperado, Expandir.expandir(inicial));

	}

	@Test
	@DisplayName("Caso Prueba #2 input-{ '*', ' ', '*' }, { ' ', ' ', ' ' }, { '*', ' ', '*' }"
			+ "  output- { '*', '.', '*' }, { '.', ' ', '.' }, { '*', '.', '*' }")
	void casoPruebaDos() {
		char[][] inicial = { { '*', ' ', '*' }, { ' ', ' ', ' ' }, { '*', ' ', '*' } };
		char[][] esperado = { { '*', '.', '*' }, { '.', ' ', '.' }, { '*', '.', '*' } };
		assertArrayEquals(esperado, Expandir.expandir(inicial));

	}

}
