package Nodos;
import java.io.*;
import java.util.*;

public class NASPRG{

    NodeStudent seq;
    
    public NASPRG(){
        this.seq = null;
    }

    public NASPRG(String path){
        
        Scanner s = new Scanner(new File(path)).useLocale(Locale.US);
        NodeStudent last = null;
        NodeStudent first = null;
        
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            int first_space = line.indexOf(" ");
            double grade = Double.parseDouble(line.substring(0, first_space)); //from begining to first space
            String name = line.substring(first_space); //First space to the end
            if(first == null){
                last = new NodeStudent(name, grade);
                first = last;
            }else{
                last.next = new NodeStudent(name, grade);
                last.next = last;
            }
        }
        
    }
    
    
    public void add(String n, double g){ //Ordered insertion by name
    
    }
    
    public double searchByName(String n){
    return 0;
    }
    
    public void reviewGrade(String n, double newGrade){
    
    
    }
    
    public void sortByGrade(){
    
    }
    
    public String toString(){return "";}
    
    public boolean compareTo(){return true;}
}
