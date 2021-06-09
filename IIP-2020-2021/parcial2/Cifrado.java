package parcial2;
import java.util.*;

public class Cifrado {
    public static char desplazar(char ch, String alf, int k) {
        
        ch = Character.toLowerCase(ch);
        
        if(!alf.contains(Character.toString(ch))){return ch;} //Si el alfabeto no contiene el caracter, se devuelve tal cual
        
        int index = (alf.indexOf(Character.toString(ch)) + k)%alf.length(); //Asociamos a index el índice de ch en alf, cogemos el
        char ch2 = alf.charAt(index);                                       //resto de la división por alf.lenght() para que sea cíclico el cambio
        
        return ch2;
    }
    
    public static String alfInv(String alf){ //Este método invierte un String
    
        String Inv = new String();
        
        for(int i = alf.length()-1 ; i > -1 ; i--){
            
            Inv = Inv + alf.charAt(i);
        
        }
        return Inv;
    }
    
    public static String CodeCesar(String m, String alf, int k){ //Este método codifica un mensaje m dado, en Cesar
        
        String mCoded = new String(); //Creamos el string que tendrá el mensaje codificado
        
        for(int i = 0 ; i < m.length() ; i++){ //Vamos a iterar el mensaje, codificar cada letra, añadir la letra al mensaje codificado
            
            mCoded = mCoded + desplazar(m.charAt(i),alf,k);
        
        }
        
        return mCoded;
    }
    
    public static String DecoCesar(String mCoded, String alf, int k){ //Este método decodificará un mensaje ya codificado en Cesar
    
        String m = new String(); //Mensaje final
        String Invalf = alfInv(alf); //Invertimos el alfabeto.
        m = CodeCesar(mCoded, Invalf, k); //Decodificar con respecto a un alfabeto dado es como codificar con el inverso.
        
    return m;
    }
    
    public static boolean EnAlfabeto(String palabra, String alfabeto){ //Este método comprueba si la palabra está en el alfabeto

        for(int i = 0 ; i < palabra.length() ; i++){
            
            String letra = palabra.substring(i, i+1);
            
            if(alfabeto.indexOf(letra) == -1){return false;}
        
        }
        return true;
    }
    
    public static String CodeVig(String m, String alf, String palabra){
        
        if(!EnAlfabeto(palabra, alf)){
            
            System.out.println("Tu palabra no está en el alfabeto");
            System.exit(0);
        
        }
        
        int[] palabraIndex = new int[palabra.length()]; //array con los desplazamientos respectivoa de cada letra de la palabra
        String mCoded = new String(); //Mensaje codificado
        
        for(int i = 0 ; i < palabra.length() ; i++){ //Creamos un array con los desplazamientos respectivoa de cada letra de la palabra
        
            palabraIndex[i] = alf.indexOf(palabra.substring(i, i+1));
        
        }
        
        //ArraysUtils.displayArray(palabraIndex);
        System.out.println("\n");
      
        for(int i = 0 ; i < m.length() ; i++){ //Codificamos el mensaje
            
            int indicePalabra = i%palabra.length();/*Este es el índice que usaremos para acceder al array de desplazamientos.
                                                     Hacer el resto entre el índice al que accedemos de m y la longitud de palabra
                                                     nos evita tener que anidar bucles, menos líneas de código y menor complejidad.*/
                                                    
            mCoded = mCoded + desplazar(m.charAt(i), alf, palabraIndex[indicePalabra]);
            
            //System.out.println(mCoded);
        
        }
        
        return mCoded;
    }
    
    public static String DecoVig(String m, String alf, String palabra){

        if(!EnAlfabeto(palabra, alf)){
            
            System.out.println("Tu palabra no está en el alfabeto");
            System.exit(0);
        
        }
        
        /* Para decodificar una palabra en Vinegère vamos a utilizar el propio método de codificar.
         * La función que codifica (CodeVig) recibirá como mensaje a codificar el mensaje que queremos decodificar (m)
         * Con respecto al alfabeto, CodeVig recibirá el alfabeto en orden inverso.
         * Codevig recibirá también la palabra, pero ojo, "escrita" en el alfabeto inverso.
         * Esto último es para que el array contenga los desplazamientos correctos, "codificados" con el alfabeto en orden normal
         * para eso, primero escribimos la palabra en el afabeto inverso, y de esa manera cuando el método CodeVig extraiga de la
         * palabra el array de desplazamientos, tendrá los desplazamientos correctos, "codificados" con el alfabeto en orden normal
         * y no en orden inveros.
         * 
         * e.g. alf = "abcdefgh" ; palabra = "bed" --> array = [1,4,3]
         *      alfInv = "hgfedcba" ; palabraEnInverso = "gde" ---> array = [1,4,3] 
         * 
         * En definitiva, buscamos una palabra que nos dé los mismos desplazamientos, pero con el alfabeto inverso.
           
           
         */
        
        
        String InvAlf = alfInv(alf);
        
        int[] Desplazamientos = new int[palabra.length()];
        
        String palabraNueva = "";
        
        for(int i = 0 ; i < palabra.length() ; i++){ //Adquirimos los desplazamientos en el alfabeto inverso respectivos a
                                                     //cada letra de la palabra
        
            Desplazamientos[i] = InvAlf.indexOf(palabra.substring(i, i+1));
        
        }

        for(int i = 0 ; i < palabra.length() ; i++){ //Adquirimos la palabra respectiva a los desplazamientos del array.
                                                     //Obtenemos la palabra en el alfabeto inverso.
            
            palabraNueva = palabraNueva + alf.charAt(Desplazamientos[i]);
        
        }
        
        
        return CodeVig(m,InvAlf,palabraNueva);
    
    }
    
    
    public static void main(){
    
        String alf = "abcdefghijklmnñopqrstuvwxyz";
        
        /*int k = 2;
        String aCoded = CodeCesar(a,alf,k);
        String aDeco = DecoCesar(aCoded,alf,k);
        System.out.println(a);
        System.out.println("Codificación: "+aCoded);
        System.out.println("De-codificación: "+aDeco + "\n");*/
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime tu mensaje: ");
        String a = teclado.nextLine();
        
        System.out.println("Dime tu palabra: ");
        String palabra = teclado.next().toLowerCase();
        
        //System.out.println("CODING");
        String aCoded = CodeVig(a,alf,palabra);
        
        //System.out.println("DE-CODING");
        String aDeco = DecoVig(aCoded,alf,palabra);
        
        System.out.println("FINAL RESULTS");
        System.out.println(a);
        System.out.println("Codificación: "+aCoded);
        System.out.println("De-codificación: "+aDeco);
        
        //Para comprobar si los métodos funcionan correctamente, codifico un mensaje y que luego decodifico.
        //Evidentemente el resultante ha de ser el mismo que el inicial.
        
        /// NO SE TIENEN EN CUENTA MAYÚSCULAS ///
        
    }
}
