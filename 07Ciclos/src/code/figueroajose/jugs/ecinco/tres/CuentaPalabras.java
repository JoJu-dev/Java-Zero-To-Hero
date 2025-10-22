package code.figueroajose.jugs.ecinco.tres;

public class CuentaPalabras {

	public static int cuentaPalabras(String cadena) {
		var cadenaNueva = AgregarEspacioACadena(cadena);
		var palabrasEncontradas = 0;

		for (var i = 0; i < cadenaNueva.length(); i++) {

			var caracter = cadenaNueva.charAt(i);
			palabrasEncontradas += (Character.isLetter(caracter)) ? 0 : 1;
		}

		return palabrasEncontradas;
	}

	private static String AgregarEspacioACadena(String cadena) {
		var ESPACIO = " ";
		var builder = new StringBuilder();

		builder.append(cadena);
		builder.insert(cadena.length(), ESPACIO);

		return builder.toString();
	}

}
