package code.figueroajose.jugs.ecinco.tres;

import code.figueroajose.jugs.ecinco.dos.Conteo;

public class CuentaPalabras {

	public static int cuentaPalabras(String cadena) {
		

		return Conteo.conteo(cadena," ")+ 1;
	}

	
}
