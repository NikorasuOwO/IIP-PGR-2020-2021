package Ficheros;

import java.io.*;
public class ItemAgenda implements Serializable {
    private String nom; 
    private String tel;
    private int postal;
    
    public ItemAgenda(String n, String t, int p) {
        nom = n; tel = t; postal = p;
    }
    public String toString() {
        return nom +": "+tel+" ("+postal+")"; 
    }
    // otros métodos ...
} // fin de la clase ItemAgenda