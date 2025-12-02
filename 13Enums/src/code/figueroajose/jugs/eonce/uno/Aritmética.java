package code.figueroajose.jugs.eonce.uno;

public class Aritmética {

	public static TipoNúmero tipoNúmero(int n) {
		var sumaAlicuota = sumaAlícuota(n);
		TipoNúmero resultado;
		if (n == sumaAlicuota) {
			resultado = TipoNúmero.PERFECTO;
		} else if (n < sumaAlicuota) {
			resultado = TipoNúmero.IMPERFECTO;
		} else {
			resultado = TipoNúmero.ABUNDANTE;
		}

		return resultado;

	}

	private static int sumaAlícuota(int n) {
		var suma = 0;
		for (var a = 1; a <= n / 2; ++a) {
			if (esMúltiplo(n, a)) {
				suma += a;
			}
		}
		return suma;
	}

	private static boolean esMúltiplo(int a, int b) {
		return a % b == 0;
	}

}
