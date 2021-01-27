package exam2Code;

/**
 * Clase Pregunta3. 
 * @author IIP - Parcial 2
 * @version 27/01/21
 */
public class Pregunta3 {
    private Pregunta3() { }   // No hay objetos de esta clase
    
    /** Devuelve el numero de iteraciones necesarias para que la diferencia
     *  en valor absoluto entre el valor de Math.PI y el valor de pi calculado
     *  usando el desarrollo en serie de Leibniz sea menor o igual que un epsilon 
     *  (double) dado.
     *  Precondicion: 0 <= epsilon < 1.
     */
    // COMPLETAR el metodo  
    
    public static int piLeibniz(double epsilon){
    
    double pi = 4; //Inicializamos pi al primer valor de la serie
    int i = 1; //El valor numero 0 de la serie es 4, empezamos a calcular por el valor 1.
    
    while(Math.abs(Math.PI - pi) > epsilon){ //Mientras el valor absoluto de Math.PI > epsilon, iteramos. Cuando se cumple <= epsilon, paramos.
        //System.out.println(" i:" + i +  " | pi" + pi +
        //" | mu: " + Math.abs(Math.PI - pi) +" | epsilon: " + epsilon);
        System.out.println("it");
        pi = pi + (Math.pow(-1,i)*4.0)/(2*i + 1); //En`pi acumulamos los valores los cocientes calculados con la fórmula.
        i++;
    
    }
    
        System.out.println(" i:" + i +  " | pi" + pi +
        " | mu: " + Math.abs(Math.PI - pi) +" | epsilon: " + epsilon);
    return i-1; //Hemos de devolver i-1, que es el número de iteraciones que hemos hecho.
    }
    
}
