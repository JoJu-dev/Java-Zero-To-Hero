package code.figueroajose.jugs.esiete.cinco;

public class Únicos {

	public static boolean únicos(int[] cadena) {
		var únicos = true;
		var valorAComparar = 0;
		var valorComparador = 0;

		for (var pivote = 0; pivote < cadena.length-1; ++pivote) {
			for (var actual = pivote + 1; actual < cadena.length; ++actual) {
				valorComparador = cadena[pivote];
				valorAComparar = cadena[actual];
				if ((valorComparador == valorAComparar) && (pivote != actual)) {
					únicos = false;
				}
			}
		}

		return únicos;

	}

}
