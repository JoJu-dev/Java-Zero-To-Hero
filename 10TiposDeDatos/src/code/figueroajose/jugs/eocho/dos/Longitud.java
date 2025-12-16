package code.figueroajose.jugs.eocho.dos;

public class Longitud {

	private double medida;

	Longitud(double medida){
		this.medida = medida;
	}
	
	public double medida() {
		return this.medida;
	}
	
	public Longitude sumar(Longitud otra) {
		return new Longitud(this.medida + otra)
	}
	
	public boolean equals(Object otro) {
		
		return otro instanceof Longitud longitud && this.medida == longitud.medida;
	}
	
}
