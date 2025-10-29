package code.figueroajose.jugs.eseis.tres;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContraseñaFuerteTest {

	@Test
	@DisplayName("Caso de prueba #1 input -> Abc123$_ output -> true ")
	void casoPruebaUno() {
		assertTrue(ContraseñaFuerte.contraseñaFuerte("Abc123$_"));
	}

	@Test
	@DisplayName("Caso de prueba #2 input -> Abc12345  output -> false ")
	void casoPruebaDos() {
		assertFalse(ContraseñaFuerte.contraseñaFuerte("Abc12345"));
	}

	@Test
	@DisplayName("Caso de prueba #3 input -> abc123$_  output -> false ")
	void casoPruebaTres() {
		assertFalse(ContraseñaFuerte.contraseñaFuerte("abc123$_"));
	}

	@Test
	@DisplayName("Caso de prueba #4 input -> Abcdef$_  output -> false ")
	void casoPruebaCuatro() {
		assertFalse(ContraseñaFuerte.contraseñaFuerte("Abcdef$_"));
	}
	
	@Test
	@DisplayName("Caso de prueba #5 input -> ABC123$_ output -> true ")
	void casoPruebaCinco() {
		assertTrue(ContraseñaFuerte.contraseñaFuerte("ABC123$_"));
	}
}
