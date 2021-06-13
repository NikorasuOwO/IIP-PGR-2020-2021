package Colas_Pilas;


/**
 * Write a description of class PIlasEJ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackEx{
    
    public static void showStack(StackInt stack){
        
        StackInt aux = new StackInt();
        int element;
        
        //We unstack the stack to print its elements
        //We make another stack to stack the popped elements.
        while(stack.getSize() != 0){
            
            element = stack.pop();
            System.out.println(element);
            aux.push(element);
        
        }
        
        //We re-stack the elements
        
        while(aux.getSize() != 0){
        
            element = aux.pop();
            stack.push(element);
        }
        
    }
    
    public static void showStackInversed(StackInt stack){
        
        StackInt aux = new StackInt();
        int element;
        
        //We unstack the stack to print its elements
        //We make another stack to stack the popped elements.
        while(stack.getSize() != 0){
            
            element = stack.pop();
            
            aux.push(element);
        
        }
        
        //We re-stack the elements
        
        while(aux.getSize() != 0){
        
            element = aux.pop();
            System.out.println(element);
            stack.push(element);
        }
        
    }  
    
    public static StackInt inverted(StackInt stack){
        
        StackInt aux = new StackInt();
        StackInt res = new StackInt();;
        int element;
         
        while(stack.getSize() != 0){
            element = stack.pop();
            aux.push(element);
            res.push(element);
        }
        while(aux.getSize() != 0){
            element = aux.pop();
            stack.push(element);
        }
        
        return res;
        
    }
    
    public static void inversion(StackInt stack){
        stack.top = inverted(stack).top;
    }
    
    
    public static void inversion2(StackInt stack){
    
        StackInt aux = new StackInt();
        int element;
        
        //We unstack the stack to print its elements
        //We make another stack to stack the popped elements.
        while(stack.getSize() != 0){
            
            element = stack.pop();
            
            aux.push(element);
        
        }
        
        stack.top = aux.top;
        
    }

    // METHODS THAT USE RECURSION
    
    public static int StackSum(StackInt stack){
        
        int sum = 0;
        int element;
    
        if(stack.size == 0){ //BASIS
            return 0;
        
        }else{ //GENERAL
            element = stack.pop();
            sum = element + StackSum(stack);
            stack.push(element);
        
        }
    
        return sum;
    }
    
    
    public static void shStackRec(StackInt stack){
        int element;
        if(stack.getSize() == 0){ //B
            return;
         }else{ //G
            element = stack.peek();
            System.out.println(stack.pop());
            shStackRec(stack);
            stack.push(element);
        }
    
    }
    
    public static void invShStackRec(StackInt stack){
        int element;
        if(stack.getSize() == 0){ //B
            return;
         }else{ //G
            element = stack.pop();
            invShStackRec(stack);
            stack.push(element);
            System.out.println(element);
        }
    
    }

    
    
}
