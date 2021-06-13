package Colas_Pilas;
import java.util.NoSuchElementException;


public class CopyOfQueueInt{

    NodeInt last;
    int size;
    
    public CopyOfQueueInt(){
        
        this.last = null;
        size = 0;
        
    }
    
    public CopyOfQueueInt(int[] a){
    
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
        return last.next.data;
        }else{throw new NoSuchElementException();}
    }
    
    public int remove(){
        if(!this.isEmpty()){
            int a;
            a = this.last.next.data;
            this.last.next = this.last.next.next;
            size--;
            if(last == null){last.next=null;}
            return a;
        }else{throw new NoSuchElementException();}
    }
    
    public void add(int x){
        if(!this.isEmpty()){
            this.last.next = new NodeInt(x, last.next);
            this.last = this.last.next;
            size++;
        }else{
            this.last = new NodeInt(x);
            this.last.next = this.last;
            size++;
        }
    
    }
    
    
}
