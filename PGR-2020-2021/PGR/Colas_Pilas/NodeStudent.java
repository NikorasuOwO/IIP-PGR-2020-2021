package Colas_Pilas;

public class NodeStudent{

    String name;
    double grade;
    NodeStudent next;
    
    public NodeStudent(String name, double grade, NodeStudent next){
        this.name = name;
        this.grade = grade;
        this.next = next;
    }
    public NodeStudent(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    
    public boolean equals(NodeStudent a){
        
        return (this.name == a.name) && (this.grade == a.grade);
    }
}
