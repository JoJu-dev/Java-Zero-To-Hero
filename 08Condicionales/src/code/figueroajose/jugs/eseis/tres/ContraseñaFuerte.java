package code.figueroajose.jugs.eseis.tres;

public class ContraseñaFuerte {

	public static boolean contraseñaFuerte(String password) {
		return (almenosUnaMayuscula(password) && almenosUnDigito(password) && almenosCaracterNoAlfanunerico(password)
				&& almenosOchoCaracteres(password));
	}

	private static boolean almenosOchoCaracteres(String cadena) {
		var tamanio = cadena.length();

		return switch (tamanio) {
		case 8, 9, 10, 11, 12, 13, 14, 15, 16 -> true;
		default -> false;
		};
	}

	private static boolean almenosCaracterNoAlfanunerico(String cadena) {

		var cantidadCaracteres = 0;

		for (var caracter = 0; caracter < cadena.length(); ++caracter) {
			var caracterActual = cadena.charAt(caracter);

			if (!Character.isLetterOrDigit(caracterActual)) {
				++cantidadCaracteres;
			}
		}

		return (cantidadCaracteres > 0);
	}

	private static boolean almenosUnDigito(String cadena) {

		var cantidadCaracteres = 0;

		for (var caracter = 0; caracter < cadena.length(); ++caracter) {
			var caracterActual = cadena.charAt(caracter);

			if (Character.isDigit(caracterActual)) {
				++cantidadCaracteres;
			}
		}

		return (cantidadCaracteres > 0);
	}

	private static boolean almenosUnaMayuscula(String contraseña) {
		var cantidadCaracteres = 0;

		for (var caracter = 0; caracter < contraseña.length(); ++caracter) {
			var caracterActual = contraseña.charAt(caracter);

			if (Character.isUpperCase(caracterActual)) {
				++cantidadCaracteres;
			}

		}

		return (cantidadCaracteres > 0);

	}

}
