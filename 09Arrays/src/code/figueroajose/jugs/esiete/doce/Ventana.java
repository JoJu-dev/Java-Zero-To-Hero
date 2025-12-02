package code.figueroajose.jugs.esiete.doce;

public class Ventana {

	public static String[][] ventana(String[] arreglo, int tamano) {
		float tamanoArreglo = arreglo.length;
		float tamanoFloat = tamano;
		int techo = (int) Math.ceil(tamanoArreglo / tamanoFloat);
		var nuevoArreglo = new String[techo][tamano];
		var pivoteArreglo = 0;
		for (var fila = 0; fila < techo; ++fila) {
			for (var columna = 0; (columna < tamano) && (pivoteArreglo < tamanoArreglo); ++columna) {
				nuevoArreglo[fila][columna] = arreglo[pivoteArreglo];
				++pivoteArreglo;
			}
		}
		return nuevoArreglo;

	}
}
