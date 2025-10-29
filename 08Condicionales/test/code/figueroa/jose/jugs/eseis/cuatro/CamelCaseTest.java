package code.figueroa.jose.jugs.eseis.cuatro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import code.figueroajose.jugs.eseis.cuatro.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {
	@Test
	@DisplayName("Caso de Prueba #1 (snakeCaseToCamelCase) input: hola_mundo - output: holaMundo ")
	void casoPruebaUno() {
		assertEquals("holaMundo", SnakeCaseToCamelCase.snakeCaseToCamelCase("hola_mundo"));
	}

	@Test
	@DisplayName("Caso de Prueba #2 (snakeCaseToCamelCase) input: unoDosTres - output: unoDosTres ")
	void casoPruebaDos() {
		assertEquals("unoDosTres", SnakeCaseToCamelCase.snakeCaseToCamelCase("unoDosTres"));
	}
	
	@Test
	@DisplayName("Caso de Prueba #3 (snakeCaseToCamelCase) input: identificador - output: identificador ")
	void casoPruebaTres() {
		assertEquals("identificador", SnakeCaseToCamelCase.snakeCaseToCamelCase("identificador"));
	}
	

	@Test
	@DisplayName("Caso de Prueba #4 (camelCaseToSnakeCase) input:  últimoDígito - output: último_dígito ")
	void casoPruebaCuatro() {
		assertEquals("último_dígito", CamelCaseToSnakeCase.camelCaseToSnakeCase("últimoDígito"));
	}
	
	@Test
	@DisplayName("Caso de Prueba #5 (camelCaseToSnakeCase) input:  esVocal - output: es_vocal ")
	void casoPruebaCinco() {
		assertEquals("es_vocal", CamelCaseToSnakeCase.camelCaseToSnakeCase("esVocal"));
	}
}
