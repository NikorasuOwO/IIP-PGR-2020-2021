package Nodos;

public class EjerciciosNodos{

    public static NodeInt SecuenciaPares(NodeInt node){
        NodeInt aux = node;
        NodeInt res_aux = null;
        NodeInt res = null;
        
        while(aux != null){
            if(aux.data % 2 == 0){
                if(res == null){
                    res_aux = new NodeInt(aux.data);
                    res = res_aux;
                }else{
                    res_aux.next = new NodeInt(aux.data);
                    res_aux = res_aux.next;
                }
            }
            aux = aux.next;
        }
        return res;
    }
    public static void sampleMethod2(){

    }
    public static void sampleMethod3(){

    }
    public static void sampleMethod4(){

    }
    public static void sampleMethod5(){

    }
}
