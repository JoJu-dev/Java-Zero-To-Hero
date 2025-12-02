package code.figueroajose.jugs.esiete.tres;

public class Buscar {
	public static int buscar(int[] arreglo) {
		var ultimoElemento = -1;

		for (var indice = 0; indice < arreglo.length; ++indice) {
			if ((arreglo[indice] > 0) && (arreglo[indice] < 10)) {
				ultimoElemento = indice;
			}
		}

		return ultimoElemento;
	}
}
