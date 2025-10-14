package code.jugs.basica.tiempo;

import static code.jugs.basica.aritmetica.Aritmética.esMúltiplo;

public class AñoUtils {
	 public static boolean esAñoBisiesto(int año) {
		 return esMúltiplo(año, 4)
		 && (esMúltiplo(año, 400) || !esMúltiplo(año, 100));
		 }
}
