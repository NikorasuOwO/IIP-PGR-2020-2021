package Nodos;
import java.io.*;
import java.util.*;

public class NASPRG{

    NodeStudent seq;
    
    public NASPRG(){
        
        String path = "NASPRG.txt";
        
        try{
            Scanner s = new Scanner(new File(path)).useLocale(Locale.US);
            NodeStudent last = null;
            NodeStudent first = null;
            
            while(s.hasNextLine()){
                String line = s.nextLine().trim();
                int first_space = line.indexOf(" ");
                double grade = Double.parseDouble(line.substring(0, first_space)); //from begining to first space
                String name = line.substring(first_space+1); //First space (not included) to the end
                if(first == null){
                    last = new NodeStudent(name, grade);
                    first = last;
                }else{
                    last.next = new NodeStudent(name, grade);
                    last = last.next;
                }
            }
            s.close();
            this.seq = first;
            
        }catch(FileNotFoundException e){return;}
        
    
        //this.seq = null;
    }

    public NASPRG(String path){
        try{
            Scanner s = new Scanner(new File(path)).useLocale(Locale.US);
            NodeStudent last = null;
            NodeStudent first = null;
            
            while(s.hasNextLine()){
                String line = s.nextLine().trim();
                int first_space = line.indexOf(" ");
                double grade = Double.parseDouble(line.substring(0, first_space)); //from begining to first space
                String name = line.substring(first_space+1); //First space (not included) to the end
                if(first == null){
                    last = new NodeStudent(name, grade);
                    first = last;
                }else{
                    last.next = new NodeStudent(name, grade);
                    last = last.next;
                }
            }
            s.close();
            this.seq = first;
            
        }catch(FileNotFoundException e){return;}
        
    }
    
    public void add(String n, double g){ //Ordered insertion by name
        
        NodeStudent first = this.seq;
        NodeStudent aux = first;
        NodeStudent ant = null;
        
        while(aux != null && !(n.compareToIgnoreCase(aux.name) < 0) ){
            
            ant = aux;
            aux = aux.next;
            
        }
        if(ant == null){ //the sequence is empty or the added node whould be the first alphabetically
            first = new NodeStudent(n, g, first);
            this.seq = first;
        }else{ //We are inserting between 2 nodes or at the end of the sequence
            ant.next = new NodeStudent(n, g, ant.next);
        }
        
    }
    
    public double searchByName(String n){ //returns n's grade. Returns NaN if n's corresponding node isn't in the sequence
        
        NodeStudent aux = this.seq;
        
        while(aux != null && !aux.name.equalsIgnoreCase(n)){
        
            aux = aux.next;
        
        }
        if( aux == null){return Double.NaN;
        }else{
            return aux.grade;
        }
    }
    
    public void reviewGrade(String n, double newGrade){
        
        NodeStudent aux = this.seq;
        
        while(aux != null && !aux.name.equalsIgnoreCase(n)){
        
            aux = aux.next;
        
        }
        if(aux == null){ //The student isnt in the sequence or the sequence is empty
        }else{
            aux.grade = newGrade;
        }
    
    }
    
    public NodeStudent searchMinGrade(){
        
        NodeStudent aux = this.seq;
        
        double min = 11;
        NodeStudent MinNode = null;
        
        while(aux != null){
           // System.out.println(aux.name + "g: "+aux.grade);
            if(aux.grade <= min){
                min = aux.grade;
                MinNode = aux;
            }
            aux = aux.next;
        }
        return MinNode;
    }
    
    public void sortByGrade2(){
    
        NodeStudent aux = this.seq;
        NodeStudent ant = null;
        NodeStudent min = this.searchMinGrade();
        NodeStudent minOfAll = min;
        
        NodeStudent newSeq = null;
        
        //System.out.println( (aux != null) + "min: " + min.name);
        
        //FIND MIN AND REMOVE IT FROM SEQ
        while(aux != null && !aux.equals(min)){
        
            ant = aux;
            aux = aux.next;
        }
        if(aux != null){
            ant.next = aux.next;
        }
    }
    
    
    public void sortByGrade(){
        
        NodeStudent aux = this.seq;
        NodeStudent ant = null;
        NodeStudent min = this.searchMinGrade();
        NodeStudent minOfAll = min;
        
        //System.out.println( (aux != null) + "min: " + min.name);
        while(aux != null){
            
            System.out.println("aux: " + aux.name + " | min: " + min.name + "valor: " + aux.equals(min));
            
            if(aux.equals(min)){
                System.out.println("AUX = MIN");
                //REMOVING MIN FROM THE SEQUENCE
                
                if(ant == null){
                    this.seq = this.seq.next;
                }else{
                    ant.next = aux.next;
                }
                
                // SEARCHING NEW MIN
                
                NodeStudent neomin = this.searchMinGrade();
                System.out.println("NEOMIN: "+neomin.name);
                
                if(neomin.equals(minOfAll)){return;}
                
                //ADDING min TO THE BEGINING OF THE SEQUENCE
                
                min.next = this.seq;
                this.seq = min;
                
                //UPDATING min
                min = neomin;
                
                //UPDATING AUX AND ANT, we start again
                
                aux = this.seq;
                ant = null;
                
            }
            System.out.println("INSIDE WHILE");
            ant = aux;
            aux = aux.next;
            
        }
        System.out.println("FIN DEL WHILEEE");
        return;
        
    }
    
    public String toString(){return "";}
    
    public boolean compareTo(){return true;}
    
}
