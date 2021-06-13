package Recursividad;

public class Programas_10_MARZO { 
    
    public static void printn(int n){ //PRINT EN VIAJE DE IDA
        
        if(n == 1){
            System.out.println("1");
        
        }else{ //CASO GENERAL
           System.out.println(n);
           printn(n-1);
        
        }
    
    }
    
    
    public static void printn_INV(int n){ //PRINT EN VIAJE DE VUELTA
        
        if(n == 1){
            System.out.println("1");
        
        }else{ //CASO GENERAL

           printn_INV(n-1);
           System.out.println(n);
        }
    
    }
    /** n >= 0. */
    public static void escribeRaro(int n) {
        if (n > 0) {
            System.out.print(n);
            escribeRaro(n - 1);
            System.out.print(n);
        }
        else { System.out.print(0); }
    }
    public static void invDigitDisplay(int n){
        
    if(n < 10){
    System.out.println(n);
    }else{
    System.out.println(n%10);
    invDigitDisplay(n/10);
    }
    
    }
}
