package code.figueroajose.jugs.eseis.uno;
import code.figueroajose.jugs.operacionesmatematicas.EsPar;
public class EsPrimo {

	public static boolean esPrimo(int numero) {
		if (((numero % numero) == 0) && ((numero % 1) == 0) && (!EsPar.esPar(numero)) && (numero != 1)) {
			return true;
		} else {
			return false;
		}
	}

	
}
