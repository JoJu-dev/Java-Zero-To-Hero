package code.figueroajose.jugs.eocho.cuatro;

public class Circulo {

	private double radio;
	private Punto centro;

	Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;

	}

	public double radio() {
		return radio;
	}

	public Punto Centro() {
		return this.centro;
	}

	public double área() {
		return Math.PI * this.radio() * this.radio();
	}

	public double circunferencia() {
		return 2 * Math.PI * this.radio();
	}

	public boolean seInterceptan(Circulo circulo) {
		var distancia = this.centro.distancia(circulo.Centro());
		var sumaDeRadios = this.radio + circulo.radio;
		return (distancia <= sumaDeRadios);
	}

	// Recordatorio:
	// El operador == compara referencias de objetos(verifica si estan en el mismo
	// punto en memoria; no si los datos(coordenadas son iguales), no compara
	// contenido el contenido, compara si estan en el mismo lugar en memoria preguntandose si son el mismo objeto
	// al usar el equals, para comparar objetos de objeto, ojo la clase del objeto que se quiere comparar debe de tener el método equals
	// propio para compararlo, de la forma como se esta haciendo en este método
	// equals compara los valores valores
	public boolean equals(Object otro) {
		return otro instanceof Circulo c && this.centro.equals(c.centro) && this.radio == c.radio;
	}
	/*
	 * public boolean equals(Object otro) { return otro instanceof Punto p && this.x
	 * == p.x && this.y == p.y; }
	 */
}
