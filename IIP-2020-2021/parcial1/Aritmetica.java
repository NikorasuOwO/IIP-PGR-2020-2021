package parcial1;

public class Aritmetica{
    
    public static double redondear1(double valor){
    
    return Math.round(valor*10)/10.0;
    }
    
    public static int redondear0(double valor){ //Atención! El resultado ha de ser un int así que hay que hacer un casting al hacer el return!!
        return (int) Math.round(valor);
    }
    
    public static double p01(int a, int b, int c){
    
        double delta = b*b - 4*a*c; 
        double res1 = ( -b + Math.sqrt(delta) ) /((double) 2*a);
        
        return res1;
    }
    public static double p02(int a, int b, int c){
    
        double delta = b*b - 4*a*c;
        double res1 = ( -b - Math.sqrt(delta) ) /((double) 2*a);
        
        return res1;
    }
    
    public static double area(double R){
    
        double pi = Math.PI;
        
        //return 4*pi*R*R;
        return 4*pi*Math.pow(R,2);
    }
    
    public static double volumenRadio(double R){
    
        double pi = Math.PI;
        
        return (4.0/3.0)*pi*Math.pow(R,3.0);
    }
    
    public static double volumenArea(double A){
    
        double R = Math.sqrt(A/(4*Math.PI));
        double V = A*R*(1.0/3.0);
        
        return V;
    }
    
    public static double c2f(double C){
    
        double F = C * (9.0/5.0)+32;
        
        return F;
    }
    
    public static double f2c(double F){
    
        double C = (F-32)*(5.0/9.0);
        
        return C;
    }
    
    public static double masIVA(double precio, int IVA){
        //double IVA = 0.21;
        double masIVA = precio + (IVA/100.0)*precio;
        double masIVAredondeado = Math.round(masIVA*100.0)/100.0;
        return masIVAredondeado;
    }
    
    public static int duracion(int hs,int ms, int hll,int mll){
        
        int t0_min = 60*hs + ms;
        int tf_min = 60*hll + mll;
        
        return ((tf_min-t0_min));
    }
    
    public static double Caminante(double alt){
    
    return (2*alt*Math.PI)/100;
    }
}
