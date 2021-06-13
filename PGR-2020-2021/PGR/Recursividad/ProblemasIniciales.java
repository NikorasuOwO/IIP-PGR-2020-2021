package Recursividad;


/**
 * Write a description of class ProblemasIniciales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemasIniciales {
    
    public static int multiplicacion(int a, int b) { // b >= 0
        
        if(b == 0){
            return 0;
        }else{
            return multiplicacion(a, b-1)+a;
        }
        
    }
    
    public static int cociente(int a, int b){ //a >= b
    if(a < b){
        return 0;
    }else{
        return cociente(a-b, b) + 1;
    }
    }
    
    public static int mult_rusa(int a, int b){
        
        if(b == 0){
            
            return 0;
        
        }else{
            
            if(b%2 == 0){
                return mult_rusa(2*a, b/2);
            }else{return mult_rusa(2*a, (b/2)) + a;}
        }
    
    
    }
    
    public static int potencia_rusa(int a, int b){ // a!=0 and b>=0
        
        if(b <= 1){ //CASO BASE
           if(b == 0){return 1;}else{return a;} 
        }
        if(b%2 == 0){ //CASO GENERAL
            return potencia_rusa(a, b/2)*potencia_rusa(a, b/2);
        
        }else{
            return potencia_rusa(a, b/2)*potencia_rusa(a, b/2)*a;
        
        }

    }
    
    public static int contador(int a){ //a >= 0
        
        if(a < 10){ //BASE
            return 1;
        }else{ //GENERAL
             return contador(a/10) + 1;
        }
    
    }
    
    public static int SumaDigitos(int n){ //n >= 0
        
        if(n < 10){ //CASO BASE
            return n;
        }else{ //CASO GENERAL
            return SumaDigitos(n/10) + (n%10);
        
        }
    
    
    }
    
    public static String dec2bin(int d){
        if(d == 1){ //B1
            return "1";
        }else{
            if(d == 0){ //B2
                return "0";
            }else{ //G
            
                Integer.toString(1);
            
                
                return "";
            }
        }
    }
    
    public static void main (String[] args){
        System.out.println("");
    }
}
