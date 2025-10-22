package code.figueroajosejugs.ecinco.diez;

public class Coordenadas {

	public static String coordenadas(int tamano) {
		var builder = new StringBuilder();
		for (int i = 1; i <= tamano; i++) {
			for (int y = 1; y <= tamano; y++) {

				builder.append("(" + i + ", " + y + ")");

			}

		}

		return AgregarBarraVertical(builder.toString());

	}

	private static String AgregarBarraVertical(String cadena) {
		var Builder = new StringBuilder();
		var BARRA_VERTICAL = "|";
		var nuevaCadena = Builder.append(cadena);
		var posicion = 0;
		var nuevaPosicion = 0;

		while (posicion != -1) {
			posicion = nuevaCadena.indexOf(")", nuevaPosicion);
			Builder.insert(nuevaPosicion, BARRA_VERTICAL);
			nuevaPosicion = posicion + 2;
		}

		return nuevaCadena.toString();
	}

}
