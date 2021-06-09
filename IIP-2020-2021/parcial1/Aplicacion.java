

package parcial1;

import java.util.*;

/**
Esta clase va a permitir al usuario elegir qué método quiere utilizar
 */
public class Aplicacion {
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    
        Scanner escaner = new Scanner(System.in); //Creamos el objeto escaner que cogerá datos por teclado
        escaner.useLocale(Locale.ENGLISH); //DEBERÍA SER español :(
        byte choice;
        boolean salir = false;
        
        
            
            
            do{
                
            System.out.println("\n1: Calculadar una raíz");
            System.out.println("2: Calcular otra raíz");
            System.out.println("3: Calcular area");
            System.out.println("4: Calcular volumen");
            System.out.println("5: Calcular volumen a partir del área");
            System.out.println("6: Celsius a Fareheit");
            System.out.println("7: Farenheit a Celsius");
            System.out.println("8: Calcular precio final con iva dado");
            System.out.println("9: Calcular duración del viaje gracias a la hora de ida y llegada");
            System.out.println("10: Caminante");
            System.out.println("\n0: SALIR DEL SELECTOR");
            
            System.out.print("\n¿Qué problema quieres resolver?\n ");
                
            
            choice = escaner.nextByte();
            
            switch(choice){
                case 0: salir = true; break;
                
                case 1:
                    System.out.println("Dime los coeficientes del polinomio por favor");
                    System.out.println(Aritmetica.p02(escaner.nextInt(),escaner.nextInt(),escaner.nextInt())); break;
                
                case 2:
                    System.out.println("Dime los coeficientes del polinomio por favor");
                    System.out.println(Aritmetica.p01(escaner.nextInt(),escaner.nextInt(),escaner.nextInt())); break;
                
                case 3:
                    System.out.println("Dime el radio por favor");
                    System.out.println(Aritmetica.area(escaner.nextDouble())); break;
                
                case 4:
                    System.out.println("Dime el radio por favor");
                    System.out.println(Aritmetica.volumenRadio(escaner.nextDouble())); break;
                
                case 5:
                    System.out.println("Dime el área por favor");
                    System.out.println(Aritmetica.volumenArea(escaner.nextDouble())); break;
                
                case 6:
                    System.out.println("Dime el valor de la temperatura en grados Celsius por favor");
                    System.out.println(Aritmetica.c2f(escaner.nextDouble())); break;
                    
                case 7:
                    System.out.println("Dime el valor de la temperatura en grados Farenheit por favor");
                    System.out.println(Aritmetica.f2c(escaner.nextDouble())); break;
                    
                case 8:
                    System.out.println("Dime el precio y después el IVA por favor. Para el IVA, expresar em %");
                    System.out.println(Aritmetica.masIVA(escaner.nextDouble(),escaner.nextInt())); break;
                
                case 9:
                    System.out.println("Dime las horas, minutos y segundos de salida, y luego los respectivos valores de llegada");
                    System.out.println(Aritmetica.duracion(escaner.nextInt(),escaner.nextInt(),escaner.nextInt(),escaner.nextInt())); break;
                
                case 10:
                    System.out.println("dime la distacia");
                    double alt = escaner.nextDouble(); double difcabezapies = Aritmetica.redondear0(Aritmetica.Caminante(alt));
                    System.out.println(difcabezapies + "m"); break;
                    
                default: break;
            
            }
        
        
        }while(salir != true);
    
    }
    
}
