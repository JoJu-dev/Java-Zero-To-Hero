package code.figueroajose.jugs.com;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.figueroajose.jugs.eonce.uno.Aritmética;
import code.figueroajose.jugs.eonce.uno.TipoNúmero;

public class TipoNúmeroTest {
 
	@Test
	@DisplayName("Caso de Prueba #1")
	void casoPruebaUno() {
		 assertAll(
				 ()->assertEquals(TipoNúmero.PERFECTO,Aritmética.tipoNúmero(6),"6 es número perfecto"),
				 ()->assertEquals(TipoNúmero.PERFECTO,Aritmética.tipoNúmero(28),"28 es número perfecto"),
				 ()->assertEquals(TipoNúmero.ABUNDANTE ,Aritmética.tipoNúmero(9),"9 es númeroabundante"),
				 ()->assertEquals(TipoNúmero.ABUNDANTE,Aritmética.tipoNúmero(15),"15 es número abundante"),
				 ()->assertEquals(TipoNúmero.IMPERFECTO,Aritmética.tipoNúmero(12),"12 es número imperfecto"),
				 ()->assertEquals(TipoNúmero.IMPERFECTO,Aritmética.tipoNúmero(18),"18 es número imperfecto")
				 );
		 // Nota cambie las assert equals de abundante e imperfecto.
	}
}
