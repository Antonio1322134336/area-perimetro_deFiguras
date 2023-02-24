//Acevedo Garcia Antonio
package figuras;

import java.util.Scanner;
public class Figuras {
     
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in); 
        String sw1;
        System.out.println("Elija la figura que desea calcular: \na)circulo\nb)rectangulo\nc)cuadrado\nd)triangulo");
        sw1=opcion.nextLine();
        switch(sw1)
        {
            case"a":
                Circulo figura1 = new Circulo();
                figura1.radio();
                System.out.println(figura1.perimetro());
                System.out.println(figura1.area());
                break;
            case"b":
                rectangulo figura2 = new rectangulo ();
                figura2.base();
                figura2.altura();
                System.out.println(figura2.perimetro());
                System.out.println(figura2.area());
                break;
             case"c":
                 Cuadrado figura3 = new Cuadrado();
                 figura3.lado();
                 System.out.println(figura3.perimetro());
                 System.out.println(figura3.area());
                 break;
             case"d":
                 Triangulo figura4 = new Triangulo();
                 figura4.lado1();
                 figura4.lado2();
                 figura4.lado3();
                 figura4.altura();
                 figura4.clasificacion();
                 figura4.perimetro();
                 figura4.area();
                 figura4.escaleno();
                 break;
        }
    }
    
}
