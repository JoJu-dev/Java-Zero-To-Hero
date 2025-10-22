package code.figueroajose.jugs.ecinco.uno;

public class Reversar {

	// E5.1

	// Escribe una funcion que reciba un String reverse
	public static String reversar(String cadena) {
		var builder = new StringBuilder();

		for (var caracter = cadena.length() - 1; caracter >= 0; --caracter) {

			var cadenaRevesa = cadena.charAt(caracter);
			builder.append(cadenaRevesa);
		}

		return builder.toString();
	}

}
