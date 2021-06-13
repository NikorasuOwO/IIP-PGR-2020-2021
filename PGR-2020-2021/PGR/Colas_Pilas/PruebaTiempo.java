package Colas_Pilas;


/**
 * Write a description of class PruebaTiempo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaTiempo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PruebaTiempo
     */
    public PruebaTiempo()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void sampleMethod()
    {
        int n = (int) Math.pow(10,7.5);
        StackInt pila = new StackInt();
        
        //int[] array = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            //array[i] = i;
            pila.push(i);
            
        }
        
        
        
        System.out.println("SIZE: " + pila.getSize() + " PILA 1 peek:" + pila.peek());
        //PilasEj.showStack(pila);
        
        StackInt pila2 = PilasEj.inverted(pila);
        System.out.println("SIZE: " + pila2.getSize() + " PILA 2 peek:" + pila2.peek());
        //PilasEj.showStack(pila2);
    }
}
