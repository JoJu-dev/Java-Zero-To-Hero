package code.figueroajose.jugs.esiete.ocho;

public class Histograma {

	public static String histograma(int[] arreglo) {
		var histograma = new StringBuilder();

		for (var fila = 0; fila < arreglo.length; ++fila) {
			for (var col = 0; col < arreglo[fila]; ++col) {
				histograma.append("*");

			}
			histograma.append(System.lineSeparator());
		}

		return histograma.toString();
	}
}
