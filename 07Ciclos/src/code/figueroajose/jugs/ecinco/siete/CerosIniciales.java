package code.figueroajose.jugs.ecinco.siete;

public class CerosIniciales {


	public static int cerosIniciales(String cadena) {
		var numeroDeCeros = 0;
		var indice = 0;
		for (indice = 0; indice < cadena.length() && isCero(cadena.charAt(indice)); indice++) {

			var caracter = cadena.charAt(indice);
			numeroDeCeros += (Character.isDigit(caracter)) ? 1 : 0;

		}
		return numeroDeCeros;
	}
	
	private static boolean isCero(char c) {
		return (c == '0');
	}

}
