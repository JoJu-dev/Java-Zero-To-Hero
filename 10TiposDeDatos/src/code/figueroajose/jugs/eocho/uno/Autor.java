package code.figueroajose.jugs.eocho.uno;

public class Autor {

	private String nombre;
	private String apellido;
	
	Autor(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public String apellido() {
		return this.apellido;
	}
	
	public String toString() {
		return String.format("%s, %s",apellido, nombre);
	}
}
