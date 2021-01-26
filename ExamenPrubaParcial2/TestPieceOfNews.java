package ExamenPrubaParcial2;

/** 
 * Clase TestPieceOfNews: clase programa para probar la funcionalidad de 
 * la clase PieceOfNews.
 * 
 * @author IIP
 * @version Curso 2020/21
 */
public class TestPieceOfNews {
            
    /** Devuelve un valor entero aleatorio en [ini, fin], 0 <= ini < fin. */
    private static int random(int ini, int fin) {
        return (int) (Math.random() * (fin - ini + 1) + ini); 
    }
    
    public static void main(String[] args) {
        // a) (0.25 puntos) Crear un TimeInstant ti que represente las 10 horas y 30 minutos.
        /* COMPLETAR */
        
        TimeInstant ti = new TimeInstant(10,30);
        
        
        // b) (0.75 puntos)Crear una PieceOfNews n1 que se ha producido en el instante ti, 
        //    de tipo audio, de la que se han hecho eco 200 medios y cuyo enlace es 
        //    "https://media.com/2019/10/31/climate-change1".
        /* COMPLETAR */
        
        PieceOfNews n1 = new PieceOfNews(ti,"https://media.com/2019/10/31/climate-change1",200,0);

        // c) (0.25 puntos) Asignar a una variable echo2 el resultado de generar aleatoriamente 
        //    un valor en el intervalo [2, 500], haciendo uso del metodo random de esta clase.
        /* COMPLETAR */
        
        int echo2 = TestPieceOfNews.random(2, 500);
        
        // d) (0.75 puntos) Crear una PieceOfNews n2 que se ha producido en el instante ti, 
        //    de tipo texto, de la que se han hecho eco echo2 medios y cuyo enlace es 
        //    "https://media.com/2019/10/31/climate-change2".
        /* COMPLETAR */
        
        PieceOfNews n2 = new PieceOfNews(ti,"https://media.com/2019/10/31/climate-change2",echo2, 2);
        
        // e) (0.5 puntos) Mostrar por pantalla si n2 es o no popular.
        /* COMPLETAR */
        
        System.out.println("n2 es popular? " + n2.isPopular());
        
        // f) (0.5 puntos) Mostrar por pantalla si n1 y n2 son o no iguales.
        /* COMPLETAR */
        
        System.out.println("n1 y n2 son iguales? " + n1.equals(n2));
        
    }
}
