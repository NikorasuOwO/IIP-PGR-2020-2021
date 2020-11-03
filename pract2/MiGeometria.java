package pract2;


/**
 * Write a description of class MiGeometria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiGeometria {
    // instance variables - replace the example below with your own
    private int x;
    
  
    public static void main(String[] args){
        
        Blackboard pizarra = new Blackboard("UwU Pizarra",600,600);
        
        Circle c1 = new Circle(40,"red",300,300);
        
        
        pizarra.add(c1);
        
    }

    /**
     * Constructor for objects of class MiGeometria
     */
    public MiGeometria() {
      
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int sampleMethod(int y) {
        // put your code here
        return x + y;
    }
}
