package parcial2;

import java.util.*;

public class Arrays {
    
    public static int[] generarArray(int n){
    
        int[] notas = new int[n]; //Creaamos array con tamaño n
        
        for(int i = 0 ; i < n ; i++){
        
            notas[i] = notas[i] = (int) (Math.random()*11); //Rellenamos el array con numeros del 0 al 10 (notas)
            
        }
        
        return notas;
        
    }
    
    public static double[] generarArrayDouble(int n){
    
        double[] notas = new double[n]; //Creaamos array con tamaño n
        
        for(int i = 0 ; i < n ; i++){
        
            notas[i] = notas[i] = (Math.random()*10); //Rellenamos el array con numeros del 0 al 10 (notas)
            
        }
        
        return notas;
        
    }
    
    public static int moda(int[] notas){ //Este método computa la nota de un array de ENTEROS
    
        int[] contador = new int[11]; //Creamos un array contador, el valor de cada índice será las veces que se repite la nota con valor del índice
        
        for(int i = 0 ; i < notas.length ; i++){ //Asociamos a cada posicion del contador, el número de notas que tienen como valor su índice.
        
            contador[notas[i]]++;
        
        }
        System.out.println("\n");
        int max = 0;
        int indexMaximo = -1;
    for(int i = 0 ; i < contador.length ; i++){ //Buscamos el máximo del array contador
            
            if(max < contador[i]){
                max = contador[i];
                indexMaximo = i; //Nos guardamos el índice del máximo en el contador, o sea la nota que más se repite
            }
        
        }    
    ArraysUtils.displayArray(contador);
    System.out.println("\n");
    return indexMaximo;
    }
    
    public static int[] invertirArray1(int a[]){
    
    int[] b = new int[a.length];
    int bindex = 0;
    
    for(int i = a.length-1 ; i > -1 ; i--){
        
        b[bindex] = a[i];
        bindex++;
    }
    
    return b;
    }

    public static int[] invertirArray2(int a[]){
    
    int[] b = new int[a.length];
    
    for(int i = 0 ; i < a.length; i++){
        
        b[a.length-1-i] = a[i];
        
    }
    
    return b;
    }
    
    public static void invertirVoid(int[] a){
        
        int[] b = invertirArray2(a);
        
        for(int i = 0 ; i < a.length ; i++){
        
            a[i] = b[i];
  
        }
        
        ArraysUtils.displayArray(a);
        
    }

    public static void invertirVoid2(int[] a){
        
        int aux = 0;
        
        for(int i = 0 ; i < a.length/2 ; i++){
        
            aux = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = aux;
        }
        
        ArraysUtils.displayArray(a);
        
    }    
    
    public static void main (String args[]) {
        
        Scanner tec = new Scanner(System.in); //Creamos un scanner que pueda leer el input por teclado
        System.out.println("### Bienvenido al gestor de notas ###");
        System.out.println("Dime cuantos alumnos tienes: ");
        
        
        int a = tec.nextInt();
        int[] notas = generarArray(a);
        ArraysUtils.displayArray(notas);
        System.out.println("La moda del conjunto de tus notas es: " + moda(notas));

        
    }
}
