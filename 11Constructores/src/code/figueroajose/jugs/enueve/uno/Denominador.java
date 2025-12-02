package code.figueroajose.jugs.enueve.uno;

public class Denominador {

	private int denominador;

	Denominador(int denominador) {

		// invariante de una clase: condición que debe ser cierta toda la vida.
		if (denominador == 0) {
			var mensaje = String.format("El denominador no debe de ser 0. El valor actual es %d", denominador);
			throw new IllegalArgumentException(mensaje);
		}

		this.denominador = denominador;
	}

	public int denominador() {
		return this.denominador;
	}
	
	public int setDenominador(int d) {
		return d;
	}

	
}
