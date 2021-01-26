package ExamenPrubaParcial2;


/**
 * Write a description of class BulletinBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletinBoard
{
    // instance variables - replace the example below with your own
    public static final int MINUTES = 1440; //Número de minutos en un día
    PieceOfNews[] bBoard = new PieceOfNews[MINUTES]; //Array de Noticias del día
    private int[] numPerType = new int[3]; //Número de noticias de cada tipo, indice = 0: AUDIO, 1: VIDEO, 2: TEXT

    /**
     * Constructor for objects of class BulletinBoard
     */
    public BulletinBoard(){
        ; //(do nothing)
    }
    
    public boolean add(PieceOfNews p){
        
        int minutosP = p.getInstant().toMinutes(); //Recogemos en minutosP el tiempo en minutos de la publicación
        
        if(this.bBoard[minutosP] == null){ //Si no hay noticia en ese minuto de publicación
            this.bBoard[minutosP] = p; // Añadimos p
            numPerType[p.getType()]++; //Añadimos uno al número de noticias del tipo de p;
            return true; //Devolvemos true porque ha cambiado el Board.
        }
        
        boolean cambio = (this.bBoard[minutosP].compareTo(p) < 0)?true:false; //Si la noticia a añadir es más popilar, habrá cambio.
        
        if(cambio){ //Si hemos decidido que hay cambio...
            numPerType[this.bBoard[minutosP].getType()]--; //Restamos uno al número de noticias del tipo de la noticia que vamos a eliminar
            numPerType[p.getType()]++; //Añadimos uno al número de noticias del tipo de p;
            this.bBoard[minutosP] = p; // Añadimos p
        }
        
        return cambio;
    }
    
    public PieceOfNews isPosted(String link){
        
        int i = 0;
        //Buscamos en todas las noticias del día.
        while(i<MINUTES && !(bBoard[i].getLink().equals(link))){
            i++;
        }
        
        if(i<MINUTES){return bBoard[i]; //Si el índice es menor que la longitud del array, es que se ha encontrado.
        
        }else{
            return null; //Si el índice no es menor al máximo, es que se ha recorrido todo el array, sin éxito.
        }
        
    }
    
    public PieceOfNews[] filterByType(int type){
        
        PieceOfNews[] array = new PieceOfNews[this.numPerType[type]]; //Creamos un array con un tamaño igual al número de noticias de tipo type
                                                                                      
        for(int i = 0 ; i < MINUTES ; i++){ //Recorremos el array con todas las noticias
            
            if(this.bBoard[i].getType() == type){ //Si la noticia es de tipo "type" añadimos la noticia al array creado en este método.
                
                array[i] = bBoard[i];
                
            }
        
        }
        return array;
    }
    
}
