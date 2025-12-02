package code.figueroajose.jugs.eonce.tres.dos;

import java.util.Arrays;
import java.util.Objects;



public class Mundo {

	private int filas;
	private int columnas;
	private Coordenada[] celulasVivas;
	
	public Mundo(int filas, int columnas, Coordenada[] celulasVivas) {
		this.filas = filas;
		this.columnas = columnas;
		this.celulasVivas = celulasVivas;
	}
	
	
	 public Mundo siguienteGeneración() {
	  Coordenada[] siguienteGeneración = null;
	  
	  var arrayCélulasDead = arrayFullDead(this.filas, this.columnas);
	  var addCélulasVivas = generacion(arrayCélulasDead, this.celulasVivas);
	  var nuevaGeneración = nuevaGeneracionArray(addCélulasVivas);
	  
	  siguienteGeneración = coordenadaNuevaGeneracion(nuevaGeneración);
	  return new Mundo(this.filas,this.columnas,siguienteGeneración);
	  
	 }
	 
	 
	 //Genéra las un arreglo de coordenadas con las posiciones de las células vivas de siguiente generación
	 private static Coordenada[] coordenadaNuevaGeneracion(String[][] nuevoMundo){
			var tamanoCoordenada = calcularNumeroDeCelulasVivasEnArregloNuevaGeneracion(nuevoMundo);
			Coordenada[] coordenada = new Coordenada[tamanoCoordenada];
			var tamanoArray = nuevoMundo.length;
			var contCoordenada = 0;
			for(var f = 0; f < tamanoArray; ++f) {
				for(var c = 0; c < tamanoArray; ++c) {
					
					if(nuevoMundo[f][c] == Célula.VIVA.toString()) {
						coordenada[contCoordenada] = new Coordenada(f,c); 
					   ++contCoordenada;
					}
					
				}
			}
			
			return coordenada;
		}
	 //Calcula el número de celulas vivas para dar tamaño a las coordenadas de nuevaGeneración
	 private static int calcularNumeroDeCelulasVivasEnArregloNuevaGeneracion(String[][] nuevaGeneracion){
			var nVivas = 0;
			var tamanoArray = nuevaGeneracion.length;
			for(var f = 0; f < tamanoArray; ++f) {
				for(var c = 0; c < tamanoArray; ++c) {
					if(nuevaGeneracion[f][c] == Célula.VIVA.toString()) {
						nVivas++;
					}
				}
			}
			return nVivas;
		} 
	 
	 private static String[][] nuevaGeneracionArray(String[][] mundoIngresado) {
			var tamanoCoordenada = mundoIngresado.length;
			var totalDeCelulasVivas = 0;
			
			Coordenada[] coordenadasVecinos = null; 
			String[][] nuevaGeneracion = new String[tamanoCoordenada][tamanoCoordenada];
			for(var row =0; row < mundoIngresado.length; ++row ) {
				for (var column = 0; column < mundoIngresado.length; ++column) {

					coordenadasVecinos = desplazamientoPorCoordenada(new Coordenada(row,column));		
					totalDeCelulasVivas = numeroDeCelulasVivasPorVecinos(mundoIngresado, coordenadasVecinos);
					nuevaGeneracion[row][column] = agregarEstadoCélula(totalDeCelulasVivas, new Coordenada(row,column), mundoIngresado).toString(); 
				
				}
			}
				
	     return nuevaGeneracion;
		}
	 
	// Agregando estado de Célula según su posición con Método Siguiente Generación
		private static Célula agregarEstadoCélula(int estado, Coordenada coor, String[][] array) {

			var fila = coor.hilera();
			var col = coor.columna();

			if (array[fila][col] == Célula.VIVA.toString()) {
				return Célula.VIVA.siguienteGeneración(estado);
			}else if(array[fila][col] == Célula.MUERTA.toString()) {
				return Célula.MUERTA.siguienteGeneración(estado);
			} 
			else  {
				return Célula.VIVA.siguienteGeneración(estado);
			}
		}
		// Evaluar y contar el número de celulas vivas
		private static int numeroDeCelulasVivasPorVecinos(String[][] mundoIngresado, Coordenada[] coor) {
			var nVivas = 0;
			var recorrerCoordenada = 0;
			var tamanoCoordenada = coor.length;// 8

			while (recorrerCoordenada < tamanoCoordenada) {
				var filas = coor[recorrerCoordenada].hilera();
				var columnas = coor[recorrerCoordenada].columna();
				if ((filas >= 0 && columnas >= 0) && (filas <= mundoIngresado.length -1 && columnas <= mundoIngresado.length -1)) {
					if (mundoIngresado[filas][columnas] == Célula.VIVA.toString()) {
						++nVivas;
					}

				}
				++recorrerCoordenada;
			}
			return nVivas;
		}
	 
	 private static Coordenada[] desplazamientoPorCoordenada(Coordenada coordenada) {
			Coordenada[] coordenadaDesplazamiento = new Coordenada[8];
			var n = 0;
			for (var direccion : Dirección.values()) {

				var f = coordenada.hilera() + direccion.desplazamientoFila();
				var c = coordenada.columna() + direccion.desplazamientoColumna();

				coordenadaDesplazamiento[n] = new Coordenada(f, c);
				n++; 
			}

			return coordenadaDesplazamiento;
		}
	 
	// Agrega las celulas vivas "#" en las posiciones dadas en el constructor
		private static String[][] generacion(String[][] a, Coordenada[] cor) {
			var indiceCoordenada = 0;
			// var mundo = new String[5][5];

			for (var f = 0; f < a.length; ++f) {
				for (var c = 0; c < a.length; ++c) {

					if (indiceCoordenada < cor.length) {
						if (f == cor[indiceCoordenada].hilera() && c == cor[indiceCoordenada].columna()) {
							a[f][c] = Célula.VIVA.toString();
							++indiceCoordenada;
						}
					}
				}
			}

			return a;

		}
	 
	// Llena todo el array del tamaño de fila y columnas con células Muertas "."
		private static String[][] arrayFullDead(int fil, int col) {
			var mundo = new String[fil][col];

			for (var f = 0; f < mundo.length; ++f) {
				for (var c = 0; c < mundo.length; ++c) {
					mundo[f][c] = Célula.MUERTA.toString();

				}

			}
			return mundo;

		}
	 
	 
	 @Override
	public String toString() {
		return "Mundo [filas=" + filas + ", columnas=" + columnas + ", celulasVivas=" + Arrays.toString(celulasVivas)
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(celulasVivas);
		result = prime * result + Objects.hash(columnas, filas);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mundo other = (Mundo) obj;
		return Arrays.equals(celulasVivas, other.celulasVivas) && columnas == other.columnas && filas == other.filas;
	}
	
	 
}
