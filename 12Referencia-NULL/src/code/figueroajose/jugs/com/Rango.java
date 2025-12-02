package code.figueroajose.jugs.com;

import java.util.Objects;

public class Rango {

	private Coordenada inicio;
	private Coordenada fin;

	public Rango() {
	}

	public Rango(Coordenada inicio, Coordenada fin) {
		this.inicio = inicio;
		this.fin = fin;
	}

	public Coordenada inicio() {
		return this.inicio;
	}

	public Coordenada fin() {
		return this.fin;
	}	

	public String toString() {
		return String.format("(%d, %d) - (%d, %d)", this.inicio.hilera(), this.inicio.columna(), this.fin.hilera(),
				this.fin.columna());
	}

	@Override
	public int hashCode() {
		return Objects.hash(fin, inicio);
	}

	/*public boolean equals(Object obj) {
	return obj instanceof Rango r  &&  this.inicio == o.inicio && this.fin == o.fin;
}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rango other = (Rango) obj;
		return Objects.equals(fin, other.fin) && Objects.equals(inicio, other.inicio);
	}

}
