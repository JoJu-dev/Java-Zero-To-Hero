package code.figueroajose.jugs.esiete.dos;

public class Contiene {
	
	
	public static boolean contiene(String[] arreglo, String cadena) {
	
		for(var array : arreglo) {
			if(array.equals(cadena)) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	//version Uno
	public static boolean contiene_(String[] arreglo, String cadena) {
		var contiene = false;

		for (var actual = 0; actual < arreglo.length; ++actual) {

			if (cadena.equals(arreglo[actual])) {
				contiene = true;
			}
		}
		return contiene;
	}
}
