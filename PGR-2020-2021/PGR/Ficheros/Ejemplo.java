package Ficheros;


/**
 * Write a description of class Ejemplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplo{
    
    /** Devuelve true si a[ini..fin] está ordenado ascendentemente,
     *  false en caso contrario.*/
    public static boolean ordenado(int[] a, int ini, int fin) {
        if (ini >= fin) { return true; }
        else {
            if (a[ini] > a[ini + 1] || a[fin] < a[fin - 1]) { return false; }
            else { return ordenado(a, ini + 1, fin - 1); }
        }
    }
}
