package code.figueroajose.jugs.esiete.siete;

import java.util.Arrays;

public class Moda {
	// Esta bien que una función ocupe 40 líneas?
	// por ahora, no se me ocurre otra forma.

	public static int moda(int[] arreglo) {
		var nRepetidos = 0;
		var nRepetidosTemporal = 0;
		var moda = 0;
		var modaTemporal = 0;
		var ultimoNumeroEvaluado = 0;
		Arrays.sort(arreglo);
		for (var pivote = 0; pivote < arreglo.length; ++pivote) {
			if (arreglo[pivote] != moda && arreglo[pivote] != ultimoNumeroEvaluado) {
				for (var actual = 0; actual < arreglo.length; ++actual) {
					if ((pivote != actual) && (arreglo[pivote] == arreglo[actual])) {
						modaTemporal = arreglo[pivote];
						++nRepetidosTemporal;
					}
					if ((nRepetidosTemporal > nRepetidos)) {
						moda = modaTemporal;
						nRepetidos = nRepetidosTemporal;
					} else if ((nRepetidosTemporal == nRepetidos) && (moda > modaTemporal)) {
						moda = modaTemporal;
						nRepetidos = nRepetidosTemporal;
					} else if ((nRepetidosTemporal > 0) && (arreglo[pivote] != arreglo[actual])) {
						nRepetidosTemporal = 0;
						modaTemporal = 0;
					}

				}
				ultimoNumeroEvaluado = arreglo[pivote];
			}
		}

		return moda;
	}

}
