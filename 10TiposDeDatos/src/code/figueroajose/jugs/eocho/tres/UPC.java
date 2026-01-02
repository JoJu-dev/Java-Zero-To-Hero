package code.figueroajose.jugs.eocho.tres;

public class UPC {

	private String número;
	
	UPC(String número){
		this.número = número;
	}
	/*
	 * En este ejemplo se llama desde el constructor es la mejor opcion para crear una sola vez
	 * cada que se instancie la clase
	 * 
	UPC(String número){
		this.número =String.format("%s%d",número,HallarDígitoDeVerificación.digitoVerificacion(número));
	}*/
	
	public String número() {
		return this.número +  HallarDígitoDeVerificación.digitoVerificacion(número);
	}
	
	
	
}
