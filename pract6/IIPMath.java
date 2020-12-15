package pract6;


/**
 * Write a description of class IIPMath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IIPMath {
    // instance variables - replace the example below with your own
    private int x;
    public static final double log2 = (0.6931471805599453);
    /**
     * Constructor for objects of class IIPMath
     */
    public IIPMath() {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public static double raizlimite(int x, double epsilon) {
        
        double tnm1 = (1+x) / 2;
        double tn = (tnm1 + x/tnm1)/2;
        int i = 3;
        
        do{
            
            System.out.println("t_"+i+": "+tnm1);
            
            tnm1 = tn;
            tn = ( tnm1 + x/tnm1 )/2;
            i++;
        }while((tnm1 - tn) > epsilon);
        
        return tn;
    }
    
    public static double raizestandar(int x){
        
        return raizlimite(x, Math.pow(10, -15));
    
    }
    
    public static double logBase(double z, double epsilon){
        double y = (1-z)/(1+z);
        double logz = y;
        int k = 1;
        double suma = y;
        while(Math.abs(logz) > epsilon){
            
            double frac = ((double)(2*k-1))/(2*k+1);
            logz = y*y*(frac) * logz;
            
            suma = suma + logz;
            
            k++;
        }
        
        return -2*suma;
    }
    
    public static double log(int x, double epsilon){
        
        while(x < 1){
            
            
        
        }
    
    }
    
    public static void main (String args[]){
        
        int x = 4096;
        double epsilon = 0.01;
        
        System.out.println("La raiz de " + x + " es: " + raizestandar(x));
    
    }
}
