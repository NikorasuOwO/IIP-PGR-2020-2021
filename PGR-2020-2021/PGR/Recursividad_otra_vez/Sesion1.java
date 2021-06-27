package Recursividad_otra_vez;


/**
 * Write a description of class Sesion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sesion1{
    
    public static int producto(int a, int b){
        if(b == 0){return 0;}else{
        return a + producto(a, b-1);}
    }
    
    public static int cociente(int a, int b){
        if(a < b){
            return 0;
        }
        else{
            return 1 + cociente(a-b, b);
        }
    }
    
    public static int multiplicacion_rusa(int a, int b){
        
        if(b <= 0){
            return 0;
        }else{
            if(b % 2 == 0){
                return multiplicacion_rusa(2*a,b/2);
            }else{
                return a + multiplicacion_rusa(2*a,b/2);
            }
        }
        
    }
    
    public static int potencia_rusa(int a, int b){
    
        if(b > 1){
            if(b % 2 == 0){
                return potencia_rusa(a,b/2)*potencia_rusa(a,b/2);
            }else{
                return potencia_rusa(a,b/2) *potencia_rusa(a,b/2) * a;
            }
        
        }else{ // b <= 1
            if(b == 1){
                return a;
            }else{return 1;}
        
        }
    
    }
    
    public static int numero_digitos(int a){
        
        if(a == 0){return 0;}
        
            return 1 + numero_digitos(a/10);
        
    }
    
    public static int SumaDigitos(int a){
        
        if(a == 0){
            return 0;
        }else{
            return a%10 + SumaDigitos(a/10);
        }
    
    }
    
    public static int InvertirDigitos(int a){
       
        if(a == 0){
            return 0;
        }else{
            
            int digito = (a%10);
            int potencia = (int) Math.log10(a) ;
            
            return digito * ((int) Math.pow(10, potencia))+ InvertirDigitos(a/10);
        
        }
        
    }
    
    public static int dec2bin(int a){
    
        if(a == 0){
            return 0;
        }else{
            return (a%2) + 10 * dec2bin(a/2);
        }
    }
    
}
