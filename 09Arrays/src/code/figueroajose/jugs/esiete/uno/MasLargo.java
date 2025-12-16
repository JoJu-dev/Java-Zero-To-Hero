package code.figueroajose.jugs.esiete.uno;

public class MasLargo {
	
	
	public static int másLargo(String[] arreglo) {
	
		var indiceMásLargo = 0;
		var longitudMáxima = 0;
		
		for(var i = 0; i < arreglo.length; ++i) {
			
			if(arreglo[i].length() > longitudMáxima) {
				indiceMásLargo = i;
				longitudMáxima = arreglo[i].length();
			}
		}
		return indiceMásLargo;
	}
	
	// version Uno
	public static int _masLargo(String[] arreglo) {
		var indiceTotal = 0;
		var indiceTamano = 0;
		for (var tamano = 0; tamano < arreglo.length; ++tamano) {
			for (var tamanoDos = 1; tamanoDos <= arreglo.length; ++tamanoDos) {
                 indiceTamano = tamanoDos - 1;
				if (arreglo[tamano].length() > arreglo[indiceTamano].length()) {
					indiceTotal = tamano;
				}
			}

		}

		return indiceTotal;
	}
}
