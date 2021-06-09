package Ficheros;
import java.io.*;


/**
Se pide: implementar un m´etodo est´atico tal que, dado un array de int, copie sus elementos,
uno por l´ınea, en un fichero de texto de nombre "ArrayElements.txt". As´ı, si el array es {5, 2, 8, 4}, en el
fichero se almacenar´an, uno por l´ınea, los valores 5, 2, 8 y 4. El m´etodo debe devolver como resultado el objeto
File creado.
Deber´a tratar la posible excepci´on FileNotFoundException, mostrando un mensaje de error en caso de que
esta se produzca
 */
public class Parcial20178
{

    public static File GuardarArray(int[] a){
        
        File file = new File("ArrayElements.txt");
        PrintWriter p = null;
        try{p = new PrintWriter(file);
            for( int i = 0 ; i < a.length ; i++){p.println(a[i]);}
        } catch(FileNotFoundException e){System.out.println("FILE NOT FOUND");
        }finally{
            if(p instanceof PrintWriter){p.close();} 
            return file;
        }
    }
    
}
