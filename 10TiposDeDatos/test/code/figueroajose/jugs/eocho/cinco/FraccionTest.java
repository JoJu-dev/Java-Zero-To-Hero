package code.figueroajose.jugs.eocho.cinco;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FraccionTest {

	@Test
	@DisplayName("CASO #1 comparar fracciones")
	void casoUno() {

		assertAll(() -> assertEquals(new Fraccion(1, 2), new Fraccion(2, 4)),
				() -> assertEquals(new Fraccion(1, 2), new Fraccion(-1, -2))

		);
	}

	@Test
	@DisplayName("CASO #2 Suma de Fracciones")
	void casoDosSuma() {

		assertAll(() -> assertEquals(new Fraccion(1, 1), new Fraccion(1, 4).sumar(new Fraccion(3, 4))),
				() -> assertEquals(new Fraccion(7, 12), new Fraccion(1, 3).sumar(new Fraccion(1, 4)))

		);

	}

	@Test
	@DisplayName("CASO #3 Resta de Fracciones")
	void casoTresResta() {
		assertAll(() -> assertEquals(new Fraccion(3, 4), new Fraccion(1, 1).restar(new Fraccion(1, 4)))

		);
	}

	@Test
	@DisplayName("CASO #4 Multiplicación de Fracciones")
	void casoCuatroMultiplicación() {
		assertAll(() -> assertEquals(new Fraccion(5, 24), new Fraccion(5, 6).multiplicar(new Fraccion(1, 4)))

		);
	}

	@Test
	@DisplayName("CASO #5 División de Fracciones")
	void casoCuatroDivision() {
		var fra1 = new Fraccion(-1,2);
		var fra2 = new Fraccion(-1, 2);
		System.out.println(fra1.dividir(fra2));
		assertAll(
				() ->  assertEquals(new Fraccion(1, 1), new Fraccion(-1,2).dividir(new Fraccion(-1, 2)))
				
			);
	}
}
