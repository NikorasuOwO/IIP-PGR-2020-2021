package Recursividad_otra_vez;


/**
 * Write a description of class Sesion3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sesion3
{

    public static boolean EstaOrdenado(int[] a, int ini, int fin){
        
        if(fin-ini + 1 < 2){
            return true;
        }
        else{
            return a[ini] <= a[ini+1] && EstaOrdenado(a,ini+1,fin);
        }
    }
    
    public static int BuscarCero_ordenado(int[] a, int pos){
        if(pos < 0 || a[pos] > 0){
            return -1;
        }else{
        
            if(a[pos] == 0){return pos;}
            else{return BuscarCero_ordenado(a,pos+1);}
        }
        
    }
    
        
    /** Buscar recursivamente si mi hipótesis h es igual a la suma de los elementos del array a **/
    public static boolean multisproof(int[] a, int h, int pos){ 
        
        if(h == 0){
            return true;
        }else{
            
            if(pos >= a.length || h - a[pos] < 0){
                return false;
            }else{
                
                h = h - a[pos];
                return multisproof(a,h,pos+1);
            
            }
        }
    }
    
    public static int bin2dec_inv_1(int[] bin, int pos){ //pos == 0 //ESTO ES MIERDA
        if(pos > bin.length - 1) return 0;
        else return (int) (bin[pos]*Math.pow(2, pos) )+ bin2dec_inv_1(bin,pos+1);
        
    }
    public static int bin2dec_inv_2(int[] bin, int pos){ //pos == 0 //ESTO ESTÁ MEJOR
        if(pos == bin.length) return 0;
           return bin[pos] + 2*bin2dec_inv_2(bin,pos+1);
        
    }
    
}
