package code.figueroajose.jugs.enueve.dos;

import java.util.Random;

public class NúmeroSecreto {

	private String número;

	private NúmeroSecreto() {
		var random = new Random();
		var usados = new boolean[10];
		var builder = new StringBuilder();
		while (builder.length() < 4) {
			var dígito = random.nextInt(10);
			for (; usados[dígito]; dígito = (dígito + 1) % 10)
				;
			usados[dígito] = true;
			builder.append(dígito);
		}
		this.número = builder.toString();
	}

	public static NúmeroSecreto create() {
		return new NúmeroSecreto();
	}

	NúmeroSecreto(String número) {
		this.número = número;
	}

	// una pica es un dígito que se encuentra en el número secreto pero en otra
	// posición
	public int picas(String intento) {

		return picasFijas(intento, "picas");
	}

	// una fija es aquel que se encuentra en la misma posición
	public int fijas(String intento) {

		return picasFijas(intento, "fijas");
	}

	private int picasFijas(String intento, String prefijo) {
		int picas = 0;
		int fijas = 0;
		var arrayIntento = convertirAArreglo(intento);
		var arrayNumero = convertirAArreglo(this.número);
		for (var i = 0; i < arrayIntento.length; i++) {
			for (var j = 0; j < arrayNumero.length; j++) {
				var intentoN = arrayIntento[i];
				var pivoteNumero = arrayNumero[j];
				if (intentoN.equals(pivoteNumero) && i == j) {
					fijas++;
				} else if (intentoN.equals(pivoteNumero) && i != j) {
					picas++;
				}
			}
		}

		return prefijo.equals("picas") ? picas : fijas;

	}

	public String[] convertirAArreglo(String intento) {
		String array[] = new String[intento.length()];

		for (int i = 0; i < intento.length(); i++) {
			var indice = intento.charAt(i);

			array[i] = String.valueOf(indice);
		}

		return array;

	}
}
