package code.figueroajose.jugs.enueve.cuatro;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class TriánguloTest {

	@Test
	void casoPruebaUno() {
		var longitudUno = new Longitud(1.0);
		var ángulo60 = Ángulo.enCentígrados(60);
		var triánguloEquilatero = new TriánguloBuilder(longitudUno, ángulo60, longitudUno).build();
		
		assertAll(
		() -> assertTrue(triánguloEquilatero.a().equivalente(new Longitud(1.0))),
		() -> assertTrue(triánguloEquilatero.b().equivalente(new Longitud(1.0))),
		() -> assertTrue(triánguloEquilatero.c().equivalente(new Longitud(1.0))),
		() -> assertTrue(triánguloEquilatero.alfa().equivalente(Ángulo.enCentígrados(60.0))),
		() -> assertTrue(triánguloEquilatero.beta().equivalente(Ángulo.enCentígrados(60.0))),
		() -> assertTrue(triánguloEquilatero.gamma().equivalente(Ángulo.enCentígrados(60.0)))
		);

	}

	@Test
	void casoPruebaDos() {
		var longitudUno = new Longitud(1.0);
		var triánguloEquilatero = new TriánguloBuilder(longitudUno, longitudUno, longitudUno).build();
		assertAll(
		() -> assertTrue(triánguloEquilatero.a().equivalente(new Longitud(1.0))),
		() -> assertTrue(triánguloEquilatero.b().equivalente(new Longitud(1.0))),
		() -> assertTrue(triánguloEquilatero.c().equivalente(new Longitud(1.0))),
		() -> assertTrue(triánguloEquilatero.alfa().equivalente(Ángulo.enCentígrados(60.0))),
		() -> assertTrue(triánguloEquilatero.beta().equivalente(Ángulo.enCentígrados(60.0))),
		() -> assertTrue(triánguloEquilatero.gamma().equivalente(Ángulo.enCentígrados(60.0)))
		);
	}
	
	@Test
	void casoPruebaTres() {
		
		var longitudUno = new Longitud(1.0);
		 var ángulo60 = Ángulo.enCentígrados(60);
		 var triánguloEquilatero = new TriánguloBuilder(ángulo60, longitudUno, ángulo60).build();
		 assertAll(
		 () -> assertTrue(triánguloEquilatero.a().equivalente(new Longitud(1.0))),
		 () -> assertTrue(triánguloEquilatero.b().equivalente(new Longitud(1.0))),
		 () -> assertTrue(triánguloEquilatero.c().equivalente(new Longitud(1.0))),
		 () -> assertTrue(triánguloEquilatero.alfa().equivalente(Ángulo.enCentígrados(60.0))),
		 () -> assertTrue(triánguloEquilatero.beta().equivalente(Ángulo.enCentígrados(60.0))),
		 () -> assertTrue(triánguloEquilatero.gamma().equivalente(Ángulo.enCentígrados(60.0)))
		 );
		
	}

}
