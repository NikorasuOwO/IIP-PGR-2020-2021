package Colas_Pilas;
import java.util.NoSuchElementException;


public class QueueInt{

    NodeInt first;
    NodeInt last;
    int size;
    
    public QueueInt(){
        
        this.first = null;
        this.last = null;
        size = 0;
        
    }
    
    public QueueInt(int[] a){
    
        for(int i = 0 ; i < a.length ; i++){
            this.add(a[i]);
        }
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int element(){
        if(!this.isEmpty()){
        return first.data;
        }else{throw new NoSuchElementException();}
    }
    
    public int remove(){
        if(!this.isEmpty()){
            int a;
            a = this.first.data;
            this.first = this.first.next;
            size--;
            if(first == null){last=null;}
            return a;
        }else{throw new NoSuchElementException();}
    }
    
    public void add(int x){
        if(!this.isEmpty()){
            this.last.next = new NodeInt(x);
            this.last = this.last.next;
            size++;
        }else{
            this.first = new NodeInt(x);
            this.last = this.first;
            size++;
        }
    
    }
    
}
