
package figuras;

import java.util.Scanner;

public class Cuadrado {
    Scanner ok=new Scanner(System.in);
    float lado,perimetro,area;
    
    public float lado()
    {
        System.out.println("Ingrese el lado de de la figura: ");
        lado=ok.nextInt();
        return lado;
    }
    
    
    public float perimetro()
    {
        perimetro=(float)(4*lado);
        System.out.println("Perimetro: ");
        return perimetro;
    }
    
    public float area()
    {
        area=(float)(lado*lado);
        System.out.println("Area: ");
        return area;
    }
}
