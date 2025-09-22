#### Descripción de Ejercicios: :clipboard:

 
| Titulo | Descripción | Nombre del Archivo |
|--------|-------------|--------------------|
| Errores de compilación o ejecución | Leer e interpretar los errores en ejecunción y luego ejecutar|[ErroresCompilador_ejecución](https://github.com/JoJu-dev/Java-Zero-To-Hero/blob/02Operadores/02Operadores/ErroresCompilador_ejecuci%C3%B3n) |
| Ejercicios de codificación | Interpretar y ejecutar los ejercicios con su solución | [Ejercicio_Codificacion](https://github.com/JoJu-dev/Java-Zero-To-Hero/blob/02Operadores/02Operadores/Ejercicio_Codificacion) |  
| Ejercicios de corrección de Código| Revisa el código y ejecútalo con su respectiva correción |[Correccion_Codigo](https://github.com/JoJu-dev/Java-Zero-To-Hero/blob/02Operadores/02Operadores/Correccion_Codigo)|


# Notas:  Operadores :hamburger:

- `Math.sqrt()`: Función para calcular la raíz cuadrada de un número, Recibe un double y retorna un double.
``` java
 int numero = 2;
 int cuadrado = Math.sqrt(numero); 
 System.out.println(cuadrado)//4

```
- Java viene con algunos tipos definidos que se denominan primitivos para representar tipos básicos: caracteres, números y predicados. Los siguientes son los mas utilizados.

## Recomendaciones :space_invader:
1. :blue_book: Utiliza siempre un espacio antes y después de un operador binario, ya que hace el código sea mucho más   legible, no escribas `a+b`, prefiere escribir `a + b`.
2. :ledger: Definir una cadena usando comillas simples en java es un error del compilador. No utilices `'Hola mundo'`.
3. :ledger: La división de dos números enteros dan como resultado un número entero.


#### Tipos Primitivos
| Palabra Clave | Descripción | Ejemplo Literal |
|---------------|-------------|------------------|
| char          | Caracteres Unicode | 'A', 'a', '1', ' ', 'Ó', '@', etc |
| boolean       | Predicados         | true, false                       |   
| int           | Enteros            | 1, -17, 123_00, etc               |
| double        | Números Reales     | 1.123, -1.123, 0.0, etc           |

#### Operadores Númericos
| Palabra Clave | Descripción    |  Ejemplo Literal        |
|---------------|----------------|-------------------------|
| +             | adicion        | a + b, x + 1            |
| -             | sustraccion    | a - b, x-1              |   
| *             | multiplicación | a * b, x * 10           |
| /             | división       | 1.123, -1.123, 0.0, etc |
| %             | modulo         | 1.123, -1.123, 0.0, etc |

:loudspeaker: El operador modulo `%` devuelve el resto despues de la división de los dos números.

#### Operadores de Relación
| Palabra Clave | Descripción    |  Ejemplo Literal        |
|---------------|----------------|-------------------------|
| <             | Menor que      | a < b, x < 0.0          |
| <=            | Menor o igual  | a <= b, length <= 1     |   
| >             | Mayor que      | a > b, reaminder > 10   |        
| >=            | Mayor o igual  | a >= b, (a + b) >= 1    |
| ==            | Igual          | a == b, size == 1       |
| !=            | Diferente      | a != b, s != 1          |

#### Operadores Lógicos
| Simbolo       | Descripción    |  Ejemplo Literal           |
|---------------|----------------|----------------------------|
| &&            | logic AND      | a && b, x > 0.0  && a < 10 |
| ||            | logic OR       | a || b, (a!= b || b == 10) |   
| !             | negate         | !contains                  |        

:loudspeaker:
- El resultado del AND lógico sólo puede resultar en verdadero cuando ambos operandos son verdaderos.
- El resultado del OR lógico sólo puede resultar en falso cuando ambos operandos son falsos.

### Operador Ternario
- La mayoria de los operadores son binarios, que que significa que operan sobre dos valores, como la suma. En matemáticas y lógica.
- También existen operadores unitarios que utilizan un solo valor. El `operador negativo` en programación es un operador unitario.
- `Operador Ternario`:
- Si la operación es verdadera evalúa el primer valor, el que esta entre `?` y `:`
- Si es falso, se evalúa como el segundo valor, el que esta despues de `:`

```java
// <predicado> ? <valor1> : <valor2>;
(2 > 10) ? true : false;
```

### Casting
-  Casting es una operación donde tomamos una variable de un tipo de dato y le pedimos al compilador que la trate como una variable de otro tipo de dato compatible, en primitivas solo funciona con variables numéricas.
-  Hay otro uso común para casting. Math es una clase que tiene muchos métodos interesantes. 
- Dos de esas funciones son:
 1. `ceil()` ambas toman una variable double y retornan un valor double con el menor número entero mayor que el valor dado.  
 2. `floor()`: retorna el mayor número que sea menor que el valor dado. 

```java
//Casting
var n = (int) = 3.13;

Math.ceil(7.5) //8.0
Math.floor(7.5) //7.0
```
