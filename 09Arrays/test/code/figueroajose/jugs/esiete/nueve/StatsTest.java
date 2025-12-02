package code.figueroajose.jugs.esiete.nueve;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StatsTest {
	@Test
	@DisplayName("Caso prueba #1 input- (new int[]{3}) outout - (new int[]{0,0,0,1,0,0}) ")
	void casoPruebaUno() {
		assertArrayEquals(new int[]{0,0,0,1,0,0}, Stats.stats(new int[]{3}));
	}

	@Test
	@DisplayName("Caso prueba #2 input- (new int[]{2,2}) outout - (new int[]{0,0,2,0,0,0}) ")
	void casoPruebaDos() {
		assertArrayEquals(new int[] {0, 0, 2, 0, 0, 0}, Stats.stats(new int[] {2, 2}));
	}

}
