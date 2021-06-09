package Ficheros;

import java.io.*;
import java.util.Scanner;
class TestPrintWriter1{
 public static void main(String[] args){
 String fichero = "file4.txt";
 try {
 //PrintWriter pw = new PrintWriter(new File(fichero));
 PrintWriter pw = new PrintWriter(new FileOutputStream(fichero, true));
 for (int i = 0; i < 10 ; i++) pw.println(i);
 pw.close();
 Scanner scanner = new Scanner(new File(fichero));
 while (scanner.hasNext()) { System.out.println("Valor leido: "+scanner.nextDouble()); }
 scanner.close();
 } catch (FileNotFoundException e) {
 System.err.println("Problemas al abrir el fichero " + fichero);
 }
} }