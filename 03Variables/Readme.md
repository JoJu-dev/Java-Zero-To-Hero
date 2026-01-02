## Variables
- Ahora en java desde la version 10 se puede utilizar la palabra clave`var` para crear variables.
- Evita utilizar números mágios: Es el uso de los literates que no queda claro su valor "Carlos Obregón".
- Las variables definidas con <var> tienen un tipo y se inferirira por el tipo de valor en la
asignación "Carlos Obregón".
```java
//ejemplo
double tercerÁngulo(dobule alfa,  double beta){
    //la suma de los 3 ángulos de un triángulo es siempre 180.0

    var tercerÁngulo = 180.0 - (alfa + beta);
    return tercerÁngulo;
}

//ejemplo
double tercerÁngulo(dobule alfa,  double beta){
    //la suma de los 3 ángulos de un triángulo es siempre 180.0
   var sumaDeTodosLosAngulos = 180;
   var sumaDeÁngulosConocidos = (alfa + beta);
    var tercerÁngulo = sumaDeTodosLosÁngulos - sumaDeÁngulosConocidos;
    return tercerÁngulo;
}

```
- Reasignaciones: Es mejor evitarlas. 
