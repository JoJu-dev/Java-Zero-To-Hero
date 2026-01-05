## Arrays y Arrays Multidimencionales.
- Métodos utiles para usar arreglos en java.
 1. `Arrays.sort(array)`: Ordena los elementos del array de menor a mayor.

 2. `Arrays.binarySearch(array, valor)`: Busca un elemento y devuelve su índice (el array debe estar ordenado).

 3. `Arrays.equals(array1, array2)`: Compara si dos arrays tienen los mismos elementos en el mismo orden.

 4. `Arrays.toString(array)`: Convierte el array en una cadena legible.

 5. `Arrays.fill(array, valor)`: Rellena el array con el valor indicado.

 6. `Arrays.copyOf(array, nuevoTamaño)`: Crea una copia del array con un tamaño específico.

 7. `Arrays.copyOfRange(array, inicio, fin)`: Copia una parte del array dentro de un rango.
 
 8. `fill(array, from, to, value)`: Rellena solo un rango. 

 9. `asList(T... elements)`: Convierte un array en una lista fija.

- Los arrays son como cualquier variable, asi que podemos usarlos como parámetros igualmente.
- El tipo de dato de un arreglo de elementos es <double[]>, el de un estring es <String[]>  
- Para conocer la longitud de un arreglo usamos una propiedad llamada `length`.

## Mutabilidad de los arreglos.
- Lamodificacióndeunamatriz,yenrealidaddecualquierobjetomutable,dada como parámetro suele ser una causa de errores lógicos en el código. Una forma sencilla de evitar esto es crear una copia de la matriz.

## Valores Predeterminados
- Si un arreglo es un contenedor. Qué sucede cuándo creamos un contenedor con un tamaño pero sin ningún valor aún? Hagamos un experimento.
```java 
new int[1]{ 0};
new double[1] {0.0};
new char[1]{'\000'};
```
- La mayoria de arreglos vacios se representa con un valor cero que es el que se obtienes como valor por defecto en un arreglo.
- Existe un carácter unicode con valor `0`, este pertenece a rango de carcteres que no son imprimibles asi que imprimirlo no hace mucho.
- Para Strings vemos el valor `null`. Un array vacio tiene predeterminado el valor null.

## Arrays Multidimencionales
- Se le conoce como matriz.
- se puede realizar una copia de una matriz con `arrays.copyOf(inicial, inicial.length)`