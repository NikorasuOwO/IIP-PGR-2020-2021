package pract4;
import java.util.Scanner;
/**
 *  Clase Test4.
 *  Clase de prueba de TimeInstat.
 *  @author IIP 
 *  @version Curso 2020-21
 */
public class Test4 {
    
    /** No hay objetos de esta clase */
    private Test4() { }
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = kbd.nextInt();
        
       TimeInstant tiempo = new TimeInstant(h,m);
       TimeInstant tiempoActual = new TimeInstant();
     
       System.out.println("Hora introducida: " + tiempo.toString());
       
       System.out.println("Hora actual: " + tiempoActual.toString());
       
       System.out.println("Diferencia en minutos entre ambas horas: "
       + tiempo.compareTo(tiempoActual)  );
       
       System.out.println("Es anterior la hora introducida a la hora actual? " +
                       (tiempo.compareTo(tiempoActual) < 0)  );
    }    
 
}   
