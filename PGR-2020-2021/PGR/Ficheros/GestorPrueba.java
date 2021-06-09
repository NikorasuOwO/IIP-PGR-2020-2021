package Ficheros;

import java.io.*;
public class GestorPrueba {
    public static void main(String[] args) {
        /*ItemAgenda i1 = new ItemAgenda("Enrique Perez","622115611",46022);
        ItemAgenda i2 = new ItemAgenda("Rosalía","963221153",46010);
        ItemAgenda i3 = new ItemAgenda("Juan Duato","913651228",18011);
        Agenda a1 = new Agenda();
        a1.insertar(i1); a1.insertar(i2); a1.insertar(i3);
        // Guardar y mostrar la Agenda a1:
        a1.guardarAgenda("agenda1.dat");
        System.out.println("AGENDA ALMACENADA:"); System.out.println(a1);*/
        // Leer del fichero y mostrar la Agenda leída:
        Agenda rec = Agenda.leerAgenda("agenda1.dat");
        System.out.println("AGENDA RECUPERADA:"); System.out.println(rec);
    }
} // fin de la clase GestorPrueba