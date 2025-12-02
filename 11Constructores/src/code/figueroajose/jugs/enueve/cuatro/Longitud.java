package code.figueroajose.jugs.enueve.cuatro;

public class Longitud {
	private double medida;

	public Longitud(double medida) {
		if (medida <= 0.0) {
			var mensaje = String.format("Medida negativa: %f", medida);
			throw new IllegalArgumentException(mensaje);
		}
		this.medida = medida;
	}

	public double medida() {
		return this.medida;
	}

	 public boolean equivalente(Longitud otra) {
		 return Math.abs(medida-otra.medida) < 1e-3;
		 }
}
