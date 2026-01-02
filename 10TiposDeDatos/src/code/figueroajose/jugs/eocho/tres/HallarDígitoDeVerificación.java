package code.figueroajose.jugs.eocho.tres;

public class HallarDígitoDeVerificación {

	
	public static int digitoVerificacion(String numero) {
		var sumaDigitosPorPosiciones = sumaNumerosPosiciones(numero);
		var M = encontrandoModuloDeLaSuma(sumaDigitosPorPosiciones);

		var digitoVerificacion = 0;
		switch (M) {
		case 0 -> digitoVerificacion = M;
		default -> digitoVerificacion = (10 - M);
		}
		
		return digitoVerificacion;
	}
	
	public static boolean upcVálido(String numero) {

		var separarElUltimoDigito = separandoElUltimoDigito(numero);
		var sumaDigitosPorPosiciones = sumaNumerosPosiciones(separarElUltimoDigito);
		var M = encontrandoModuloDeLaSuma(sumaDigitosPorPosiciones);

		var digitoVerificacion = 0;
		switch (M) {
		case 0 -> digitoVerificacion = M;
		default -> digitoVerificacion = (10 - M);
		}
		

		return (digitoVerificacion == numeroVerificacion(numero));
	}

	public static int encontrandoModuloDeLaSuma(int suma) {
		return (suma % 10);
	}

	public static int sumaNumerosPosiciones(String n) {
		int suma = 0;
		int sumaPares = 0;
		int sumaImpares = 0;

		for (var indice = 1; indice <= n.length(); ++indice) {

			var numeroActual = n.charAt(indice - 1);

			var numero = Character.digit(numeroActual, 10);
			if (!esPar(indice)) {
				sumaImpares = sumaImpares + numero;
			} else {
				sumaPares = sumaPares + numero;
			}

		}
		suma = (sumaImpares * 3) + sumaPares;

		return suma;
	}

	public static String separandoElUltimoDigito(String numero) {

		return numero.substring(0, numero.length() - 1);
	}

	public static int numeroVerificacion(String numero) {
		var n = numero.substring(numero.length() - 1);
		var convertirAnumeroVerificacion = Integer.parseInt(n);

		return convertirAnumeroVerificacion;
	}
	
	public static boolean esPar(int n) {
		return (n % 2 == 0);
	}
	
}