package code.jugs.basica.aritmetica;

public class Aritmética {
	
	public static double hipotenusa(double a, double b) { 
		return Math.sqrt((a * a) + (b * b));
	
	}
	
	public static boolean esMúltiplo(int a, int b) {
		 return (a % b) == 0;
		 
	}
}
