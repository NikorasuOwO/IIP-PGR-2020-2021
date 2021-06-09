package Nodos;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
    Read and Write node sequences with Mermaid formatting
 */
public class ManageSequences{
    
    public static boolean SaveSequenceTXT(NodeInt n, String file){
        
        try{
            PrintWriter p = new PrintWriter(file);
            int i = 1;
            while(n != null){
                
                p.print("n"+i + "(("+ n.data +"))");
                if(n.next != null){p.println(" --> " + "n"+(i+1));
                }
                n = n.next;
                i++;
            }
            p.close();
        }catch(FileNotFoundException e){return false;}
        return true;
    }
    
    public static boolean SaveSequenceHTML(NodeInt n, String file){
        
        try{
            PrintWriter p = new PrintWriter(file);
            
            
            // HTML STUFF
            
            p.println("<!DOCTYPE html>");
            p.println("<html><body>");
            p.println("<script src='https://cdn.jsdelivr.net/npm/mermaid/dist/mermaid.min.js'></script>");
            p.println("<script>mermaid.initialize({startOnLoad:true});</script>");
            p.println("Diagrama:");
            p.println("<div class='mermaid'>");
            p.println("graph TB");
            int i = 1;
            while(n != null){
                
                p.print("n"+i + "(("+ n.data +"))");
                if(n.next != null){p.println(" --> " + "n"+(i+1));
                }
                n = n.next;
                i++;
            }
            
            p.println("</div></body></html>");
            
            p.close();
        }catch(FileNotFoundException e){return false;}
        return true;
    }
    
    private static int ProcessLine(String line){ //Used to extract the data from the node representation in mermaid
        // Every line "cointains a node" and the formatting is always the same: ni((__node__ni__data__)) --> ni+1
        line = line.trim();
        
        System.out.println("line: " +line);
        
        int index_first_digit = line.lastIndexOf("(") + 1;
        int index_last_digit = line.indexOf(")");
        
        System.out.println("fi: "+index_first_digit + "li: "+index_last_digit);
        
        String number = line.substring(index_first_digit, index_last_digit);
        
        return Integer.parseInt(number);
    }
    
    public static boolean ReadSecuencia(String file, NodeInt first){
        // Every line "cointains a node" and the formatting is always the same: ni((__node__ni__data__)) --> ni+1
        
        try{
        Scanner S = new Scanner(new File(file));
        
        //Saving the first node in "first"
        first.data = ProcessLine(S.nextLine());
        
        NodeInt current = first;
        while(S.hasNextLine()){ //Looping through the file and creating the sequence
            current.next = new NodeInt(ProcessLine(S.nextLine()));
            current = current.next;
        }
        
        S.close();
        
        return true;
        
        }catch(Exception e){System.out.println(e); return false;}
    }
    
    public static void main (String[] args){
        
        //Just checking if everythiing wordks fine
        
        NodeInt node = NodeInt.OrderedSequence(100);
        
        SaveSequenceHTML(node, "ficheroH.html");
    
    }
    
}
