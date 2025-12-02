package code.figueroajose.jugs.eonce.tres.dos;

public enum Célula {
VIVA, MUERTA;
	//Métodos de instancia
	public Célula siguienteGeneración(int vecinosVivos) {
		
		Célula estado = this;
		
		if(vecinosVivos == 3) {
			estado = Célula.VIVA;
		}
		else if (vecinosVivos < 2 || vecinosVivos > 3) {
			estado = Célula.MUERTA;
		}
	
		return estado;
		
	}
	
	public String toString(){
		return (this == VIVA) ? "#" : ".";
	}
}
