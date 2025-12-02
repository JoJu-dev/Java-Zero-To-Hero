package code.figueroajose.jugs.enueve.cuatro;

public class Geometria {

	public static Ángulo tercerÁngulo(Ángulo alfa, Ángulo beta) {
		return Ángulo.enCentígrados(180.0 - (alfa.centígrados() + beta.centígrados()));
	}

	public static boolean esTriángulo(Longitud a, Longitud b, Longitud c) {
		var max = Math.max(a.medida(), Math.max(b.medida(), c.medida()));
		var sumaÁngulosMenores = (a.medida() + b.medida() + c.medida()) - max;
		return sumaÁngulosMenores > max;
	}

	public static boolean esTriángulo(Ángulo alfa, Ángulo beta, Ángulo gamma) {
		var suma = alfa.centígrados() + beta.centígrados() + gamma.centígrados();
		return Math.abs(suma - 180.0) < 1e-3;
	}

	public static Longitud leyCosenos(Longitud a, Longitud b, Ángulo gamma) {
		var cuadradoDeA = Math.pow(a.medida(), 2.0);
		var cuadradoDeB = Math.pow(b.medida(), 2.0);
		var tercerTérmino = 2 * a.medida() * b.medida() * Math.cos(gamma.radianes());
		var c = Math.sqrt(cuadradoDeA + cuadradoDeB - tercerTérmino);
		return new Longitud(c);
	}

	public static Ángulo leyCosenos(Longitud a, Longitud b, Longitud c) {
		var cuadradoDeA = Math.pow(a.medida(), 2.0);
		var cuadradoDeB = Math.pow(b.medida(), 2.0);
		var cuadradoDeC = Math.pow(c.medida(), 2.0);
		var numerador = cuadradoDeA + cuadradoDeB - cuadradoDeC;
		var denominador = 2 * a.medida() * b.medida();
		var coseno = numerador / denominador;
		var gamma = Math.toDegrees(Math.acos(coseno));
		var ángulo = Ángulo.enCentígrados(gamma);
		return ángulo;
	}

	public static Ángulo leySenos(Longitud a, Longitud b, Ángulo beta) {
		var senoBeta = Math.sin(beta.radianes());
		var razón = senoBeta / b.medida();
		var senoAlfa = razón * a.medida();
		var alfa = Math.asin(senoAlfa);
		var ángulo = Ángulo.enRadianes(alfa);
		return ángulo;
	}

	public static Longitud leySenos(Longitud a, Ángulo alfa, Ángulo beta) {
		var senoAlfa = Math.sin(alfa.radianes());
		var senoBeta = Math.sin(beta.radianes());

		var razón = a.medida() / senoAlfa;
		var b = razón * senoBeta;
		return new Longitud(b);
	}
}
