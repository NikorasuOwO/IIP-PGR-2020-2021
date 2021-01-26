package ExamenPrubaParcial2;

public class Dos_y_Tres{
    public Dos_y_Tres(){;}
    
    public static double round2(double x){return Math.round(x*100)/100.0;}
    
    public static int firstRepeatedElement(int[] array){
        
        int first = -1;
        //Recorremos el array
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i] == array[j]){first = array[i]; return first;}
            }
        }
        return first;
    }
    
    public static int numTerms(double x, double epsilon){
        if(x <= 0){return -1;}
        
        int n = 1;
        
        double C1 = x; //El primer valor es x
        double C_var = C1; //Este será el valor Cn
        double C_ant = 0; //Este será el valor de Cn-1
        
        if(1.0/(C_var - C_ant) <= epsilon){return n;}
        
        while(1.0/(C_var - C_ant) > epsilon){
            C_ant = C_var;
            C_var = C_var * n;
            //System.out.println(" n:" + n + " | C_var: " + round2(C_var) +  " | C_ant" + round2(C_ant) +
            //" | mu: " + round2(1.0/(C_var - C_ant)) +" | epsilon: " + epsilon);
            n++;
        }
        //System.out.println("END: "  + 1.0/(C_var - C_ant));
        return n-1;
    }
    
    
}
