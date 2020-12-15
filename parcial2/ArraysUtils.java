package parcial2;

//import java.util.vector.firstElement();
import java.util.*;
import java.util.Arrays;
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysUtils {

    public static double MediaArray(double[] a) {
        
        double media = 0;
       
        for(int i = 0 ; i < a.length ; i++){
            
            media = media + a[i];
        
        }
        
        media = media/a.length;
        
    return media;
    }
    
    public static double MinArray(double[] a){
    
    double min = a[0];
       
        for(int i = 1 ; i < a.length ; i++){
            
            if(min > a[i]){min = a[i];}
        
        }
        
    return min;
    
    }
    
    public static double MediaPonderada(double[] lista, double[] pesos){
        
        if(lista.length != pesos.length){return Double.NaN;}
        
        double Media = 0;
        
        for(int i = 0 ; i < lista.length ; i++){
            
            Media = Media + lista[i] * pesos[i];
        
        }
        
        return Media;
    }
    
    public static boolean ContainsChar(String a , char c){
    
        //Este método devuelve true o false en función de si el String a contiene el caracter c
        
        a = a.toLowerCase();
        
    for(int i = 0 ; i < a.length() ; i++){ //Comprobamos si el String tiene el caracter en minúscula
       
        if(a.charAt(i) == c){ return true;}
        
    }

        String A = a.toUpperCase();
        
    for(int i = 0 ; i < a.length() ; i++){  //Comprobamos si el String tiene el caracter en mayúscula
        
        if(A.charAt(i) == c ){ return true;}
        
    }
    
    return false;
    }
    public static int ContadorCaracter(String a, char c, boolean CaseSensitive){
    
        int contador = 0;
    //Recorremos el String buscando las diferentes letras
        if(CaseSensitive == true){
    
            for(int i = 0 ; i < a.length() ; i++){
        
                if(a.charAt(i) == c){
        
                    contador++;
            
                }
    
            }
        }else{
            String auxSt = "";
            auxSt += c;
            
            char C = auxSt.toLowerCase().charAt(0); //C es la letra mayúscula corresondiente a c
            char newc = auxSt.toUpperCase().charAt(0); //C es la letra minúscula corresondiente a c
            
            for(int i = 0 ; i < a.length() ; i++){
                
                if(a.charAt(i) == C || a.charAt(i) == newc){
                    System.out.println("!!");
                    contador++;
                }
   
     
            }    
        }
        
        return contador;
}
    public static String arrayToString(char[] array){
        
        String st = new String("");
        
        for(int i = 0 ; i < array.length ; i++){
        
            st = st + array[i];
            
        }
        return st;
    }
    
    public static char[] stringToCharArray(String st){
        
        char[] array = new char[st.length()];
        
        for(int i = 0 ; i < st.length() ; i++){
        
            array[i] = st.charAt(i);
            
        }
        return array;
    }
    
    public static void main (String args[]){
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Dime una palabra");
        
        String palabra = tec.next();
        
        System.out.println("Tu palabra es: " + palabra);
        System.out.println("Tu palabra en Array es: ");
        
        char[] array = stringToCharArray(palabra);
        
        for(int i = 0 ; i < array.length ; i++){
            
        System.out.print(" "+array[i]);

        
        }

    }
}
