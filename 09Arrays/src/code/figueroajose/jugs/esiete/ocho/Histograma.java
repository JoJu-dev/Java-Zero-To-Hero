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
	
	
	//Usando Repeat, Solución brindada.
	String histograma_(int[] datos) {

		  var builder = new StringBuilder();

		  for (var e : datos) {

		    builder.append("*".repeat(e));

		    builder.append(System.lineSeparator());

		  }

		  return builder.toString();

		}
}
