package code.figueroajose.jugs.esiete.once;


import code.figueroajose.jugs.esiete.diez.MatrizCuadrada;

public class MatrizCuadradaContraria {

	public static int[][] m2(int tamano) {
		var matriz = MatrizCuadrada.m(tamano);
		var matrizInversa = new int[tamano][tamano];
		var col = 0;
		var fila = 0;
		for (var filaInversa = 0; filaInversa < tamano && fila < tamano; ++filaInversa) {
			for (var columnaInversa = tamano - 1; columnaInversa >= 0 && col < tamano; --columnaInversa) {

				matrizInversa[filaInversa][columnaInversa] = matriz[fila][col];
				++col;
			}
			col = 0;
			++fila;
		}

		return matrizInversa;
	}
}
