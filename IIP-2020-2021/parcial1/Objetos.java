package parcial1;
import java.awt.Point;

public class Objetos{
    public static double distanciaOrigen(Point p){
        
        return Math.sqrt(p.x*p.x + p.y*p.y);
    }
    public static void main(String[] args){
        
        Point p = new Point();
        p.move(3,4);
        System.out.println(distanciaOrigen(p));
        
    
    }

}