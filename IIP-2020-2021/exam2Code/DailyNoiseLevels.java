package exam2Code;

/**
 * Clase DailyNoiseLevels: representa un registro de las medidas de ruido 
 * realizadas  a lo largo de las 24h de un dia en una estacion de medicion 
 * dada situada en via publica.
 * 
 * @Nicolás Antonio Bermell Ferrer IIP - Parcial 2
 * @version Curso 2020/21 
 */
public class DailyNoiseLevels {   
    // a) (0.5 puntos) Atributos:
    // - HOURS: atributo estatico, publico, constante y de tipo int, que indica 
    //   el numero de horas que tiene un dia (24), o numero maximo de medidas que 
    //   se pueden registrar en la estacion en 24h.
    public static final int HOURS = 24;
    // - measures: atributo de instancia y privado, un array de Measure y tamanyo HOURS 
    //   que almacena cada una de las medidas de ruido que se tomen en una estacion a lo 
    //   largo de las 24h de un dia. 
    //   Asi, cada uno de sus elementos, measures[i] (0 <= i < HOURS), almacena la medida 
    //   de ruido realizada a las i horas de un dia, null si a dicha hora no se ha tomado 
    //   ninguna medida.
    Measure[] measures;
    // - exceedsMaxDCount y exceedsMaxNCount: dos contadores, atributos de instancia y 
    //   privados de tipo int, cada uno de los cuales indica cuantas de las medidas tomadas 
    //   en los horarios Diurno y Nocturno, respectivamente, exceden los valores maximos 
    //   permitidos en dichos horarios.
    int exceedsMaxDCount;
    int exceedsMaxNCount;
    /* COMPLETAR */
    
    // (0.5 puntos) Metodo constructor, que crea un DailyNoiseLevels vacio, 
    // sin medidas de ruido.
    public DailyNoiseLevels() {
        this.measures = new Measure[HOURS];
        this.exceedsMaxDCount = 0;
        this.exceedsMaxNCount = 0;
    } 
    
    // (0.75 puntos) Metodo add, que registra una medida m en un DailyNoiseLevels. 
    // Como precondicion, supongase que m es correcta y que en la hora en la que 
    // se ha tomado NO figura registrada ninguna medida.    
    public void add(Measure m) {
        int hora = m.getInstantHours(); //Ponemos en hora la hora asociada a la medida de ruido m
        measures[hora] = m; //Añadimos al array la medida en su lugar corrspondiente a la hora en la que se efectuó la medida.
        
        //Hemos de actualizar los contadores de valores superiores al máximo permitido, para el día y la noche.
        
        if(m.exceedsMax()){
            if(hora >= 7 && hora <= 21){
                exceedsMaxDCount++; //actualizamos contador diuno
            }else{
                exceedsMaxNCount++; //actualizamos contador nocturno
            }
        }
        
    }
    
    // (1 punto) Metodo firstOccupied, que devuelve la posicion de la primera medida 
    // de un DailyNoiseLevels, -1 si esta vacio.
    public int firstOccupied() {          
        int i = 0;
        while(i < HOURS && (measures[i] == null)){
            
            i++;
        
        }
        
        if(i < HOURS){ //Si hemos salido del bucle antes de llegar a HOURS, devolvemos el índice
            return i;
        
        }else{ //Si no, si hemos recorrido todo el array sin éxito, devolvemos -1.
            
            return -1;
        }
        
    }
    
    // (1.25 puntos) Metodo getMaxIndex, que devuelve la posicion de la medida con el 
    // maximo nivel de ruido de un DailyNoiseLevels, -1 si esta vacio. 
    // Para ello, este metodo DEBE invocar en su cuerpo al metodo firstOccupied.
    public int getMaxIndex() {
        
        if(this.firstOccupied() == -1){return -1;} //El array está vacío
        
        int max = 0;
        int maxindex = 0;
        
        for(int i = 0 ; i < HOURS ; i++){ //Buscamos la medida con el ruido máximo.
            
            if((measures[i] != null) && max < measures[i].getInstantHours()){
                max = measures[i].getInstantHours();
                maxindex = i;
            }
        
        }
        return maxindex;
    }
    
    // (1.5 puntos) Metodo filterByMaxExceeded, que devuelve un array con aquellas medidas 
    // de un DailyNoiseLevels que hayan superado el maximo permitido, tanto en horario diurno 
    // como en nocturno.
    // NOTA: el tamanyo del array resultado debe ser igual al numero de medidas que han 
    // superado el maximo permitido, siendo cero si ninguna medida lo ha superado.
    public Measure[] filterByMaxExceeded() {
        // Creamos un array que tendrá como número de elementos la suma entre el número de elementos que superan 
        // el máximo de día y el número de elementos que superan el máximo de noche.
        Measure[] array = new Measure[this.exceedsMaxDCount + this.exceedsMaxNCount];
        
        int i = 0; //Índice para recorrer measures
        int j = 0; //Índice para recorrer "array" (array de medidas que exceden el máximo)
        
        while(i < HOURS){ //Recorremos todo measures buscando si las medidas que hay superan el máximo permitido (usando exceedsMax)
            
            if(measures[i] != null && measures[i].exceedsMax()){ //Si en la posición i de measures hay una medida y esa medida excede el máximo
                
                array[j] = measures[i]; //Añadimos la medida al array
                j++; //actualizamos el índice de array
            }
        
        }
        
        return array; //Devolvemos el array
    }    
}