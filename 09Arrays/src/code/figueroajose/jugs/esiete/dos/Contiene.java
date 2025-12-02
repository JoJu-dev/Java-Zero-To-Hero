package code.figueroajose.jugs.esiete.dos;

public class Contiene {
	public static boolean contiene(String[] arreglo, String cadena) {
		var contiene = false;

		for (var actual = 0; actual < arreglo.length; ++actual) {

			if (cadena.equals(arreglo[actual])) {
				contiene = true;
			}
		}
		return contiene;
	}
}
