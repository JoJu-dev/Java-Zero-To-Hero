package code.figueroajose.jugs.esiete.cuatro;

public class Operar {
	
	public static int[] operar(int[] arreglo) {
		int[] nuevoArreglo = new int[arreglo.length];

		for (int actual = 0; actual < arreglo.length; ++actual) {

			nuevoArreglo[actual] = (((arreglo[actual]) * 3) + 1);

		}

		return nuevoArreglo;
	}
}
