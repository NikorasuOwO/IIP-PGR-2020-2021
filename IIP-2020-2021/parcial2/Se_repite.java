package parcial2;


/**
 * Write a description of class Se_repite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Se_repite {

    public static char PrimeraQueSeRepite1(String a) {
        
        char letra = ' ', letra2;
        
        
        for (int i = 0 ; i < a.length() ; i++){
            
            letra = a.charAt(i);
            
            for (int j = i+1 ; j < a.length() ; j++){
            
                letra2 = a.charAt(j);
                
                if(letra == letra2){ return letra;}
            
            }
        
        }
        
        
        return letra;
    }
    
        public static char VecesQueSeRepite(String a){
          
            String lista = new String("");
            
        for (int i = 0 ; i < a.length() ; i++){
            
            if(!lista.contains(""+a.charAt(i))){
                
                lista = lista + a.charAt(i);
                
            
            }
            
        }
        
        
        for(int i = 0 ; i < lista.length() ; i++){
        
            System.out.print(" "+lista.charAt(i));
        }
        
        return 'a';
    }
    
}
