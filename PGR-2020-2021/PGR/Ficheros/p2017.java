package Ficheros;
import java.io.*;
import java.util.*;


/**
 * Write a description of class p2016 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2017
{
public static void fichNue(String ftx) {
File f = new File(ftx);
Scanner s = null; PrintWriter p = null;
try {
s = new Scanner(f).useLocale(Locale.US);
p = new PrintWriter(ftx + "_nuevo.txt");
while (s.hasNextLine()) {
try {
p.println(s.nextDouble());
} catch (InputMismatchException e) { }
finally {if(s.hasNextLine()){s.nextLine();};}
}
} catch (FileNotFoundException e) { }
finally {
if (s != null) { s.close(); }
if (p != null) { p.close(); }
}
}

}
