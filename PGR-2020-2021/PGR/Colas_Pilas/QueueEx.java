package Colas_Pilas;


/**
 * Write a description of class ColasEj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueEx{

    public static void Stack2Queue(StackInt stack){
        
        int element;
        
        QueueInt q = new QueueInt();
        
        if(stack.isEmpty()){ //B
            
        }else{ //G
            element = stack.pop();
            Stack2Queue(stack);
            stack.push(element);
            q.add(element);
        }
    }
    
    public static void ShowQueue(QueueInt q){
        
        QueueInt aux = new QueueInt();
        
        while(!q.isEmpty()){
            
            aux.add(q.element());
            System.out.println(q.remove());
        
        }
        
        while(!aux.isEmpty()){
        
            q.add(aux.remove());
        
        }
        
    }
    
    public static void inversion(QueueInt q){
        
        int aux;
        
        if(q.getSize() < 2){
            return;
        }else{
            aux = q.remove();
            inversion(q);
            q.add(aux);
        }
    
    }
    
}
