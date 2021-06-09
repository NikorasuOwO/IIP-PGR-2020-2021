package exam2;

 

/**
 * Clase IIPMath: clase de utilidades que implementa
 * algunas operaciones matematicas.
 * 
 * @Nicolás Antonio Bermell Ferrer Parcial 2 - Ejercicio 1 
 * @version IIP - Curso 2020-21
 */
public class IIPMath {
    /** No se pueden crear objetos de este tipo. */
    private IIPMath() { }
    
    /** Devuelve la suma de los terminos de la serie:
     *     a_1 = 2 
     *     a_i = a_(i-1) + 5 * i, i > 1
     *  hasta que el ultimo termino sumado sea mayor 
     *  o igual que value.
     *  PRECONDICION: 0 < value
     */  
    public static int sumTerms(int value) { 
        int a = 2; //El primer término de la serie es 2.
        int i = 2; //El índice de a_1 es 1 pero hay que sumar 1 porque vamos a calcular el segundo término.
                   //El cálculo es a_i = a_i-1 + 5*i, no a_i = a_i-1 + 5*(i-1)
        
        while(a < value){ //Mientras el valor de a sea menor que value, no hemos llegado a la condición,
                          //cuando la condición se cumpla salimos del bucle. 
            
            a = a + 5*i; //Hacemos el cálculo.
            i++; //Actualizamos el índice.
        }
        
        return a; //Devolvemos a, será el primer valor de la serie tal que a >= value
    }
    
    
    
}