package figuras;

import java.util.Scanner;

public class Circulo {
    Scanner ok=new Scanner(System.in);
    float radio,perimetro,area;
    
    public float radio()
    {
        System.out.println("Ingrese el radio: ");
        radio=ok.nextInt();
        return radio;
    }
    
    public float perimetro()
    {
        perimetro=(float)(2*3.1416*radio);
        System.out.println("Perimetro: ");
        return perimetro;
    }
    
    public float area()
    {
        area=(float)(3.1416*radio*radio);
        System.out.println("Area: ");
        return area;
    }
}
