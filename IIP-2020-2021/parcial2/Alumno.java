package parcial2;


/**
 * Write a description of class Alumno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alumno {
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private double nota;
    private int asistencia;
    private int Id;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, String apellido, double nota, int asistencia, int Id) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.asistencia = asistencia;
        this.Id = Id;
    }
    public double getNota(){return this.nota;}
    
    public int getAsistencia(){return this.asistencia;}

    public int getId(){return this.Id;}
    
    public String getNombre(){return this.nombre;}

    public String getApellido(){return this.apellido;}
    
    public String sumary(){return nombre+ " "+apellido+ " " +Double.toString(nota) +"/10 " 
                                + Integer.toString(asistencia) + "% " + Integer.toString(Id);}
    public boolean repite(){if(this.nota < 5){return true;}return false;}
    
    public boolean equals(Object Otro){    
        // Dos estudiantes son iguales si comparten el apellido y el nombre.
        return Otro instanceof Alumno && (( (Alumno) Otro).apellido.equals(this.apellido)) && (((Alumno) Otro).nombre.equals(this.nombre));
    }
    public int compareTo(Alumno Otro){ return this.apellido.compareTo(Otro.getApellido());}

}
