package code.figueroajose.jugs.ecinco.dos; 

public class Conteo {

	public static int conteo(String cadena, String subCadena) {
		var posicion = 0;
		var indiceCadena = cadena.indexOf(subCadena); 
		var numeroDeSubcadenasEncontradas = 0;

		while (indiceCadena != -1) {
		
			indiceCadena = cadena.indexOf(subCadena, indiceCadena   + subCadena.length());
			numeroDeSubcadenasEncontradas++;

		}

		return numeroDeSubcadenasEncontradas;
	}

}
