package code.figueroajose.jugs.eocho.cuatro;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(Punto p) {
		var cuadradoDeDiferenciasDeXs = Math.pow(this.x - p.x, 2.0);
		var cuadradoDeDiferenciasDeYs = Math.pow(this.y - p.y, 2.0);
		var distancia = Math.sqrt(cuadradoDeDiferenciasDeXs + cuadradoDeDiferenciasDeYs);
		return distancia;
	}

	public boolean equals(Object otro) {
		return otro instanceof Punto p && this.x == p.x && this.y == p.y;
	}

	public String toString() {
		return String.format("(%f, %f)", x, y);
	}
}