package code.figueroajose.jugs.enueve.cuatro;

public class Ángulo {
	private double medida;
	private boolean centígrados;

	private Ángulo(double medida, boolean centígrados) {
	 this.medida = medida;
	 this.centígrados = centígrados;
	 }

	public static Ángulo enCentígrados(double medida) {
		return new Ángulo(medida, true);
	}

	public static Ángulo enRadianes(double medida) {
		return new Ángulo(medida, false);
	}

	public double centígrados() {
		return this.centígrados ? this.medida : Math.toDegrees(this.medida);
	}

	public double radianes() {
		return this.centígrados ? Math.toRadians(this.medida) : this.medida;
	}

	 public boolean equivalente(Ángulo otro) {
		 return Math.abs(centígrados()-otro.centígrados()) < 1e-3;
		 }
}
