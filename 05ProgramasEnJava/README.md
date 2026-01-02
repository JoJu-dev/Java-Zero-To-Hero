# Programas Java
- En java las construcciones principales son las clases.
- Los nombres de la clase sirve como nombre de agrupación para las funciones.
- El modificador `static` determina como se debe invocar. Un método <static> indica que debes 
anteponer el nombre de la clase al nombre del método separados por punto.

## Paquetes
- Cada paquete debe de constar almenos tres partes separadas por puntos.
- las dos primeras deberan ser el dominio de la empresa : `com.java`
- y el siguiente un identificador del prouecto al que pertenece la clase.
- solo puedes hacer un paquete por clase.

### Importaciones
- Las declaraciones de importación deben aparecer después de la declaración del paquete pero antes de la declaración de clase "Carlos Obregón".
```java
package code.jugs.biesiestos.utils; // <---
import static code.jugs.bisiestos.calculos.Aritmetica.esMúltiplo; //<---
public class AñoUtils {
public static boolean esBisiesto(int año) {
return esMúltiplo(año, 4) && (esMúltiplo(año, 400) || !esMúltiplo(año, 100));
}
} 
```
-  Un import static es como un import, pero con el modificador static después de import, y lo que sigue es el paquete de la clase, el nombre de la clase y finalmente el nombre de la función, separados por puntos.

### Constantes de clase

- Las constantes de clase se crean con indicaciones por modificadores `static` y `final`
- Al ser constantes de la clase se calculan una sola vez.
```java
//Ejemplo by Carlos Obregón
package code.jugs.basica.fisica;
public class FísicaPlanetaria {
private static final double G = 6.67430e-11;
private static final double GRAVEDAD_SUPERFICIAL_TIERRA = gravedadSuperficial(5.972e24, 6.378e6);
private static final double GRAVEDAD_SUPERFICIAL_MARTE = gravedadSuperficial(6.421e23, 3.3972e6);
public static double gravedadSuperficial(double masa, double radio) {
return G / Math.pow(radio, 2.0) * masa;
}
public static double pesoEnMarte(double peso) {
return GRAVEDAD_SUPERFICIAL_MARTE / GRAVEDAD_SUPERFICIAL_TIERRA * peso;
}
public static double energíaGravitatoria(double masa1, double masa2, double distancia) {
return-((G * masa1 * masa2) / distancia);
}
}
```

### Java Docs
- JavaproporcionaJavadocsparaescribirespecificaciones.LosJavadocscomienzancon/** y terminan con */. Pormotivos estéticos, es comúnagregar un * extraencada línea. Primero, proporcioneunabrevedescripciónde loquehaceelmétodo.Si eligeunbuen nombre, ladescripciónsimplenoes tanimportante,peroladescripciónesunlugardonde puede brindar más detalles sobre el desempeño del método, detalles sobre su implementaciónuotrainformaciónútil.Ademásdeladescripción,debetenerun@paramy luegoel nombredel parámetroy luegoexplicar suscondicionesprevias, si lashubiera. Finalmente tenga un @return paraespecificar las condiciones posteriores.

Existe una herramienta oficial también llamada Javadocs que produce documentación
escrita en HTML, de hecho, la documentación oficial que usted ha escrito se produjo con esa
herramienta. También se pueden escribir Javadocs para clases, lo cual también es una
buena idea. "Documento Carlos Obregón"
```java
// ejemplo by Carlos Obregón
 //FORMA ANTIGUA
/**
 * 
 * Esta función verifica si un número es multiplo de otro.
 * <p>
 * Un número es considerado múltiplo de otro si el resultado de la división no genera residuo
 * No hay ningún número que sea multiplo de 0.
 * @param a es el posible múltiplo.
 * @param b es el posible factor (el número que divide al múltiplo).
 * @return true  si a es múltiplo de b, false si es caso contrario.
 */
public static boolean esMúltiplo (int a, int b){
    return (a % b) == 0;
}

// A PARTIR DE JAVA 23
// se usa markdown

/// es una función calcula si un año es bisiesto.
///
/// Las condiciones para ser bisiesto son: 
/// - ser múltiplo de 4
/// - ser m[ultiplo de 400 o no ser múltiplo de 100
///
///Un año bisiesto tiene 366 días
///@param año el año a verificar
///@return true si es bisiesto..
public static boolean esBisiesto(int año){
    return Aritmética.esMúltiplo(año,4);
}



```
- todas las funciones deberían llevar especificaciones 
- 1. click derecho en proyecto y export -> javaDocs -> finish (aceptar el lugar donde esta.)
- 2. despues al proyecto, archivos que genera eclipse en la carpeta docs se ve la documentacion realizada.
