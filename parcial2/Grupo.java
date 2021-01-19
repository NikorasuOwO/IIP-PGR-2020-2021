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
        this.numAlumnos = 0;
        this.arrayGrupo = alumnos;
    }
    
    public Grupo(int num){
        
        this.numAlumnos = 0;
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
}
