
package figuras;

import java.util.Scanner;

public class Triangulo {
    Scanner ok=new Scanner(System.in);
    Scanner ok2=new Scanner(System.in);
    Scanner ok3=new Scanner(System.in);
    Scanner ok4=new Scanner(System.in);
    float lado1,lado2,lado3,altura,hipotenusa,area,perimetro;
    String clasificacion;
    
    public float lado1()
    {
        System.out.println("Ingrese la base del triangulo: ");
        lado1=ok.nextInt();
        return lado1;
    }
    public float lado2()
    {
        System.out.println("Ingrese el segundo lado del triangulo: ");
        lado2=ok2.nextInt();
        return lado2;
    }
    public float lado3()
    {
        System.out.println("Ingrese el segundo lado del triangulo: ");
        lado3=ok3.nextInt();
        return lado3;
    }
    public float altura()
    {
        System.out.println("Ingrese la altura del triangulo: ");
        altura=ok4.nextInt();
        return altura;
    }
    
    public float perimetro()
    {
        perimetro=(float)(lado1+lado2+lado3);
        System.out.println("Perimetro: "+perimetro);
        return perimetro;
    }
    
    public String clasificacion()
    {
        if(lado1==lado2&&lado1==lado3)
        {
            clasificacion="Triangulo equilatero";
        }
        if(lado1==lado2&&lado1!=lado3||lado2==lado3&&lado1!=lado2)
        {
           clasificacion="Triangulo isosceles";
        }   
        if (lado1!=lado2&&lado1!=lado3&&lado2!=lado3)
        {
            clasificacion="Triangulo escaleno";
        }
        System.out.println("clasificacion: "+clasificacion);
        return clasificacion;
    }
    
    public float area()
    {
        if(lado1==lado2&&lado1==lado3)
        {
            area=lado1*altura;
            System.out.println("Area: "+area);
        }
        if(lado1==lado2&&lado1!=lado3||lado2==lado3&&lado1!=lado2)
        {
            area=lado1*altura;
            System.out.println("Area: "+area);
        }
        if (lado1!=lado2&&lado1!=lado3&&lado2!=lado3)
        {
            area=lado1*altura;
            System.out.println("Area: "+area);
        }
        return area;
    }
    
    public float escaleno()
    {
        hipotenusa=0;
        if(clasificacion=="Triangulo isosceles")
        {
            if(lado1>lado2&&lado1>lado3)
            {
                hipotenusa=lado1;
                System.out.println("Hipotenusa: "+hipotenusa);
            }
            if(lado1>lado2&&lado1<lado3)
            {
                hipotenusa=lado3;
                System.out.println("Hipotenusa: "+hipotenusa);
            }
            if(lado1<lado2&&lado2<lado3)
            {
                hipotenusa=lado3;
                System.out.println("Hipotenusa: "+hipotenusa);
            }
        }
        return hipotenusa;
    }
}
