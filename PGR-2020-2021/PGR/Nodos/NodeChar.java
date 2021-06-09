package Nodos;

public class NodeChar{

    char data;
    NodeChar next;
    
    public NodeChar(char c){
        this.data = c;
        this.next = null;
    }
    public NodeChar(char c, NodeChar n){
        this.data = c;
        this.next = n;
    } 
    
    public static NodeChar String2NodeChar(String a){
    
        NodeChar current = null;
        
        if(a == null || a.isEmpty()){
            return current;
        }
        
        NodeChar first = new NodeChar(a.charAt(0));
        current = first;
        
        for(int i = 1 ; i < a.length() ; i++){
            
            current.next = new NodeChar(a.charAt(i));
            current = current.next;
        
        }
        return first;
    }
    
    public static String NodeChar2String(NodeChar node){
        
        String S = "";
        while(node != null){
        
            S = S + node.data;
            node = node.next;
            
        }
        return S;
    }
    
    public static void main (String[] args){
        
        System.out.println("### EXPERIMENTO ### \n\n");
        
        NodeChar n1 = new NodeChar('a');
        NodeChar n2 = new NodeChar('s', n1);
        NodeChar n3 = new NodeChar('a', n2);
        NodeChar n4 = new NodeChar('c', n3);
        System.out.println(n4.data + " : " + n4);
        System.out.println(NodeChar2String(n4));
        System.out.println(n4.data + " : " + n4);
    }
    
}
