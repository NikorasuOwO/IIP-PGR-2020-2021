package ExamenPrubaParcial2;

/**
 * Clase TimeInstant. 
 *
 * Esta clase permite representar instantes o marcas de tiempo
 * (Timestamp) con detalle de horas y minutos. Así, la clase 
 * representa un instante de tiempo o momento del día, en este
 * caso, las horas y los minutos de un día cualquiera.
 * 
 * 
 *  @author IIP. Grado en Informatica. ETSINF, UPV 
 *  @version Curso 2020-21
 */
public class TimeInstant {
    
    
    /** 
     *  Variable entera para almacenar las horas. 
     *  Debe pertenecer al rango [0..23].
     */
    private int hours;
    
    /** 
     *  Variable entera para almacenar los minutos. 
     *  Debe pertenecer al rango [0..59]. 
     */
    private int minutes;
    
        /**
     *  Crea un TimeInstant con el valor de las horas y 
     *  los minutos que recibe como argumentos,iniHours
     *  y iniMinutes, respectivamente.
     *  Precondición: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */
    public TimeInstant(int iniHours, int iniMinutes) {
        
        this.hours = iniHours;
        this.minutes = iniMinutes;
    
    }
    
        /**
     * Crea un TimeInstant con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    public TimeInstant() {
        
        //tiempo en minutos desde las 00h del 1 de enero de 1970
        long tMinTotal = System.currentTimeMillis() / (60 * 1000);
        
        //Los minutos transcurridos hoy
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        
        //Las horas enteras transcurridas hoy.
        this.hours = (tMinCurrent / 60);
        
        //Los minutos enteros transcurridos en la hora actual
        this.minutes = tMinCurrent % 60; 
        
    }
    
    /*Getters*/
    /** Devuelve las horas del TimeInstant. */ 
    public int getHours() {
        
        return this.hours;
    
    }
    
    /** Devuelve los minutos del TimeInstant. */ 
    public int getMinutes() {
        
        return this.minutes;
    
    }
    
    /*Setters*/
    /** Actualiza las horas del TimeInstant. */
    public void setHours(int hh) {
        
        this.hours = hh;
    
    }
    /** Actualiza los minutos del TimeInstant. */
    public void setMinutes(int mm) {
        
        this.minutes = mm;
    
    }
    
    
   
    // OTROS MÉTODOS:
    /** Devuelve el TimeInstant en el formato "hh:mm". */
    public String toString() {
    
        String stringH = new String("0" + this.hours);
        stringH = stringH.substring(stringH.length() - 2, stringH.length());
        
        String stringM = new String("0" + this.minutes);
        stringM = stringM.substring(stringM.length() - 2 , stringM.length());
        
        return stringH + ":" + stringM;
        
    }
    
   
    /** Devuelve true sii o es un objeto de la clase
     *  TimeInstant y sus horas y minutos coinciden con
     *  los del objeto en curso this. 
     */
    
    public boolean equals(Object o) {
        
        boolean value = o instanceof TimeInstant 
        && this.hours == ((TimeInstant) o).hours 
        && this.minutes == ((TimeInstant) o).minutes;
        //value será verdad si o es un objeto TimeInstant 
        //y si las horas y minutos coinciden.
        
        return value;
    
    }
    /**Devuelve en minutos el tiempo almacenado en el objeto*/
    public int toMinutes() {
    
        return this.hours * 60 + this.minutes;
    }
    /**Compara y devuelve el tiempo referente al propio objeto desde el cual se ha llamado al método, con el referente al objeto pasado por parámetro:
     
     * Si resutado > 0: el objeto desde el cual se ha llamado al método representa un tiempo más grande. 
     * 
     * Si resutado < 0: el objeto pasado por parámetro almacena un tiempo más grande. 
     * 
     * Si resutado = 0: los dos objetos almacenan un tiempo exactamente igual*/
       
    public int compareTo(TimeInstant tInstant) {
    
        return this.toMinutes() - tInstant.toMinutes();
        
    }
    
    
    
    
    /** Devuelve el número de minutos transcurridos desde las 00:00 
     *  hasta el instante representado por this.
     */
    /* COMPLETAR */
    
    /** Compara cronológicamente el instante del objeto en curso con 
     *  el del objeto de la clase TimeInstant referenciado por tInstant.
     *  El resultado es negativo si this es anterior a tInstant,
     *  cero si son iguales, y positivo si this es posterior a tInstant. 
     *  Se calcula como la resta entre la conversión a minutos
     *  de ambos objetos.
     */
    /* COMPLETAR */

    // ACTIVIDAD EXTRA:
    /** Devuelve un TimeInstant a partir de la descripción 
     *  textual (String) en formato "hh:mm".
     */
    public static TimeInstant ValueOf(String textInstant) {
    
        int hh0 = (int)textInstant.charAt(0)-48;
        int hh1 = (int)textInstant.charAt(1)-48;
        int hh = 10*hh0 + hh1;
        
        int mm0 = (int)textInstant.charAt(3)-48;
        int mm1 = (int)textInstant.charAt(4)-48;
        int mm = 10*mm0 + mm1;
        
        TimeInstant TiempoObj = new TimeInstant(hh,mm);
        
        return TiempoObj;
    }
    
    /* COMPLETAR */
  
}
