/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

/**
 *
 * @author Phernandez
 */
public class Parte2 extends Parte1{
    
     Parte2(double a, double b) {
        super(a, b);
    }

    // sobreescribe el área .
    
    double area() {
        System.out.println("dentro Area de Rectángulo.");
        return dim1 * dim2;
    }
   }
class Triángulo extends Parte1 {
    Triángulo(double a, double b) {
        super(a, b);
    }

    // sobreescribe el área 

    double area() {
        System.out.println("dentro Area de Triángulo.");
        return dim1 * dim2 / 2;
    }
}
class Areas {
    public static void main(String args[]) {
        Parte1 f = new Parte1(10, 10);
        Parte2 r = new Parte2(9, 5);
        Triángulo t = new Triángulo(10, 8);
        Parte1 figref;
        figref = r;
        System.out.println("Area is" + figref.area());
        figref = t;
        System.out.println("Area is" + figref.area());
        figref = f;
        System.out.println("Area is" + figref.area());
    }
}