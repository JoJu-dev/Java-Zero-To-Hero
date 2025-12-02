package code.figueroajose.jugs.enueve.dos;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NúmeroSecretoTest {

	@Test
	@DisplayName("Caso #1")
	void casoPruebaUno() {
		var _1234 = new NúmeroSecreto("1234");
		assertAll(
		() ->assertEquals(1, _1234.picas("9374")),
		() ->assertEquals(1, _1234.fijas("9374")),
		()-> assertEquals(0, _1234.picas("9876")),
		()-> assertEquals(0, _1234.fijas("9876")),
		()-> assertEquals(4, _1234.fijas("1234")),
		()-> assertEquals(4, _1234.picas("4321")),
		()-> assertEquals(0, _1234.fijas("4321"))
);
	}
}
