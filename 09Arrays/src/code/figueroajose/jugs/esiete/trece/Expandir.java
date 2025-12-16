package code.figueroajose.jugs.esiete.trece;

import java.util.Arrays;

public class Expandir {

	//Solución Recomendada
	private static char[][] copiar(char[][] original) {

		var copia = new char[original.length][original[0].length];
		for (var i = 0; i < original.length; ++i) {
			copia[i] = Arrays.copyOf(original[i], original[i].length);
		}
		return copia;
	}

	private static void marcarFila(char[][] matriz, int fila, char c) {

		for (var j = 0; j < matriz[0].length; ++j) {
			if (matriz[fila][j] == ' ') {
				matriz[fila][j] = c;
			}
		}
	}

	private static void marcarColumna(char[][] matriz, int columna, char c) {

		for (var i = 0; i < matriz.length; ++i) {
			if (matriz[i][columna] == ' ') {
				matriz[i][columna] = c;
			}
		}
	}

	public static char[][] expandir(char[][] matriz) {
		var copia = copiar(matriz);
		var c = '.';

		for (var i = 0; i < matriz.length; ++i) {
			for (var j = 0; j < matriz[i].length; ++j) {
				if (matriz[i][j] == '*') {
					marcarColumna(copia,  j, c);
					marcarFila(copia, i, c);
				}
			}
		}

		return copia;
	}


    //primeras verisión 
	public static char[][] expandir_(char[][] array) {

		var pivotetemporal = -1;
		var actualTemporal = -1;
		var posicionTemp = ' ';
		var asignacionTemporal = ' ';
		var patronEncontrado = 0;
		var espacioVacio = 0;
		var tamanoArray = array.length;
		var valorActual = false;
		var recorrido = 0;
		for (var filaPivote = 0; filaPivote < tamanoArray; ++filaPivote) {
			for (var colActul = 0; colActul < tamanoArray; ++colActul) {
				posicionTemp = array[filaPivote][colActul];
				if (posicionTemp == ' ') {
					espacioVacio = 1;
				}
				if ((posicionTemp == '*') && ((pivotetemporal != filaPivote) && (actualTemporal != colActul))
						&& (patronEncontrado == 0) && !valorActual) {
					pivotetemporal = filaPivote;
					actualTemporal = colActul;
					asignacionTemporal = posicionTemp;
					patronEncontrado = 1;
					filaPivote = -1;
					colActul = tamanoArray;
					valorActual = true;
					recorrido = 0;

				} else if ((filaPivote == pivotetemporal || colActul == actualTemporal)
						&& ((posicionTemp != '*') && (posicionTemp != '.')) && (asignacionTemporal != ' ')) {
					array[filaPivote][colActul] = '.';

				}

				if ((recorrido < tamanoArray) && (espacioVacio == 1)) {
					patronEncontrado = 0;

					valorActual = false;
					++recorrido;
					espacioVacio = 0;

				}

			}
		}

		imprimir(array);
		System.out.println("\n");
		return array;
	}

	public static char[][] expandirV1(char[][] array) {
		var pivotetemporal = 0;
		var actualTemporal = 0;
		var posicionTemp = ' ';
		var asignacionTemporal = ' ';
		var patronEncontrado = 0;
		var tamanoArray = array.length;

		for (var filaPivote = 0; filaPivote < tamanoArray; ++filaPivote) {
			for (var colActul = 0; colActul < tamanoArray; ++colActul) {
				posicionTemp = array[filaPivote][colActul];
				if ((posicionTemp == '*') && ((pivotetemporal != filaPivote) && (actualTemporal != colActul))
						&& (patronEncontrado == 0)) {
					pivotetemporal = filaPivote;
					actualTemporal = colActul;
					asignacionTemporal = posicionTemp;
					patronEncontrado = 1; // ->
					filaPivote = -1;
					colActul = tamanoArray;
				} else if ((filaPivote == pivotetemporal || colActul == actualTemporal)
						&& ((posicionTemp != '*') && (posicionTemp != '.')) && (asignacionTemporal != ' ')) {
					array[filaPivote][colActul] = '.';
				}

				if ((filaPivote == (tamanoArray - 1))) {
					patronEncontrado = 0;
				}

			}
		}

		imprimir(array);
		return array;
	}

	private static void imprimir(char[][] array) {

		for (var fila = 0; fila < array.length; ++fila) {
			System.out.print("[");
			for (var columna = 0; columna < array.length; ++columna) {
				System.out.print(" ' ");
				System.out.print(array[fila][columna]);
				System.out.print(" ' ");
			}
			System.out.print("]");
			System.out.println("");
		}

	}

}
