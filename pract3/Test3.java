package pract3;

import java.util.Scanner;

/**
 *  Clase Test3.
 *  Una primera clase con lectura de datos desde teclado, 
 *  y uso de operaciones con int, long, Math y String.
 *  Contiene tres errores de compilacion.
 *  @author IIP 
 *  @version Curso 2020-21
 */
 
public class Test3 {

    public static void main(String[] args) {
        
     
    }
    
    public static String FormatoHora(int hh, int mm){
    
        //Scanner kbd = new Scanner(System.in);
        //System.out.println("Lectura de teclado de una hora.");
        //System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        //int h = kbd.nextInt();
        //String hh = "0" + kbd.nextInt();
        //System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        //String mm = "0" + kbd.nextInt();
        
        String shh = "0" + hh;
        String smm = "0" + mm;
        System.out.println("Hora introducida: " + shh.substring(shh.length()-2) +":"+smm.substring(smm.length()-2));
        //Queremos que se muestren los 2 últimos elemenos de la cadena.
        // Para hh=09; queremos los dos últimos, i.e. 0 y 9
        // Para hh=013; queremos los dos últimos, i.e. 1 y 3
        
        //mi idea//
        
        //int m = kbd.nextInt();
        
        /*
        if (hh.length() == 1) {
            hh = 0 + hh;
        
        }
        if (mm.length() == 1) {
            mm = 0 + mm;
        
        }
        
        
        System.out.println("Hora introducida: " + hh + ":" + mm);    */
        
         

        return shh.substring(shh.length()-2) +":"+smm.substring(smm.length()-2);
    }
    
    public static void HoraActual() {
        
        long ttms = System.currentTimeMillis(); //devuelve long!!
        long ttm = (ttms/1000)/60;
        //long tth = (ttm/60);
        
        System.out.println("Tiempo total en ms: " + ttms);
        //System.out.println("Tiempo total en h: " + tth);
        System.out.println("Tiempo total m:" + ttm);
        
        int tm = (int) (ttm % ( 24 * 60 ));
        int th = tm/60 + 1 ;
        int restomin = tm%60;
        int restoseg = (int) (ttms/1000)%(60);
        
        //System.out.println("Tiempo de hoy en minutos: "+tm);
        System.out.println("Tiempo de hoy en horas: "+th);
        System.out.println("Tiempo en minutos: "+restomin);
        System.out.println("Tiempo en segundos: "+restoseg);
        
        System.out.println(Test3.FormatoHora(th, restomin));
    }
 
}
