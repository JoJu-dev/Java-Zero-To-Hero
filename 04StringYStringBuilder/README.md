# String y StringBuilder

## String
- Es una secuencia de carácteres: letras, dígitos, signos de puntuación, emojis. entre otros.
- **Un String** no es un tipo de dato primitivo, **es una clase**.
- El primer incice de un String es siempre 0, y el último índice es la longitud del String menos 1.
- Si se utiliza un índice que no sea válido, menor que 0 y mayor o igual al tamaño del String obtendrás un error en tiempo de ejecución.
- :loudspeaker: En los String no utilizar `== | !=`, se debe utilizar `equals`.

### Substring
- El método substring() en Java se utiliza para obtener una parte (subcadena) de una cadena (String).
- Detalles clave:
    - Los índices empiezan en 0.
    - El índice fin es exclusivo.
    - Lanza IndexOutOfBoundsException si los índices son inválidos.

```java
String sub = original.substring(inicio);           // Desde 'inicio' hasta el final
String sub = original.substring(inicio, fin);      // Desde 'inicio' hasta 'fin' (sin incluir 'fin')

String texto = "Hola Mundo";
String sub1 = texto.substring(5);        // "Mundo"
String sub2 = texto.substring(0, 4);     // "Hola"

```
## Métodos que se pueden utilizar con String
### Métodos más utilizados de la clase `String` en Java

| Método                                  | Descripción                                            | Ejemplo                                                       |
|-----------------------------------------|--------------------------------------------------------|---------------------------------------------------------------|
| `length()`                              | Devuelve la longitud de la cadena                     | `"Hola".length()` → `4`                                       |
| `charAt(int index)`                     | Devuelve el carácter en la posición dada              | `"Hola".charAt(1)` → `'o'`                                    |
| `substring(int beginIndex)`             | Subcadena desde índice hasta el final                 | `"Hola Mundo".substring(5)` → `"Mundo"`                       |
| `substring(int, int)`                   | Subcadena entre dos índices (fin excluido)            | `"Hola Mundo".substring(0, 4)` → `"Hola"`                     |
| `toLowerCase()`                         | Convierte a minúsculas                                | `"HOLA".toLowerCase()` → `"hola"`                             |
| `toUpperCase()`                         | Convierte a mayúsculas                                | `"hola".toUpperCase()` → `"HOLA"`                             |
| `equals(String)`                        | Compara dos cadenas (sensibles a mayúsculas)          | `"Hola".equals("hola")` → `false`                             |
| `equalsIgnoreCase(String)`              | Compara dos cadenas ignorando mayúsculas              | `"Hola".equalsIgnoreCase("hola")` → `true`                    |
| `contains(CharSequence)`                | Verifica si contiene una subcadena                    | `"Hola Mundo".contains("Mun")` → `true`                       |
| `indexOf(String)`                       | Devuelve posición de la **primera** aparición         | `"Hola Mundo".indexOf("o")` → `1`                             |
| `lastIndexOf(String)`                   | Devuelve posición de la **última** aparición          | `"Hola Mundo".lastIndexOf("o")` → `9`                         |
| `replace(CharSequence, CharSequence)`   | Reemplaza texto                                       | `"Hola Mundo".replace("Mundo", "Java")` → `"Hola Java"`       |
| `trim()`                                | Elimina espacios al inicio y fin                      | `"  Hola  ".trim()` → `"Hola"`                                |
| `split(String)`                         | Divide la cadena en partes por un separador           | `"Ana,Juan".split(",")` → `["Ana", "Juan"]`                   |
| `startsWith(String)`                    | Verifica si empieza con cierto prefijo                | `"Hola Mundo".startsWith("Hola")` → `true`                    |
| `endsWith(String)`                      | Verifica si termina con cierto sufijo                 | `"Hola Mundo".endsWith("do")` → `true`                        |

### StringBuilder
- StringBuilder es una clase en Java que se usa para manipular cadenas de texto de forma eficiente cuando se requiere realizar muchas modificaciones (como concatenar, insertar, eliminar, etc.).
- Las cadenas (String) son inmutables, lo que significa que cada modificación crea un nuevo objeto.
- StringBuilder evita crear múltiples objetos, mejorando el rendimiento en operaciones repetidas.

## 📌 StringBuilder en Java

`StringBuilder` es una clase utilizada para manipular cadenas de texto de manera eficiente, especialmente cuando se requiere modificar el contenido muchas veces (concatenar, insertar, eliminar, etc.).

| 🧩 Característica         | 📝 Detalle                                                                 |
|--------------------------|----------------------------------------------------------------------------|
| 📦 Clase                 | `java.lang.StringBuilder`                                                  |
| 🔄 Mutable               | Sí                                                                         |
| 🚀 Rendimiento           | Alto para concatenaciones múltiples                                        |
| 🔒 Thread-safe           | ❌ No (usar `StringBuffer` si se necesita sincronización)                  |
| 🧰 Métodos principales   | `append()`, `insert()`, `delete()`, `replace()`, `reverse()`, `toString()` |
| 🛠️ Uso recomendado       | Modificar cadenas en bucles o procesos intensivos                          |

### 🔧 Ejemplo de uso

```java
StringBuilder sb = new StringBuilder();
sb.append("Hola");
sb.append(" Mundo");
System.out.println(sb.toString());  // Salida: Hola Mundo
```

### 📚 Métodos comunes de StringBuilder

### 📚 Métodos comunes de StringBuilder con ejemplos

| Método | Descripción | Ejemplo |
|--------|-------------|---------|
| `append(String str)` | Añade texto al final. | `sb.append("Mundo");` → `HolaMundo` |
| `insert(int offset, String str)` | Inserta texto en una posición. | `sb.insert(4, " lindo");` → `Hola lindo Mundo` |
| `delete(int start, int end)` | Elimina caracteres de un rango. | `sb.delete(0, 5);` → `lindo Mundo` |
| `deleteCharAt(int index)` | Elimina un carácter en una posición. | `sb.deleteCharAt(0);` → `indo Mundo` |
| `replace(int start, int end, String str)` | Reemplaza una parte del texto. | `sb.replace(0, 5, "Hola");` → `Hola Mundo` |
| `reverse()` | Invierte el texto. | `sb.reverse();` → `odnuM aloH` |
| `length()` | Devuelve la longitud del texto. | `sb.length();` → `10` |
| `capacity()` | Capacidad interna (buffer). | `sb.capacity();` → Depende del constructor |
| `setLength(int newLength)` | Cambia la longitud. | `sb.setLength(4);` → `Hola` |
| `charAt(int index)` | Obtiene el carácter en una posición. | `sb.charAt(1);` → `o` |
| `setCharAt(int index, char ch)` | Reemplaza un carácter. | `sb.setCharAt(0, 'M');` → `Mola` |
| `toString()` | Convierte en `String`. | `String s = sb.toString();` |

### 🧪 Ejemplo completo en código:

```java
StringBuilder sb = new StringBuilder("Hola");
sb.append(" Mundo");                     // Hola Mundo
sb.insert(4, " lindo");                 // Hola lindo Mundo
sb.delete(0, 5);                        // lindo Mundo
sb.replace(0, 5, "Hola");              // Hola Mundo
sb.reverse();                          // odnuM aloH
System.out.println(sb.toString());
```

### Character y sus Métodos

### 🔡 Métodos comunes de `Character` en Java

### 🔡 Métodos útiles de `Character` (ampliado)

| Método | Descripción | Ejemplo |
|---|-------------|---------|
| `isLetterOrDigit(char ch)` | Verifica si es letra o dígito | `Character.isLetterOrDigit('A')` → `true` |
| `isSpaceChar(char ch)` | Verifica si es espacio según Unicode (distinto de `isWhitespace`) | `Character.isSpaceChar('\u2000')` → `true` |
| `isISOControl(int codePoint)` | Verifica si es carácter de control ISO (rango U+0000..U+001F o U+007F..U+009F) | `Character.isISOControl(0x0005)` → `true` |
| `isDefined(char ch)` / `isDefined(int codePoint)` | Verifica si el carácter está definido en Unicode | `Character.isDefined('\uFFFF')` → `true` (o `false`, dependiendo del valor) |
| `isJavaIdentifierStart(char ch)` / `isJavaIdentifierStart(int cp)` | Verifica si puede iniciar un identificador Java | `Character.isJavaIdentifierStart('a')` → `true` |
| `isJavaIdentifierPart(char ch)` / `isJavaIdentifierPart(int cp)` | Verifica si puede ser parte de un identificador Java (no necesariamente al inicio) | `Character.isJavaIdentifierPart('3')` → `true` |
| `getType(char ch)` / `getType(int cp)` | Retorna un entero que representa la categoría Unicode del carácter (letra, dígito, puntuación, etc.) | `Character.getType('A')` → `Character.UPPERCASE_LETTER` |
| `forDigit(int digit, int radix)` | Devuelve el carácter para el dígito en una base dada (0‑9, a‑z) | `Character.forDigit(10, 16)` → `'a'` |
| `charCount(int codePoint)` | Cantidad de unidades `char` necesarias para representar un punto de código Unicode | `Character.charCount(0x1F600)` → `2` |
| `codePointAt(...)` | Recupera el punto de código Unicode en una posición de array o secuencia de chars | `Character.codePointAt("ño".toCharArray(), 0)` → código Unicode de ‘ñ’ |
| `codePointBefore(...)` | Punto de código antes de cierta posición | `Character.codePointBefore("ño".toCharArray(), 1)` |
| `codePointCount(...)` | Cuenta cuántos puntos de código hay en un rango | `Character.codePointCount("año", 0, 3)` → `3` |
| `isTitleCase(char ch)` / `isTitleCase(int cp)` | Verifica si el carácter es de “title case” (uso especial en Unicode) | `Character.isTitleCase('ǅ')` → `true` |
| `valueOf(char c)` | Retorna un objeto `Character` para el `char` dado (usa cache para caracteres comunes) | `Character.valueOf('A')` |
| `hashCode()` | Retorna el código hash del objeto `Character` (llama internamente al valor del char) | `new Character('A').hashCode()` |
| `equals(Object obj)` | Verifica igualdad con otro objeto `Character` | `new Character('A').equals(Character.valueOf('A'))` |

