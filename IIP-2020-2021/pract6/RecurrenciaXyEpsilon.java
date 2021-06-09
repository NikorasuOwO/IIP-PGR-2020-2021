package pract6;

/**
 * Write a description of class RecurrenciaXyEpsilon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecurrenciaXyEpsilon {

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public static int Rex(double x, double epsilon) {
        
        double Cn = x;
        double Cnm1 = x;
        int i;
        
        for(i = 3; epsilon < 1.0/(Cnm1 - Cn) ; i++){
            Cnm1 = Cn;
            Cn = Cnm1 * i;
    }
    return i-2;
}
    public static void main (String[] args){
    
        double x = 3.7;
        double epsilon = 0.1;
        
        System.out.println(Rex(x,epsilon));
        
    }
    
}
