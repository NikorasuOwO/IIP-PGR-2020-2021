package Colas_Pilas;
import java.util.NoSuchElementException;

public class StackInt{
    
    int size;
    NodeInt top;
    
    
    public StackInt()
    {
        top = null;
        size = 0;
    }
    
    public StackInt(int[] a)
    {
        for(int i = 0 ; i < a.length ; i++){
            this.push(a[i]);
        }
    }

    public void push (int data){
        
        top = new NodeInt(data, top);
        size++;
    
    }
    
    public int peek (){
        
        if(size == 0){
            throw new NoSuchElementException();
        }else{
            return top.data;
        }
    }
    
    public int pop(){
        
        if(size == 0){
            throw new NoSuchElementException();
        }else{
            int aux = top.data;
            top = top.next;
            size--;
            return aux;
        }  
    }
    public int getSize(){
        return this.size;
    
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
