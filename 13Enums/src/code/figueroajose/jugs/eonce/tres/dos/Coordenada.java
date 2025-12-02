package code.figueroajose.jugs.eonce.tres.dos;

public class Coordenada {

	private int hilera;
	private int columna;

	public Coordenada() {
	}

	public Coordenada(int hilera, int columna) {
		this.hilera = hilera;
		this.columna = columna;
	}

	public Coordenada desplazar(int desplazamientoHilera, int desplazamientoColumna) {
		var sumaHilera = this.hilera() + desplazamientoHilera;
		var sumaColumna = this.columna() + desplazamientoColumna;
		return new Coordenada(sumaHilera, sumaColumna);
	}

	public Coordenada reasignar(int desplazamientoHilera, int desplazamientoColumna) {
		this.hilera = desplazamientoHilera;
		this.columna = desplazamientoColumna;
		return new Coordenada(this.hilera, this.columna);
	}
	
	public int hilera() {
		return this.hilera;
	}

	public int columna() {
		return this.columna;
	}

	public boolean equals(Object obj) {
		return obj instanceof Coordenada c && this.columna == c.columna && this.hilera == c.hilera;
	}

	public String toString() {
		return String.format("%d ,  %d", this.hilera(), this.columna());
	}
}
