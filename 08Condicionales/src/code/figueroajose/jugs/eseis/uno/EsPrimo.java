package code.figueroajose.jugs.eseis.uno;
import code.figueroajose.jugs.operacionesmatematicas.EsPar;

public class EsPrimo {

	public static boolean esPrimo1(int numero) {
		return (((numero % numero) == 0) && ((numero % 1) == 0) 
				&& (!EsPar.esPar(numero)) && (numero != 1));

	}

	private static boolean esMultiplo(int a, int b) {

		return (a % b) == 0;
	}

	private static boolean esMúltiplo(int a, int b) {

		return (a % b) == 0;

	}

	public static boolean esPrimo(int n) {

		if (n == 1) {
			return false;
		}

		for (var x = 2; x < n; ++x) {
			if (esMúltiplo(n, x)) {
				return false;
			}
		}
		return true;
	}

}
