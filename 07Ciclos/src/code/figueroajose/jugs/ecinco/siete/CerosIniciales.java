package code.figueroajose.jugs.ecinco.siete;

public class CerosIniciales {


	//Solucion Recomendada
	
	
	public static int cerosIniciales(String cadena) {
		return caracteresIniciales(cadena, '0');
	}
	
	private static int caracteresIniciales(String id, char c) {
		var indice = 0;
		
		while(indice < id.length() && id.charAt(indice) == c) {
			indice++;
		}
		
		return indice;
	}
	
	
	
	
	
	public static int cerosInicialesV1(String cadena) {
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
