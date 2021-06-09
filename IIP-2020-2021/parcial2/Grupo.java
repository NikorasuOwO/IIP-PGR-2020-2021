package parcial2;


/**
 * Write a description of class ArrayAlumnos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grupo {
    // instance variables - replace the example below with your own
    public static final int MAX = 100;
    private int numAlumnos = 0;
    private Alumno[] arrayGrupo;
    /**
     * Constructor for objects of class ArrayAlumnos
     */
    public Grupo(Alumno[] alumnos) {
        // initialise instance variables
        this.numAlumnos = alumnos.length;
        this.arrayGrupo = alumnos;
    }
    
    public Grupo(int num){
        
        this.numAlumnos = num;
        this.arrayGrupo = new Alumno[num];
    
    }
    
    public boolean Buscar(Alumno a1){
        
        //Buscamos al alumno
        int i = 0;
        /*
        while(i < this.numAlumnos && a1.getApellido().charAt(0) >= this.arrayGrupo[i].getApellido().charAt(0) 
             && !a1.equals(this.arrayGrupo[i])){
            i++;
        }*/
        
        while(i < numAlumnos && arrayGrupo[i].compareTo(a1) < 0){ //Para si >= 0, si nos hemos pasado la letra o si el apellido es le mismo. 
        
        i++;
        }
        
        if(arrayGrupo[i].compareTo(a1) == 0){return true;} // <=> return i < numAlumnos
        return false;
    }
    
    public boolean Insertar(Alumno a1){
        
        if(this.Buscar(a1)){System.out.println("El alumno ya está dentro del grupo."); return false;}
        
        //Miramos si hay sitio para el alumno.
        if(this.numAlumnos >= MAX){System.out.println("Ya se ha alcanzado el máximo de alumnos."); return false;}
        
        //Añadimos la alumno
        
        this.numAlumnos++;
        return true;
        
    }
    
    public int[] numAptos(){
    
        int[] res = new int[3];
        
        for(int i = 0 ; i < numAlumnos ; i++){
            double nota = this.arrayGrupo[i].getNota();
            if(5 >= nota && nota < 7){
                res[0]++;
            }else{
                if(7 >= nota && nota < 9){
                    res[1]++;
                }else{
                    if(nota >= 9){res[2]++;}
                }
            
            }
        
        }
    
        return res;
    }
    
    public boolean estanTodosAprobados(){
    
        int i = 0;
        while(i< numAlumnos && !(arrayGrupo[i].getNota() < 5)){
            
            i++;
            
        }
        if(i < numAlumnos){ return false; }
        return true;
    }
    
}
