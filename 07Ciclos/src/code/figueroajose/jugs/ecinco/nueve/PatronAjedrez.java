package code.figueroajose.jugs.ecinco.nueve;

public class PatronAjedrez {

	public static String patronAjedrez(int tamanio) {
		var builder = new StringBuilder();
		var patronAjedrez = "";
		var salida = 1;

		while (salida <= tamanio) {
			patronAjedrez = esPar(salida) ? patronPar(tamanio) : patronImPar(tamanio);
			builder.append(patronAjedrez);
			salida++;

		}

		return builder.toString();

	}

	private static String patronImPar(int tamano) {
		var builder = new StringBuilder();
		var imprimir = "";

		for (var patron = 1; patron <= tamano; patron++) {
			imprimir = esPar(patron) ? hilerasPares() : hilerasImPares();
			builder.append(imprimir);
		}
		builder.append(AgregarEspacio());
		return builder.toString();

	}

	private static String patronPar(int tamano) {
		var builder = new StringBuilder();
		var imprimir = "";
		for (var patron = 0; patron < tamano; patron++) {
			imprimir = esPar(patron) ? hilerasPares() : hilerasImPares();
			builder.append(imprimir);
		}

		builder.append(AgregarEspacio());
		return builder.toString();

	}

	private static boolean esPar(int n) {
		var esPar = ((n % 2)) == 0;
		return esPar;
	}

	private static String hilerasImPares() {
		var builder = new StringBuilder();
		builder.append("*");
		return builder.toString();

	}

	private static String hilerasPares() {
		var builder = new StringBuilder();
		builder.append(".");
		return builder.toString();

	}

	private static String AgregarEspacio() {
		var builder = new StringBuilder();
		builder.append("\n");
		return builder.toString();
		// existe diferencia entre usar System.lineSeparator() y \'"\n"\'
		// System.lineSeparator(): depende sel S.O en linux ="\n" y windows: \r\n
		// "\n" en windows
		// Esto afecto cuando ejecute el test porque el tipo de espacio era diferente;
		// al usar el método lineSeparator() esto causo que el resultado del test fuese
		// error
	}
}
