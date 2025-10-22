package code.figueroajose.jugs.ecinco.ocho;

import java.time.LocalDate;

import code.figueroajose.jugs.ecinco.cinco.DígitosSuma;

public class NúmeroVida {

	public static int númeroVida(LocalDate fecha) {
		var numeroDeVida = 0;
		var anio = fecha.getYear();
		var mes = fecha.getMonthValue();
		var dia = fecha.getDayOfMonth();

		var calcularDigitoSumaAnio = digitoSuma(anio);
		var calcularDigitoSumaMes = digitoSuma(mes);
		var calcularDigitoSumaDia = digitoSuma(dia);

		numeroDeVida = calcularDigitoSumaAnio + calcularDigitoSumaDia + calcularDigitoSumaMes;

		numeroDeVida = digitoSuma(numeroDeVida);

		return numeroDeVida;

	}

	private static int digitoSuma(int digito) {
		var numeroDeVidaAnio = 0;
		var dato = digito;

		numeroDeVidaAnio = DígitosSuma.dígitosSumaPrimeraFase(dato);

		while ((numeroDeVidaAnio >= 10)
				&& ((numeroDeVidaAnio != 11) && (numeroDeVidaAnio != 22) && (numeroDeVidaAnio != 33))) {
			numeroDeVidaAnio = DígitosSuma.dígitosSumaPrimeraFase(numeroDeVidaAnio);
		}

		return numeroDeVidaAnio;

	}

}
