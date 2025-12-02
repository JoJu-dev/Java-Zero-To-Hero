package code.figueroajose.jugs.eocho.uno;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AutorTest {

	@Test
	@DisplayName("Caso de Prueba Uno input-('John', 'Doe') output  true")
	void casoPruebaUno() {
		var nombre = "John";
		var apellido = "Doe";
		var johnDoe = new Autor("John", "Doe");
		
		assertAll(
				() -> assertEquals(nombre, johnDoe.nombre()),
				() -> assertEquals(apellido, johnDoe.apellido()),
				() -> assertEquals("Doe, John", johnDoe.toString())
				);
	}
	
	@Test
	@DisplayName("Caso de Prueba Uno input-('Jane', 'Roe') output true")
	void casoPruebaDos() {
		var nombre = "Jane";
		var apellido = "Roe";
		var janeRoe = new Autor("Jane", "Roe");
		
		assertAll(
				() -> assertEquals(nombre, janeRoe.nombre()),
				() -> assertEquals(apellido, janeRoe.apellido()),
				() -> assertEquals("Roe, Jane", janeRoe.toString())
				);
	}
}
