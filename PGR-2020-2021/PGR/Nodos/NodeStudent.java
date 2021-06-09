package Nodos;

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
}
