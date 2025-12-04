package code.figueroajose.jugs.ecinco.seis;

public class SerieÁrmonica {

	public static double serieÁrmonica(int número) {
		var serieÁrmonica = 0.0;
		var divisionEntreN = 0.0;
		for (var x = 1; x <= número; x++) {
			divisionEntreN = 1.0 / x;
			serieÁrmonica += divisionEntreN;
		}

		return serieÁrmonica;
	}
}
