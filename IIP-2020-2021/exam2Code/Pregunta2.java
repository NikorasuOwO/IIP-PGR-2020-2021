package exam2Code;

/**
 * Clase Pregunta2. 
 * @Nicolás Antonio Bermell Ferrer IIP - Parcial 2
 * @version 27/01/21
 */
public class Pregunta2 {
    private Pregunta2() { }   // No hay objetos de esta clase
    
    /** Devuelve el numero de parejas de dos arrays enteros a y b 
     *  que suman cero (a[i] + b[j] = 0).
     *  Precondicion: a.length > 0, b.length > 0     y puede ser 
     *  que a.length != b.length. 
     */
    // COMPLETAR el metodo    
    public static int ParejasNulas(int[] a, int[] b){
    
    int num = 0; //Variable que almacenará el número de parejas
    
    //NOTA: Se usan dos variables j e i como índices para los arrays a y b porque la longitud de los mismos puede ser diferente. 
    
    for(int i = 0 ; i < a.length ; i++){ //Recorremos a
    
        for(int j = 0 ; j < b.length ; j++){ //Para cada elemento de a, recorremos b, recorreremos b a.length veces
        
            if( a[i] + b[j] == 0){ // Para cada elemento de b, habiendo llegado a un cierto elemento de a recorriendo a, comprobamos 
                                   // si el elemento de a más el de b dan como resultado 0. Si es el caso, hemos detectado una pareja. 
                num++; //Sumamos uno al contador de parejas.
            }
            
        }
    
    
    }
    
    return num; //Finalmente, cuando ya hemos recorrido a y hemos probado todas las parejas posibles, devolvemos el número de parejas. 
    }
         
}
