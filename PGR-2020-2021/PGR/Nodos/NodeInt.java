package Nodos;

public class NodeInt{
    
    int data;
    
    //NodeInt[] previous = null;
    //NodeInt[] next = null;
    NodeInt previous = null;
    NodeInt next = null;
    
    public NodeInt(int data, NodeInt next, NodeInt previous){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
    public NodeInt(int data, NodeInt next){
        this.data = data;
        this.next = next;
    }
    public NodeInt(int data){
        this.data = data;
        this.next = null;
    }
    
    
    public static NodeInt randomSequence(int n){ //creates a sequence with n nodes with random values
        
        NodeInt node = new NodeInt( (int)(101*Math.random()) );
        
        for(int i = 1 ; i < n ; i++){
            node = new NodeInt((int)(101*Math.random())  , node);
            
        }
        
        return node;
    }
    public static NodeInt OrderedSequence(int n){ //creates a sequence with n nodes with increasing value
        
        NodeInt node = new NodeInt(0);
        
        for(int i = 1 ; i < n ; i++){
            node = new NodeInt(i, node);
            
        }
        
    return node;
    
    }
    
    
    public String next_toString(){
        return this.next.toString();
    }
    
    public String toString(){
        return super.toString().split("@")[1];
    }
    
    public String toStringRaw(){
        return super.toString();
    }
    
    public String destination_route_ids(){
        if(this.next != null){
            return super.toString().split("@")[1]+"->"+this.next.destination_route_ids();
        }else{return super.toString().split("@")[1];
        }
    }
    
    public String destination_route_values(){
        if(this.next != null){
            return this.data +"->"+this.next.destination_route_values();
        }else{return Integer.toString(this.data);
        }
    }
    
    public static void main (String[] args){
    
        // INSERCIÓN DELANTERA
        System.out.print("INSERCIÓN DELANTERA" + "\n\n"); 
        /*NodeInt sec = null;
        sec = new NodeInt(10);
        sec = new NodeInt(9, sec);
        sec = new NodeInt(8, sec);
        sec = new NodeInt(7, sec);*/
        
        NodeInt sec = null;
        sec = new NodeInt(10);
        
        for(int i = 9 ; i > 0 ; i--){
            sec = new NodeInt(i, sec);
            System.out.println("Inserción de " + i + " | nodo " + sec.toString() + " | con valor " + sec.data + " | grafo ruta destino del nodo: ");
            System.out.println(sec.destination_route_values());
        }
        
        System.out.print("grafo ruta destino del nodo final"+ "\n");
        System.out.println(sec.destination_route_ids());
        System.out.println(sec.destination_route_values());
        
        //INSERCIÓN TRASERA
        
        System.out.print("\n\n\n" + "INSERCIÓN TRASERA" + "\n");
        
        /*
        sec = null;
        NodeInt ultimo = null;
        
        sec = new NodeInt(10);
        ultimo = sec;
        
        ultimo.next = new NodeInt(9);
        ultimo = ultimo.next;
        ultimo.next = new NodeInt(8);
        ultimo = ultimo.next;
        ultimo.next = new NodeInt(7);
        ultimo = ultimo.next;*/
        
        NodeInt ultimo = new NodeInt(10);
        NodeInt primero = ultimo;
        for(int i = 9 ; i > 0 ; i--){
            ultimo.next = new NodeInt(i);
            ultimo = ultimo.next;
            System.out.println("Inserción de " + i + " | nodo " + ultimo.toString() + " | con valor " + ultimo.data + " | grafo ruta destino del nodo: ");
            System.out.println(ultimo.destination_route_values());
        }
        
        System.out.print("grafo ruta destino del nodo final"+ "\n");
        System.out.println(ultimo.destination_route_ids());
        System.out.println(ultimo.destination_route_values());
        
        System.out.println("El nodo final es el destino de todos los anteriores. El grafo ruta destino del primer nodo es el siguiente:");
        System.out.println(primero.destination_route_ids());
        System.out.println(primero.destination_route_values());
        
        ManageSequences.SaveSequenceTXT(primero, "fichero.txt");
        
    }
}
