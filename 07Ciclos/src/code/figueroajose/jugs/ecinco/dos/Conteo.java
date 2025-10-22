package code.figueroajose.jugs.ecinco.dos;

public class Conteo {

	public static int conteo(String cadena, String subCadena) {
		var posicion = 0;
		var indiceCadena = cadena.indexOf(subCadena, posicion);
		var numeroDeSubcadenasEncontradas = 0;

		while ((indiceCadena = cadena.indexOf(subCadena, posicion)) != -1) {
			
			posicion = indiceCadena + 2;
			numeroDeSubcadenasEncontradas++;

		}

		return numeroDeSubcadenasEncontradas;
	}

}
