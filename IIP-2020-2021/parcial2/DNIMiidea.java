package parcial2;
import java.util.*; //Hay que importar la clase java.utils para poder usar el scanner!

/**
 * Write a description of class DNI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DNIMiidea {
    // instance variables - replace the example below with your own
    
    public static void main (String[] args){
    
        Scanner DniScanner = new Scanner(System.in);//Creamos el escaner de dnis.
        System.out.println("Dime tu DNI por favor: ");
        String dni = DniScanner.next(); //.next para que el escaner coja un String.
        Boolean validezlongitud = FiltroLongitud(dni);
        //System.out.println(validez);
        //System.out.println(FiltroFormatoCorrecto(dni));
        if (!validezlongitud){ //Si la logitud no es válida
            System.out.println("Longitud incorrecta");
        }else{
            if (FiltroFormatoCorrecto(dni)){ //Siendo la longitud válida, si el dni pasa el filtro de formato:
                System.out.println("Tu DNI es correcto y es: "+dni);
            }else{ //Si no pasa el filtro del formato
                System.out.println("Tu DNI no es correcto");
            }
            
        }
        
    
    }

    /**
     * Constructor for objects of class DNI that im not using
     */
    public DNIMiidea() {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    
    
    public static boolean FiltroLongitud(String dni) {
        boolean nuevedigitos = (dni.length() == 9); //(dni.length() == 9) es una expresión lógica que compara la logitud del dni y el número 9
        return nuevedigitos; //devuelve si el dni tiene 9 dígitos o no
    }
    
   // public
    
    public static boolean FiltroFormatoCorrecto(String dniraw){
        
       // String DNI = dniraw.toUpperCase();
        byte counter = 0;
        boolean ok = false;
        for (int i = 0; i < dniraw.length()-1 ; i++){ //recorremos el dni menos el último elemento, i será el index
            //System.out.println(dniraw.charAt(i));
            if ((int) dniraw.charAt(i) >= 48 && (int) dniraw.charAt(i) <= 58){//compara si el caracter ASCII en el index i es un numero.
                counter++; //Por cada número que encuentra, suma 1.
            } //si el carcter no es un número, no lo cuenta simplemente. e.g: "/", "A", "&"
        if (counter == 8 && (int) dniraw.charAt(dniraw.length()-1) >= 65 && (int) dniraw.charAt(dniraw.length()-1) <= 90){
        //Si se han contado 8 numeros en los 8 primeros caracteres, Y el último caracter es una letra MAYUSCULA, 
        //si su ASCII está entre 65 y 90, entonces el formato es correcto
            ok = true;
        
        }else{
            ok = false;
        }
        
        

    }
    return ok; //devolvemos la evaluación del formato del dni
}

}
