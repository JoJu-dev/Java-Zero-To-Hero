package code.figueroajose.jugs.ecinco.diez;

public class Coordenadas {
	
	
	
	//Recomendado
	public static String coordenadasR(int limite) {
		var builder = new StringBuilder("|");
		
		for (var x = 1; x < limite; ++x) {
			for(var y = 0; y < limite; ++y) {
				builder.append(String.format("(%d,%d)|", x,y));
			}
		}
		
		return builder.toString();
	}

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
