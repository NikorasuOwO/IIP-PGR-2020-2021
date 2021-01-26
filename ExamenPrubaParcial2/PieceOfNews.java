package ExamenPrubaParcial2;

/** 
 * Clase PieceOfNews: clase tipo de datos para representar una noticia que 
 * sera publicada en un medio digital el mismo dia en el que se produce. 
 * 
 * @author IIP
 * @version Curso 2020/21
 */
public class PieceOfNews { 
    // a) (0.5 puntos) Tres atributos estaticos, publicos y constantes de tipo int,
    //    para representar mediante un codigo numerico los tres tipos de formatos que puede 
    //    tener el fichero que contiene una noticia: audio, video o texto. Sus identificadores
    //    y valores son, respectivamente: 
    //    AUDIO, con valor 0; VIDEO, con valor 1; TEXT, con valor 2.
    
    static public final int AUDIO = 0;
    static public final int VIDEO = 1;
    static public final int TEXT = 2;
    
    
    // b) (0.5 puntos) Tres atributos estaticos, publicos y constantes de tipo int, 
    //    para representar el numero minimo de medios que se tienen que hacer eco de una noticia 
    //    para considerarla popular segun el tipo de formato. Sus identificadores y valores son, 
    //    respectivamente: 
    //    POPULAR_A, con valor 150; POPULAR_V, con valor 200; POPULAR_T, con valor 250.
    
    static public final int POPULAR_A = 150;
    static public final int POPULAR_V = 200;
    static public final int POPULAR_T = 250;
    

    // c) (0.5 puntos) Cuatro atributos de instancia y privados, para representar los elementos 
    //    asociados a una PieceOfNews. Siguiendo el orden en el que se han descrito previamente,  
    //    sus identificadores (y tipos Java) son: instant (TimeInstant); link (String); 
    //    echoedBy (int); type (int).
    
    private TimeInstant instant;
    private String link;
    private int echoedBy;
    private int type;
    

    // d) (0.75 puntos) Metodo constructor, que crea una PieceOfNews que se ha producido en el 
    //    instante i, publicada con enlace l, eco en n medios y de tipo t. Se supone como 
    //    Precondicion que los valores de estos parametros son correctos.
    
    public PieceOfNews(TimeInstant i, String l, int n, int t){
        
        this.instant = i;
        this.link = l;
        this.echoedBy = n;
        this.type = t;
        
    
    }
    
     
    // e) (1.25 puntos) Metodo equals, que sobrescribe el de Object y comprueba si una PieceOfNews 
    //    (this) es igual a otra, en concreto, si ambas se han producido en el mismo instante, han 
    //    tenido el mismo eco y son del mismo tipo; los enlaces no se tienen en cuenta. 
    /* COMPLETAR */
    
    public boolean equals(Object o){ //Por si acaso, asumo que el objeto pasado por parametro NO es un objeto de tipo PieceOfNews
    
        boolean isequal = false;
        
        isequal = o instanceof PieceOfNews && this.instant.equals( ((PieceOfNews) o).instant) 
        && this.echoedBy == ((PieceOfNews) o).echoedBy && this.type == ((PieceOfNews) o).type;
        
    
    
        return isequal;
    }
    
     
    // f) (1.25 puntos) Metodo isPopular, que que devuelve true si la noticia es popular y, en caso 
    //    contrario, devuelve false. Una noticia se considera popular si el numero de medios que se 
    //    han hecho eco de la misma es mayor o igual que el valor de la constante correspondiente 
    //   (POPULAR_A, POPULAR_V, POPULAR_T) segun su tipo.
    /* COMPLETAR */
    
    public int compareTo(PieceOfNews other){
        
        int popthis = 150 + this.type*50; //Computamos la popularidad de la noticia this
        int popother = 150 + other.type*50; //Idem con other
        
        
        return popthis - popother; // Return de la diferencia tal que es negativa si popother > popthis
    
    }
    
    public boolean isPopular(){
        
        boolean popular;
        
        popular = (this.type == AUDIO && this.echoedBy >= POPULAR_A) 
        || (this.type == VIDEO && this.echoedBy >= POPULAR_V) 
        || (this.type == TEXT && this.echoedBy >= POPULAR_T);
        
        return popular;
    }
    
    
    // g) (1.25 puntos) Metodo toString, que sobrescribe el de Object y que devuelve la descripcion 
    //    de la noticia, es decir, el instante, el enlace, su eco y, entre parentesis, su tipo, 
    //    como en el siguiente ejemplo: 10:30 https://media.com/2019/10/31/climate-change2 150 (2)
    /* COMPLETAR */   
    
    public String toString(){
        
        String descripcion = new String(this.instant.toString() + " " + this.link + " " + this.echoedBy + " (" + this.type +  ")");
        
        return descripcion;
}

    public TimeInstant getInstant(){
        
        return this.instant;
    
    }
    
    public String getLink(){
        return this.link;
    }


    public int getType(){
        return this.type;
    }
    
    public static void main (String args[]){
    
        int a = AUDIO;
        
        System.out.println(a);
    
    }
}