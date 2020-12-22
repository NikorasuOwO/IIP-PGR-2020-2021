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
    private int nota;
    private int asistencia;
    private int Id;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, String apellido, int nota, int asistencia, int Id) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.asistencia = asistencia;
        this.Id = Id;
    }

}
