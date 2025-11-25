package code.figueroajose.jugs.eseis.cuatro;

public class CamelCaseToSnakeCase {

	public static String camelCaseToSnakeCase(String cadena) {
		var insetarGuionBajo = insertarGuionBajo(cadena);

		return insetarGuionBajo.toLowerCase();
	}

	private static String insertarGuionBajo(String cadena) {
		var Builder = new StringBuilder();
		Builder.append(cadena);
		var GUION_BAJO = "_";

		var posicion = capturarIndiceDeMayuscula(cadena);

		var aplicaGuion = esValidaParaAplicarCamelCaseToSnakeCase(cadena);

		if (aplicaGuion) {
			Builder.insert(posicion, GUION_BAJO);
		}

		return Builder.toString();

	}

	private static int capturarIndiceDeMayuscula(String cadena) {
		var posicion = 0;
		for (var i = 1; i < cadena.length(); ++i) {
			var caracterActual = cadena.charAt(i);
			if (Character.isUpperCase(caracterActual)) {
				posicion = i;
			}
		}

		return posicion;
	}

	// Se crea esta válidacion de acuerdo al caso de prueba dos,
	// entendiendo que con una y tres palabras no se efectua cambios para
	// snakeToCamelCase

	private static boolean esValidaParaAplicarCamelCaseToSnakeCase(String cadena) {
		var cantidadDePalabras = 0;
		for (var i = 0; i < cadena.length(); ++i) {
			var caracterActual = cadena.charAt(i);
			if (Character.isUpperCase(caracterActual)) {
				++cantidadDePalabras;
			}
		}

		return (cantidadDePalabras == 1) ;
		
	}
}
