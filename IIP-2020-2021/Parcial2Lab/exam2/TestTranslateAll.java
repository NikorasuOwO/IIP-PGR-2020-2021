 

import graph2D.Graph2D;
import others.Point;
import others.Polygon;
import java.awt.Color;
import java.util.Scanner;
/**
 * Clase programa para facilitar la prueba del codigo, desarrollado por
 * el alumno, para el metodo translateAll.
 * El main crea una secuencia con 3 cuadrados en escalera superpuestos:
 * verde en el origen, rojo desplazado a la derecha y arriba y 
 * azul desplazado tambien a la derecha y arriba.
 * Se realizan 2 pruebas partiendo siempre de la secuencia original
 * y llamando al metodo translateAll(Polygon, double, double) para ver que:
 * 1.- Si Polygon es un triangulo, la figura no se modifica. 
 * 2.- Si Polygon es un cuadrado, se trasladan todos.
 * 
 * La prueba 3 parte de 1 triangulo verde y 2 cuadrados (rojo y azul) 
 * superpuestos.
 * Se llama al metodo translateAll(Polygon, double, double), siendo
 * Polygon un triangulo, para ver que el triangulo verde es el unico 
 * que se traslada.
 * 
 * La prueba 4 parte de 1 cuadrado verde, 1 triangulo rojo y 1 cuadrado azul
 * superpuestos.
 * Se llama al metodo translateAll(Polygon, double, double), siendo
 * Polygon un triangulo, para ver que el triangulo rojo es el unico 
 * que se traslada.
 * 
 * La prueba 5 parte de 1 cuadrado verde, 1 cuadrado rojo y 1 triangulo
 * azul superpuestos.
 * Se llama al metodo translateAll(Polygon, double, double), siendo
 * Polygon un triangulo, para ver que el triangulo azul es el unico 
 * que se traslada.
 * 
 * La prueba 6 parte de 1 cuadrado verde, 1 cuadrado rojo y 1 triangulo
 * azul superpuestos.
 * Se llama al metodo translateAll(Polygon, double, double), siendo
 * Polygon un cuadrado, para ver que se trasladan los dos cuadrados. 
 * 
 * Esta clase es para uso particular del alumno. 
 * No se entrega.
 *
 * @author Parcial 2 - Ejercicio 2 
 * @version IIP - Curso 2020-21
 */
public class TestTranslateAll {
    private TestTranslateAll() { } // No se usan objetos de esta clase
    
    public static void main(String[] args)  {
        Scanner keyB = new Scanner(System.in);
        // Crea un grupo de 3 cuadrados que se superponen formando escalera                    
        Graph2D gd = new Graph2D(-20, 20, -20, 20, 400, 400, Color.WHITE, 
            "Prueba translateAll(Polygon, double, double)");
        PolygonGroup g = makeGroup(0);      
        drawGroup(gd, g);
        System.out.println("Veras 3 cuadrados superpuestos formando escalera.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");  
        System.out.println("Num. vertices: 4 ->   4  ->  4");
        System.out.println("** Prueba 1: llamada a translateAll(p, -3, -3), ");
        System.out.println("siendo p un triangulo (poligono con 3 vertices).");       
        System.out.println("Pulsa INTRO para continuar..."); 
        String s = keyB.nextLine();
        double[] x1 = {0, 0, 4}, y1 = {0, 3, 0};
        Polygon p1 = new Polygon(x1, y1);
        g.translateAll(p1, -3, -3);
        drawGroup(gd, g); 
        System.out.println("...Comprueba que la figura queda igual, sin cambios.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(0);  
        drawGroup(gd, g);
        System.out.println("Volvemos a la figura original.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");
        System.out.println("Num. vertices: 4 ->   4  ->  4");
        System.out.println("** Prueba 2: llamada a translateAll(p, -3, -3), ");
        System.out.println("siendo p un cuadrado (poligono con 4 vertices).");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        double[] x2 = {-1, -1, 3, 3}, y2 = {0, 3, 3, 0};
        Polygon p2 = new Polygon(x2, y2);
        g.translateAll(p2, -3, -3);
        drawGroup(gd, g);   
        System.out.println("...Comprueba que se trasladan todos.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(3);  
        drawGroup(gd, g);
        System.out.println("Ahora veras 1 triangulo y 2 cuadrados superpuestos.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");  
        System.out.println("Num. vertices: 3 ->   4  ->  4");
        System.out.println("** Prueba 3: llamada a translateAll(p, -3, -3), ");
        System.out.println("siendo p un triangulo (poligono con 3 vertices).");       
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(p1, -3, -3);
        drawGroup(gd, g);   
        System.out.println("...Comprueba que el unico que se ha trasladado es el triangulo verde.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(4);  
        drawGroup(gd, g);
        System.out.println("Ahora veras 1 cuadrado, 1 triangulo y 1 cuadrado superpuestos.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");
        System.out.println("Num. vertices: 4 ->   3  ->  4");
        System.out.println("** Prueba 4: llamada a translateAll(p, -3, -3), ");
        System.out.println("siendo p un triangulo (poligono con 3 vertices).");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(p1, -3, -3);
        drawGroup(gd, g);    
        System.out.println("...Comprueba que el unico que se ha trasladado es triangulo rojo.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(5);      
        drawGroup(gd, g);
        System.out.println("Ahora veras 2 cuadrados y 1 triangulo superpuestos.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");  
        System.out.println("Num. vertices: 4 ->   4  ->  3");
        System.out.println("** Prueba 5: llamada a translateAll(p, -3, -3), ");
        System.out.println("siendo p un triangulo (poligono con 3 vertices).");    
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(p1, -3, -3);
        drawGroup(gd, g); 
        System.out.println("...Comprueba que el unico que se ha trasladado es triangulo azul.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(5);      
        drawGroup(gd, g);
        System.out.println("Volvemos a la figura con 2 cuadrados y 1 triangulo superpuestos.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");
        System.out.println("Num. vertices: 4 ->   4  ->  3");
        System.out.println("** Prueba 6: llamada a translateAll(p, -3, -3), ");
        System.out.println("siendo p un cuadrado (poligono con 4 vertices).");    
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(p2, -3, -3);
        drawGroup(gd, g); 
        System.out.println("...Comprueba que se han trasladado los 2 cuadrados.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        System.out.println("Fin del proceso!!!"); 
        System.out.println("Envia ahora tu solucion a traves de la aplicacion de examen!!!");
    }
    
    /** 
     * Muestra en la salida grafica un grupo de poligonos dado.
     * @param gd Graph2D, el grafo.
     * @param p PolygonGroup, el grupo de poligonos.
     */
    private static void drawGroup(Graph2D gd, PolygonGroup g) {
        gd.clear(); 
        Polygon[] aPol = g.toArray();
        for (int i = 0; i < aPol.length; i++) {
            gd.fillPolygon(aPol[i].verticesX(), aPol[i].verticesY(),
                aPol[i].getColor(), 2);   
        }   
    }    
        
    /** 
     * Crea un grupo con 3 poligonos en escalera, segun la prueba a realizar.
     * @param prueba int, el numero de prueba.
     * @return p PolygonGroup, el grupo de poligonos.
     */
    private static PolygonGroup makeGroup(int prueba) {
        Polygon[] group = new Polygon[3];
        // cuadrado verde de tamaño 6x6 y centrado en (0.0, 0.0), perimetro = 24
        double[] x0 = {-3.0, -3.0, 3.0, 3.0};
        double[] y0 = {-3.0, 3.0, 3.0, -3.0};
        group[0] = new Polygon(x0, y0);
        group[0].setColor(Color.GREEN);       
        // cuadrado rojo de tamaño 8x8 y centrado en (4.0, 4.0), perimetro = 32
        double[] x1 = {0.0, 0.0, 8.0, 8.0};
        double[] y1 = {0.0, 8.0, 8.0, 0.0};
        group[1] = new Polygon(x1, y1);        
        group[1].setColor(Color.RED);        
        // cuadrado azul de tamaño 10x10 y centrado en (10.0, 10.0), perimetro = 40
        double[] x2 = {5.0, 5.0, 15.0, 15.0};
        double[] y2 = {5.0, 15.0, 15.0, 5.0};
        group[2] = new Polygon(x2, y2);
        group[2].setColor(Color.BLUE);
                        
        if (prueba == 3) {            
            double[] x3 = {-3.0, -3.0, 4.0};
            double[] y3 = {-3.0, 4.0, -3.0};
            group[0] = new Polygon(x3, y3);
            group[0].setColor(Color.GREEN);          
        }
        
        if (prueba == 4) {            
            double[] x4 = {0.0, 0.0, 9.0};
            double[] y4 = {0.0, 9.0, 0.0};
            group[1] = new Polygon(x4, y4);
            group[1].setColor(Color.RED);          
        }
        
        if (prueba == 5) {
            double[] x5 = {5.0, 5.0, 15.0};
            double[] y5 = {5.0, 15.0, 5.0};
            group[2] = new Polygon(x5, y5);
            group[2].setColor(Color.BLUE);
        }
        
        PolygonGroup g = new PolygonGroup();
        for (int i = 0; i < group.length; i++) {
            g.add(group[i]);
        }        
        return g;
    }
}
