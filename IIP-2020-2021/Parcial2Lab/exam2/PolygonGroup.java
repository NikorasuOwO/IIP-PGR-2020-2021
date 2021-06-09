 

import java.awt.Color;
import others.Point;
import others.Polygon;
/**
 * Clase PolygonGroup. Grupo de poligonos en el plano.
 * Los poligonos estan en orden segun la secuencia en que se añaden
 * al grupo, de manera que se considera que cada poligono esta mas 
 * arriba en el grupo que los poligonos anteriores, o dicho de otro 
 * modo, se superpone a los anteriores. 
 * Se supone que el orden del grupo da la secuencia en que se dibujan
 * los poligonos, de manera que cada uno se dibuja por encima de los
 * anteriores, superponiendose a aquellos con los que solape.
 *
 * @author Parcial 2 - Ejercicio 2 
 * @version IIP - Curso 2020-21
 */
public class PolygonGroup {    
    public static final int MAX = 10;
    private Polygon[] group;
    private int size;
    
    /**
     * Crea un grupo de 0 poligonos.
     */
    public PolygonGroup() {
        group = new Polygon[MAX]; 
        size = 0;
    }
    
    /** Añade al grupo, arriba del todo, un poligono dado. 
     *  Si se excede la capacidad del grupo, el poligono no se añade.
     *  @param pol Polygon, el poligono.
     *  @return boolean, true si se ha añadido o false en caso contrario.
     */
    public boolean add(Polygon pol) {        
        if (size < MAX) {
            group[size] = pol;
            size++;
            return true;
        }
        return false;        
    }
    
    /** Traslada en el plano todos los poligonos cuyo numero de vertices
     *  es igual al numero de vertices de un poligono p dado. 
     *  Las abscisas y las ordenadas de sus vertices se incrementan o 
     *  decrementan en dos valores dados. El metodo no hace nada si no 
     *  hay ningun poligono con numero de vertices igual al de p.
     *  @param p Polygon, el poligono.
     *  @param incX double, el incremento o decremento de las abscisas.
     *  @param incY double, el incremento o decremento de las ordenadas.
     */
    public void translateAll(Polygon p, double incX, double incY) {        
        /* COMPLETAR */
    }
    
    /** Devuelve un array con la secuencia de poligonos del grupo, 
     *  por orden desde el de mas abajo al de mas arriba.
     *  @return Polygon[], el array.
     */
    public Polygon[] toArray() {        
        Polygon[] result = new Polygon[size];        
        for (int i = 0; i < size; i++) {
            result[i] = group[i];
        }        
        return result;
    }
}
