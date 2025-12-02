package code.figueroajose.jugs.esiete.uno;

public class MasLargo {
	public static int masLargo(String[] arreglo) {
		var indiceTotal = 0;
		for (var tamano = 0; tamano < arreglo.length; ++tamano) {
			for (var tamanoDos = 1; tamanoDos <= arreglo.length; ++tamanoDos) {

				if (arreglo[tamano].length() > arreglo[tamanoDos - 1].length()) {
					indiceTotal = tamano;
				}
			}

		}

		return indiceTotal;
	}
}
