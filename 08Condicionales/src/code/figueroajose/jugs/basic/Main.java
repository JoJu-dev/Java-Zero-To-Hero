package code.figueroajose.jugs.basic;

public class Main {

	public static void main(String[] args) {

		System.out.println(esValidaParaAplicarSnakeCamelCase("holaMundo"));
		System.out.println(snakeToCamelCase("últimoDígito"));
		System.out.println("indice de Guion " + capturarIndiceGuionBajo("hola_mundo"));
		System.out.println("->"+snakeCaseToCamelCase("últimoDígito"));
	}

	
	
	public static String snakeCaseToCamelCase(String cadena) {
		var existeGuionBajo = existeGuionBajo(cadena);
		var cadenaDeRetorno = cadena;;
		if (existeGuionBajo) {
			var agregarMayuscula = agregarMayuscula(cadena);
			var eliminarGuion = eliminarGuion(agregarMayuscula);
			cadenaDeRetorno = eliminarGuion;
		}
		
		return cadenaDeRetorno;
	}
	public static String eliminarGuion(String cadena) {
	      var builder = new StringBuilder(cadena);
	      builder.deleteCharAt(capturarIndiceGuionBajo(cadena));  
	    
	      return builder.toString();
	}
	
	public static String agregarMayuscula(String cadena) {
		var indiceActual = capturarIndiceGuionBajo(cadena) + 1 ;
		var obtenerLetra = cadena.charAt(indiceActual);
		
		return cadena.replace(obtenerLetra, Character.toUpperCase(obtenerLetra));

	}

	public static int capturarIndiceGuionBajo(String cadena) {
		var indiceDeGuion = 0;
		var GUION_BAJO = '_';

		for (var indice = 0; indice < cadena.length(); ++indice) {
			var caracterActual = cadena.charAt(indice);
			if (caracterActual == GUION_BAJO) {
				indiceDeGuion = indice;
			}
		}

		return indiceDeGuion;
	}

	public static boolean existeGuionBajo(String cadena) {
		var contador = 0;
		for (int i = 0; i < cadena.length(); ++i) {
			var caracterActual = cadena.charAt(i);
			if (caracterActual == '_') {
				++contador;
			}

		}

		return switch (contador) {
		case 1 -> true;
		default -> false;
		};
	}

	// ------------------------------------------

	public static String snakeToCamelCase(String cadena) {
		var insetarGuionBajo = insertarGuionBajo(cadena);

		return insetarGuionBajo.toLowerCase();
	}

	public static String insertarGuionBajo(String cadena) {
		var Builder = new StringBuilder();
		Builder.append(cadena);
		var GUION_BAJO = "_";

		var posicion = capturarIndiceDeMayuscula(cadena);

		var aplicaGuion = esValidaParaAplicarSnakeCamelCase(cadena);

		if (aplicaGuion) {
			Builder.insert(posicion, GUION_BAJO);
		}

		return Builder.toString();

	}

	public static int capturarIndiceDeMayuscula(String cadena) {
		var posicion = 0;
		for (var i = 1; i < cadena.length(); ++i) {
			var caracterActual = cadena.charAt(i);
			if (Character.isUpperCase(caracterActual)) {
				posicion = i;
			}
		}

		return posicion;
	}

	// Se crea esta validacion de acuerdo al caso de prueba dos,
	// entendiendo que con una y tres palabras no se efectua cambios para
	// snakeToCamelCase

	public static boolean esValidaParaAplicarSnakeCamelCase(String cadena) {
		var cantidadDePalabras = 0;
		for (var i = 0; i < cadena.length(); ++i) {
			var caracterActual = cadena.charAt(i);
			if (Character.isUpperCase(caracterActual)) {
				++cantidadDePalabras;

			}
		}

		return switch (cantidadDePalabras) {
		case 1 -> true;
		default -> false;
		};
	}
}
