package code.figueroajose.jugs.eseis.cuatro;

public class SnakeCaseToCamelCase {
	
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
}
