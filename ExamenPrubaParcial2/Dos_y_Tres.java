package ExamenPrubaParcial2;

public class Dos_y_Tres{
    public Dos_y_Tres(){;}
    
    public static int firstRepeatedElement(int[] array){
        
        int first = -1;
        //Recorremos el array
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i] == array[j]){first = array[i]; return first;}
            }
        }
        return first;
    }
    
}
