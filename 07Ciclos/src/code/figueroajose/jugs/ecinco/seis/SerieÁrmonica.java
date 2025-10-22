package code.figueroajose.jugs.ecinco.seis;

public class SerieÁrmonica {

	public static double serieÁrmonica(int número) {
		var serieÁrmonica = 0.0;
		var divisionEntreN = 0.0;
		for (var i = 1; i <= número; i++) {
			divisionEntreN = 1.0 / i;
			serieÁrmonica += divisionEntreN;
		}

		return serieÁrmonica;
	}
}
