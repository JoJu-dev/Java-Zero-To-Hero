package code.figueroajose.jugs.eocho.tres;

public class UPC {

	private String número;
	
	UPC(String número){
		this.número = número;
	}
	
	public String número() {
		return this.número + HallarDígitoDeVerificación.digitoVerificacion(número);
	}
	
	
	
}
