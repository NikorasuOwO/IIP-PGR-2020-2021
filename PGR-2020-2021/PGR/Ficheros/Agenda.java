package Ficheros;

import java.io.*;
public class Agenda implements Serializable {

    public static final int MAX = 8;
    private ItemAgenda[] elArray;
    private int num;
    
    public Agenda() {
    
        elArray = new ItemAgenda[MAX]; num = 0;
    }
    public void insertar(ItemAgenda b) {
        if (num < elArray.length) elArray[num]=b; num++; 
    }
    public String toString() {
        String res=""; for (int i=0;i<num;i++) res += elArray[i]+"\n";
        res += "=================================";
        return res; 
    }

// Otros métodos de la clase ... como eliminar, recuperarPorNombre, …, etc.

// en la clase Agenda …
    public void guardarAgenda(String fichero) { //WRITE
        try {
            FileOutputStream fos = new FileOutputStream(fichero);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this); 
            
            oos.close();
        } catch (IOException ex) { System.err.println("Error al guardar: " + ex.getMessage()); } 
    }
    
    public static Agenda leerAgenda(String fichero) { //READ
        Agenda aux = null;
        try {
            FileInputStream fis = new FileInputStream(fichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
            aux = (Agenda) ois.readObject();
            
            ois.close();
            
        } catch (IOException ex) { System.err.println("Error al recuperar: " + ex.getMessage()); }
        catch (ClassNotFoundException ex) {
            System.err.println("Error de tipo: " + ex.getMessage()); }
    return aux;
    }
} // fin de la clase Agenda

