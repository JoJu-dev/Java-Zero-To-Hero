package code.figueroajose.jugs.esiete.seis;

public class SegundoMayor {

	// Duda: en esta ejercicio SegundoMayor presente dos soluciones
	// Qué solución es la correcta para implementación?
	// Lo que pienso:
	// La solución se segundoMayor personalmente me facilita la abstracción del problema.
	// la solución otraSolucion creo que utiliza menos recursos porque hace menos
	// recorridos para buscar la solución (optimiza mejor los tiempos y recursos).

	public static int otraSolucion(int[] arreglo) {
		var elementoMayor = 0;
		var segundoMayor = 0;

		for (var pivote = 0; pivote < arreglo.length; ++pivote) {

			if ((arreglo[pivote] > segundoMayor) && (arreglo[pivote] < elementoMayor)) {
				segundoMayor = arreglo[pivote];
			} else {
				elementoMayor = arreglo[pivote];
			}
		}
		return segundoMayor;
	}

	public static int segundoMayor(int[] arreglo) {
		var segundoMayor = 0;
		var elementoMayor = elementoMayor(arreglo);

		for (var pivote = 0; pivote < arreglo.length; ++pivote) {

			if ((arreglo[pivote] > segundoMayor) && (arreglo[pivote] < elementoMayor)) {
				segundoMayor = arreglo[pivote];
			}
		}

		return segundoMayor;
	}

	public static int elementoMayor(int[] arreglo) {
		var elementoMayor = 0;
		for (var pivote = 0; pivote < arreglo.length; ++pivote) {

			if (arreglo[pivote] > elementoMayor) {
				elementoMayor = arreglo[pivote];
			}
		}

		return elementoMayor;
	}

}
