package code.figueroajose.jugs.basic;

import java.net.Socket;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		// -----> Registro de prueba y error para entender el funcionamiento  lógico de algunas prácticas <---------
		
		


		/*
		 * var cadena = "sssa"; var subCadena = "ss"; var posicion = 0; var indiceCadena
		 * = cadena.indexOf(subCadena,posicion); var numeroDeSubcadenasEncontradas = 0;
		 * //posicion= indiceCadena +1; while((indiceCadena =
		 * cadena.indexOf(subCadena,posicion)) != -1) { posicion = indiceCadena + 2;
		 * numeroDeSubcadenasEncontradas++;
		 * 
		 * }
		 * 
		 * System.out.println(numeroDeSubcadenasEncontradas);/*
		 * 
		 * 
		 * //Recorrido a piesito.
		 * /*System.out.println("Busca: 0  encuentra en "+cadena.indexOf(subCadena,0));
		 * System.out.println("Busca: 3  encuentra en "+cadena.indexOf(subCadena,3));
		 * System.out.println("Busca: 5  encuentra en "+cadena.indexOf(subCadena,5));
		 * System.out.println("Busca: 9  encuentra en "+cadena.indexOf(subCadena,9));
		 * System.out.println("Busca: 11  encuentra en "+cadena.indexOf(subCadena,11));
		 */

		/*
		 * System.out.println("Busca: 0  encuentra en "+cadena.indexOf(subCadena,0));
		 * System.out.println("Busca: 1  encuentra en "+cadena.indexOf(subCadena,1));
		 */

		/*
		 * var cadena = "one two three";
		 * 
		 * var conteoPalabras = 0; var caracter = 0; //var agregarEspacio =
		 * cadena.lastIndexOf(""); StringBuilder builder = new StringBuilder();
		 * builder.append(cadena); var cadenaNueva =
		 * builder.insert(cadena.length()," "); for (int i = 0; i <
		 * cadenaNueva.length(); i++) {
		 * 
		 * var c = cadenaNueva.charAt(i); conteoPalabras += (Character.isLetter(c)) ? 0
		 * : 1;
		 * 
		 * }
		 * 
		 * System.out.println(conteoPalabras);
		 */

		/*
		 * var serieÁrmonica = 0.0; var div = 0.0; for(var i = 1; i <=1; i++) { div =
		 * 1.0/ i; serieÁrmonica += div; } System.out.println(serieÁrmonica);
		 */
		/*
		 * var cadena = "0000"; var numeroDeCeros = 0; var indice=0; var posicion = 0;
		 * var salida = 0; /*for(indice = 0; indice < cadena.length(); indice++) {
		 * 
		 * var caracter = cadena.charAt(indice); numeroDeCeros +=
		 * (Character.isDigit(caracter)) ? 1 : 0;
		 * 
		 * }
		 * 
		 * 
		 * while(Character.isDigit(cadena.charAt(indice)) && indice < cadena.length()) {
		 * 
		 * indice += (indice < cadena.length() - 1) ? 1 : 0; numeroDeCeros++; }
		 */

		// System.out.println(numeroDeCeros);*/
		/*
		 * var salida=0; while( salida < 30) { salida++; } System.out.println(salida);
		 */

		/*
		 * System.out.println(miFuncion(LocalDate.of(2000,10, 10)));
		 * 
		 * }
		 * 
		 * public static final int miFuncion(LocalDate fecha) { var ano =
		 * fecha.getYear(); return ano; }
		 */
		// var patronAjedrez = "";
		// var patron = "";
		// var salida = 0;
		// var indiceMaxPar = 3;
		// var indiceMaxImpar = indiceMaxPar * 2;
		// var indice = 1;
		// while (salida <= 3) {

		/*
		 * for (var fila = 1; fila <= 3; fila++) { patron += esPar(fila) ?
		 * hilerasPares() : hilerasImPares() ; //System.out.print(patron); }
		 * System.out.println(patron); // for (var columna = 0; columna < 3; columna++)
		 * { // patronAjedrez = esPar(columna) ? hilerasPares() : hilerasImPares();
		 * //System.out.print(patronAjedrez);
		 * 
		 * // }
		 */

		// System.out.println("");
		// salida++;
		// }

		// patronAjedrez(3);

	/*	var builder = new StringBuilder();
		var cadena ="";
		for (int i = 1; i <= 3; i++) {

			for (int y = 1; y <= 3; y++) {
				// System.out.print ("|");
				
				 builder.append("( "+ i + ", " + y +")");
				
			}
			
			cadena = builder.toString();
		}
		//System.out.println(" --> " + (barraVertical));
		System.out.println(imprimirBarra(cadena));     //("(1, 1)(1, 2)(1, 3)(2, 1)(2, 2)(2, 3)(3, 1)(3, 2)(3, 3)")); */
	}

	/*public static String imprimirBarra(String cadena) {
		var Builder = new StringBuilder();
		var barraVertical = "|";
		// Builder.insert(0,"|");
		var nuevaCadena = Builder.append(cadena);
		//System.out.println("primera: " + nuevaCadena.length());
		var posicion = 0;
		var nuevaPosicion = 0;
		var cadenaIndiiceAcrualizado = 0;
		var evaluar = 0;
		;
		// for (var indice = 1; indice < (evaluar = nuevaCadena.length()); indice++) {
		while (posicion != -1) {
			posicion = nuevaCadena.indexOf(")", nuevaPosicion);
			//System.out.println("evaluar " + posicion);
			//nuevaCadena = (posicion != -1) ? Builder.insert(nuevaPosicion, barraVertical): nuevaCadena;
			Builder.insert(nuevaPosicion, barraVertical);
			//System.out.println(nuevaCadena);
			nuevaPosicion = posicion + 2;
			//System.out.println(nuevaCadena.length()-1);
		}
    
		//var cadenaFinal = Builder.toString();
		
		//nuevaCadena = Builder.insert(nuevaCadena.length(),"|");
		return nuevaCadena.toString();
	}*/

}