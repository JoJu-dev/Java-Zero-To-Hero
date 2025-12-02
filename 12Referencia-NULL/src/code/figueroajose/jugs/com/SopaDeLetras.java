package code.figueroajose.jugs.com;

public class SopaDeLetras {

	private int hileras;
	private int columnas;
	private String[] sopa;
	
	public SopaDeLetras(int hileras, int columnas, String[] sopa) {
		this.hileras = hileras;
		this.columnas = columnas;
		this.sopa = sopa;
	}

	public int hileras() {
		return hileras;
	}

	public int columnas() {
		return columnas;
	}

	public void sopa(String[] sopa) {
		this.sopa = sopa;
	}

	
	public Rango buscar(String palabra) {
		Rango rango = null;
		Coordenada[] posicionInicialFila = obtenerPalabraPorFila(palabra);
		Coordenada[] posicionesPorColumnas = BuscarLetraporColumna(palabra);
		var tamanoPalabra = palabra.length() - 1;
        
		if (posicionInicialFila[0] != null) {
			var coordenadaInicial = new Coordenada(posicionInicialFila[0].hilera(),posicionInicialFila[0].columna());
			var coordenadaFinal = coordenadaInicial.desplazar(0, tamanoPalabra);
			rango = new Rango(coordenadaInicial, coordenadaFinal);

		}
		if(posicionesPorColumnas[0] != null) {
			var coordenadaInicial = new Coordenada(posicionesPorColumnas[0].hilera(), posicionesPorColumnas[0].columna());
			var coordenadaFinal = new Coordenada(posicionesPorColumnas[tamanoPalabra].hilera(), posicionesPorColumnas[tamanoPalabra].columna());
			rango = new Rango(coordenadaInicial, coordenadaFinal);
		}

		return rango;
	}
	
	
	private Coordenada[] BuscarLetraporColumna(String cadena) {
		var palabra = cadena.toUpperCase();
		var tamanioPalabra = palabra.length();
		Coordenada[] arrayDeCoordenadas = new Coordenada[tamanioPalabra];
		var posicionFila = 0;
		var posicionColumna = 0;
		var contadorPalabra = 0;
		Coordenada coordenadaPivote = new Coordenada(0, 0);
		var posicionOcupadaActual = 0;
		for(var filaActual = posicionFila; filaActual < this.hileras; ++filaActual) {
			for(var colActual = coordenadaPivote.columna(); colActual < this.columnas; ++colActual) {
				
				var filaString = this.sopa[filaActual];
				var caracterColumnaActual = filaString.charAt(colActual);
				var pivotePalabra = palabra.charAt(contadorPalabra);
				if(caracterColumnaActual == pivotePalabra) {
					posicionColumna = colActual;
				 if((colActual == coordenadaPivote.columna()) || (colActual == coordenadaPivote.columna() + 1)
					|| arrayDeCoordenadas[coordenadaPivote.hilera()] == null) {
					
					arrayDeCoordenadas[filaActual] = new Coordenada(filaActual, posicionColumna);
					++contadorPalabra;
					posicionOcupadaActual = filaActual;
					coordenadaPivote = coordenadaPivote.reasignar(0, colActual);
					break;
				   }else {
					   coordenadaPivote = coordenadaPivote.reasignar(1, coordenadaPivote.columna() + 1);
					   filaActual = posicionOcupadaActual -1;
					   contadorPalabra = 0;
					   arrayDeCoordenadas[posicionOcupadaActual] = null;
					   	break;
				   }
				}
									
			}
			
			if(contadorPalabra >= tamanioPalabra) {
				break;
			}
		}
		
		return arrayDeCoordenadas;
	}

		private Coordenada[] obtenerPalabraPorFila(String cadena) {
		var palabra = cadena.toUpperCase();
		Coordenada[] posicion = new Coordenada[1];
		
		for (var f = 0; f < this.hileras; f++) {

			if (this.sopa[f].contains(palabra)) {
				posicion[f] = new Coordenada(f,this.sopa[f].indexOf(palabra));
				return posicion;
			}
		}
		return posicion;

	}
	
}
