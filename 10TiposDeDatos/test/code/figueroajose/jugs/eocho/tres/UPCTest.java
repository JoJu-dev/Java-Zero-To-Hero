package code.figueroajose.jugs.eocho.tres;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UPCTest {
	
	@Test
	@DisplayName("Caso de Prueba #1 input- (03600024145) output- (036000241457) ")
	void casoPruebaUno() {
		var número = "03600024145";
		var númeroConVerificación = número + "7";
		assertEquals(númeroConVerificación, new UPC(número).número());
	}
	
	@Test
	@DisplayName("Caso de Prueba #2 input- (12345678901) output- (123456789012)")
	void casoPruebaDos() {
		 var número = "12345678901";
		 var númeroConVerificación = número + "2";
		 assertEquals(númeroConVerificación, new UPC(número).número());
	}

}
