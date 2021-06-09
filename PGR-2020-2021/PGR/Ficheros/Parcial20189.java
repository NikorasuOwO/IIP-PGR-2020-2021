package Ficheros;
import java.io.*;
import java.util.Scanner;
import java.util.*;


/**
 * Write a description of class Parcial20189 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parcial20189
{
public static void sumInt() throws FileNotFoundException{
    File fI = new File("fi.txt");
    File fO = new File("fo.txt");
    Scanner in = new Scanner(fI);
    PrintWriter out = new PrintWriter(fO);
    int sum = 0;
    
    while(in.hasNext()){
        
        try{
            int a = in.nextInt();
            sum = a + sum;
            out.println(a);
        }catch(InputMismatchException e){out.println("(ERROR: "+in.next() + ")");}
    
    }
    out.println("suma: " + sum);
    in.close();
    out.close();
}
    
}
