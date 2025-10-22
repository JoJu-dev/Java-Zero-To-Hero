package code.figueroajose.jugs.ecinco.cuatro;

public class SumaRangoNúmeros {
	
	public static int sumaRangosNúmeros(int numeroUno, int numeroDos) {
		var sumaRangoDeNumeros = 0;
		
		for(var rango = numeroUno; rango <= numeroDos; rango++) {
			sumaRangoDeNumeros += rango;
		}
		
		return sumaRangoDeNumeros;
	}

}
