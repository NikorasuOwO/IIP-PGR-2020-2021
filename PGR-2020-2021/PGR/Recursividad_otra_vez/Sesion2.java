package Recursividad_otra_vez;


public class Sesion2{
    
    public static void print(int n){
    
        System.out.println(n);
    }

    public static void MostrarDecreciente(int n){
        
        if(n <= 0){
            return ;
        }else{
            print(n);
        }
        MostrarDecreciente(n-1);
    }
    
    public static void MostrarCreciente(int n){
        if(n <= 0){
            return ;
        }else{
            MostrarCreciente(n-1);
            print(n);
        }
        
    }
    
    public static void DigitosInv(int n){
        if(n != 0){
            print(n%10);
            DigitosInv(n/10);
        }
    }
/*
    public static void MostrarDecreciente(){
        
    }*/
    
}


