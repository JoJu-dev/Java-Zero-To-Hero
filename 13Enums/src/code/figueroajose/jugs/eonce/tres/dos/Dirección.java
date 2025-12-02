package code.figueroajose.jugs.eonce.tres.dos;

public enum Dirección {
OESTE,
NOROESTE,
NORTE,
NORESTE,
ESTE,
SURESTE,
SUR,
SUROESTE;

public int desplazamientoFila() {
	
	return switch(this) {
	case NORTE, NOROESTE, NORESTE -> -1;
	case OESTE, ESTE -> 0;
	case SUR, SURESTE, SUROESTE -> 1;
	};
		
}

public int desplazamientoColumna() {
	
	return switch(this) {
	case ESTE, NORESTE, SURESTE -> +1;
	case SUR, NORTE -> 0;
	case OESTE, NOROESTE, SUROESTE -> -1;
	};
		
}

}
