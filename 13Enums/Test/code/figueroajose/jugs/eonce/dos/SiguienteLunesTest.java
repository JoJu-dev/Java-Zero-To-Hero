package code.figueroajose.jugs.eonce.dos;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SiguienteLunesTest {

	@Test
	@DisplayName("Caso #1")
	void casoPrueba() {
		var fecha = new SiguienteLunes(LocalDate.of(2024, 1, 1));
		assertAll(() -> assertEquals(LocalDate.of(2024, 1, 1), fecha.fecha()),
				() -> assertEquals(LocalDate.of(2024, 1, 8), SiguienteLunes.siguienteLunes(LocalDate.of(2024, 1, 2))),
				() -> assertEquals(LocalDate.of(2024, 1, 8), SiguienteLunes.siguienteLunes(LocalDate.of(2024, 1, 5))),
				() -> assertEquals(LocalDate.of(2025, 12, 1),SiguienteLunes.siguienteLunes(LocalDate.of(2025, 11, 28)))
				);
	}

}
