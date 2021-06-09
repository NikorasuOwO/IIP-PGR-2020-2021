package Ficheros;

import java.io.*;
public class TestPrintWriter {
 public static void main(String[] args){
  String fichero = "file2.txt";
  try {
   PrintWriter pw = new PrintWriter(new FileOutputStream("file2.txt", true));
   pw.print("El veloz murciélago hindú");
   pw.println(" comía feliz cardillo y kiwi");
   pw.println(4.815162342);
   pw.close();
  } catch (FileNotFoundException e) { System.err.println("Problemas al abrir el fichero " + fichero); }
 }
}