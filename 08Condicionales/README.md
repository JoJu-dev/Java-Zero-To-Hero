# Condicionales
## Switch
- Con un switch podemos actuar según el valor de la variable. La sentencia switch provee una lista de valores y el valor que se debe retornar si la variable tiene ese valor.
- Un switch puede tener tantas sentencias case como sean necesarioas, pero también tiene que proveer una sentencia `defult`.
- Ejemplo recomendado de usar un switch.
```java
//by Carlos Obregón 
boolean esVocal(char c){
    return switch(mayúscula){
        case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> true;
        default -> false; 
    }
}
```
## Regreso Anticipado.
- Al utilizar retornos anticipados con un return evitar utlilizar la opcion else.

##Nota 
- Para influir en el flujo de la ejecución de una función tienes, fundamentalmente, dos construcciones:
    1. Ciclos
    2. Condicionales.
- Con los condicionales, puede escribir código que solo se ejecute bajo una determinada condición.
- Las declaraciones de switch asignan un valor posible a algún código.
