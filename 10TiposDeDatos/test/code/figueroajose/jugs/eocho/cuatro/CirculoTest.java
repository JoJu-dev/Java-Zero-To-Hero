package code.figueroajose.jugs.eocho.cuatro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class CirculoTest {

	@Test
	@DisplayName("Caso de Prueba #1")
	void casoDePruenaUno() {
		assertEquals(Math.PI, new Circulo(new Punto(0.0, 0.0), 1.0).área(), 1e-3);
	}

	@Test
	@DisplayName("Caso de Prueba #2")
	void casoDePruenaDos() {
		assertEquals(12.566, new Circulo(new Punto(3.0, 4.0), 2.0).área(), 1e-3);
	}

	@Test
	@DisplayName("Caso de Prueba #3")
	void casoDePruenaTres() {
		assertEquals(Math.PI * 2.0, new Circulo(new Punto(0.0, 0.0), 1.0).circunferencia(), 1e-3);

	}

	@Test
	@DisplayName("Caso de Prueba #4")
	void casoDePruenaCuatro() {
		assertEquals(12.566, new Circulo(new Punto(0.0, 0.0), 2.0).circunferencia(), 1e-3);
	}

	@Test
	@DisplayName("Caso de Prueba #5")
	void casoDePruenaCinco() {
		assertAll(() -> assertEquals(new Circulo(new Punto(1.0, 2.0), 3.0), (new Circulo(new Punto(1.0, 2.0), 3.0))),
				() -> assertNotEquals(new Circulo(new Punto(0.0, 0.0), 1.0), (new Circulo(new Punto(0.0, 1.0), 1.0))),
				() -> assertNotEquals(new Circulo(new Punto(0.0, 0.0), 1.0), (new Circulo(new Punto(1.0, 0.0), 1.0))),
				() -> assertNotEquals(new Circulo(new Punto(0.0, 0.0), 1.0), (new Circulo(new Punto(0.0, 0.0), 2.0))));
	}

	@Test
	@DisplayName("Caso de Prueba #6")
	void casoDePruenaSeis() {
		var ceroCero = new Circulo(new Punto(0.0, 0.0), 1.0);
		var unoCero = new Circulo(new Punto(1.0, 0.0), 1.0);
		assertTrue(ceroCero.seInterceptan(unoCero));

	}

	@Test
	@DisplayName("Caso de Prueba #7")
	void casoDePruenaSiete() {
		var ceroCero=new Circulo(new Punto(0.0,0.0),1.0);
		 var dosDos=new Circulo(new Punto(2.0,2.0),1.0);
		 assertFalse(ceroCero.seInterceptan(dosDos));

	}
}
