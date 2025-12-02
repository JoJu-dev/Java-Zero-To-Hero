package code.figueroajose.jugs.eocho.cinco;

public class Aritmética {

	public static int mcd(int a, int b) {
		return b == 0 ? a : mcd(b, a % b);
	}

	public static int mcm(int a, int b) {
		return a / mcd(a, b) * b;
	}

}
