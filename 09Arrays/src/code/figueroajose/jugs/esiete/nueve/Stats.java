package code.figueroajose.jugs.esiete.nueve;

public class Stats {

	public static int[] stats(int[] arreglo) {

		var vecesRepetidas = 0;
		var posicion = 0;

		if (arreglo.length == 1) {
			posicion = arreglo[0];
			vecesRepetidas = 1;
		} else {
			posicion = arreglo[0];
			vecesRepetidas = arreglo[1];
		}

		var arregloNuevo = new int[] { 0, 0, 0, 0, 0, 0 };

		for (var fila = 0; fila < arregloNuevo.length; ++fila) {

			if (fila == posicion) {
				arregloNuevo[posicion] = vecesRepetidas;
			}
		}

		return arregloNuevo;
	}

}
