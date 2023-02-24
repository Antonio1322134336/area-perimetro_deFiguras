package figuras;

import java.util.Scanner;

public class rectangulo {
    
    Scanner ok=new Scanner(System.in);
    Scanner ok2=new Scanner(System.in);
    float base,altura,perimetro,area;
    
    public float base()
    {
        System.out.println("Ingrese la base de la figura: ");
        base=ok.nextInt();
        return base;
    }
    public float altura()
    {
        System.out.println("Ingrese la altura de la figura: ");
        altura=ok2.nextInt();
        return base;
    }
    
    
    public float perimetro()
    {
        perimetro=(float)(base+base+altura+altura);
        System.out.println("Perimetro: ");
        return perimetro;
    }
    
    public float area()
    {
        area=(float)(base*altura);
        System.out.println("Area: ");
        return area;
    }
}
