
package parcial1;

public class RealPoint{

    //Atributos
    private double x;
    private double y;
    private char shape;
    
    //Constructor por defecto de la Clase
    public RealPoint(){
    
        this.x = 0.0;
        this.y = 0.0;
        this.shape ='O';
    
    }
    //Constructor de la clase
    public RealPoint(double nx, double ny){
    
        this.x = nx;
        this.y = ny;
        
        this.shape = 'O';
        
    }
    
    public double dist(RealPoint punto){
    
        //distancia = raiz de (xp-xq)^2 + (yp-yq)^2
        
       
        double dx = this.x - punto.x; //podemos acceder a punto.x porque estamos dentro de la misma clase. !!!!
        double dy = this.y - punto.y;
        double distancia = Math.sqrt(dx*dx + dy*dy);
        
    return distancia;
    }
    
    public boolean equals(Object o){
    
        boolean validez = false;
        
        validez = o instanceof RealPoint 
        && this.x == (((RealPoint)o).x) && this.y == (((RealPoint)o).y);
        
        
        return validez;
    }
    
}