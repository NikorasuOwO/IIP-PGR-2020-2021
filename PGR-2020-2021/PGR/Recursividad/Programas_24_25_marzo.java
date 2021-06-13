package Recursividad;

public class Programas_24_25_marzo {
    //0 <= pos < a.length-1
    public static boolean EstaOrdenado(int[] a, int pos) {
        
        //boolean r = false;
        
        if(pos == a.length-2){ //BASE
            return a[a.length-2] <= a[a.length-1];
        }else{ //GENERAL
            if(a[pos] <= a[pos+1]){ return EstaOrdenado(a, pos+1);}
        }
        return false;
    }
    
    public static int BuscarCorteX(double[] a, int pos){
        
        if(pos == a.length || a[pos] > 0){
            return -1;
        }else{
            if(a[pos] == 0){
                    return pos;
                }else{
                    return BuscarCorteX(a, pos+1);
                }
            }
        }
        
    /** Buscar recursivamente si mi hipótesis h es igual a la suma de los elementos del array a **/
    public static boolean multisproof(int[] a, int h, int pos){ 
        
        if(pos > a.length-1){ //BASE
            //System.out.println("BASE. a[pos] = "+a[pos]+"| pos = "+ pos+ "| h = "+h);
            return (h == 0);
        }else{ //GENERAL
            if((h-3)-(a.length-pos-1)*3 <= 0){ //Comprobamos si siendo todos los elementos 3 (el máximo) la hipótesis es alcanzable.
                //System.out.println("G. a[pos] = "+a[pos]+"| pos = "+ pos+ "| h = "+h);
                if(h > 0 && a[pos]<=h){return multisproof(a, h-a[pos], pos+1);}else{return false;} //Comprobamos si la hipótesis es demasiado pequeña
            }else{return false;}
        }
    
    }
    
    public static int bin2dec(int[] bin, int pos){ //pos == 0
        if(bin.length-1 == pos){ //BASE: numero binario con 1 digito
            return bin[pos];
        }else{
            return (int) Math.pow(2*bin[pos], bin.length-1 - pos) + bin2dec(bin, pos+1); 
            //General: un número binario abc en decimal es a00 en decimal + bc en decimal
        }
    }
    public static int bin_inv_2dec(int[] bin, int pos){ //pos == 0
        if(bin.length-1 == pos){ //BASE: numero binario con 1 digito
            return bin[pos];
        }else{
            return bin[pos] + 2*bin_inv_2dec(bin, pos+1);
        }
    }
     public static int bin2dec_desc_alt(){
     }
}
