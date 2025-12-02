package code.figueroajose.jugs.esiete.diez;

public class MatrizCuadrada {

	public static int[][] m(int tamano) {
		var matriz = new int[tamano][tamano];
		var n = 0;
		for (var fila = 0; fila < tamano; ++fila) {
			for (var columna = 0; columna < tamano; ++columna) {
				
				if(matriz[fila] == matriz[columna]) {
					matriz[fila][columna] = 1;
				}else {
				matriz[fila][columna] = n;
				}
				
			}
		}

		return matriz;
	}

}
