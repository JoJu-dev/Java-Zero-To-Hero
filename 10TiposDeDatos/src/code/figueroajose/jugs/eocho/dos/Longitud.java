package code.figueroajose.jugs.eocho.dos;

public class Longitud {

	private double medida;

	Longitud(double medida){
		this.medida = medida;
	}
	
	public double medida() {
		return this.medida;
	}
	
	public double sumar(Longitud otra) {
		double suma = this.medida + otra.medida;
		
		return suma;
	}
	
	public boolean equals(Object otro) {
		
		return otro instanceof Longitud longitud && this.medida == longitud.medida;
	}
	
}
