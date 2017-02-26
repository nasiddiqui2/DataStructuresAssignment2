import java.util.*;
interface Polygon
{
    abstract double area();
    abstract double perimeter();
}

class Triangle implements Polygon
{
    private int a;
    private int b;
    private int c;

    public Triangle()
    {
        a = 0;
        b = 0;
        c = 0;
    }
    
    public Triangle(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
    
    public double area()
    {
        double t = (0.5)*(a+b+c);
        return Math.sqrt(t*(t-a)*(t-b)*(t-c));
    }
    
    public double perimeter()
    {
        return (a+b+c);
    }
}

class IsoscelesTriangle extends Triangle
{
    public IsoscelesTriangle()
    {
        super(0,0,0);
    }
    
    public IsoscelesTriangle(int x, int y)
    {
        super (x,x,y);
    }

}

class Square implements Polygon
{
    private int x;
    
    public Square()
    {
        x = 0;
    }
    
    public Square (int y)
    {
        x = y;
    }
    
    public double area()
    {
        return x*x;
    }
    
    public double perimeter()
    {
        return x*4;
    }
}

class Pentagon implements Polygon
{
    private int x;
    
    public Pentagon()
    {
        x = 0;
    }
    
    public Pentagon(int y)
    {
        x = y;
    }
    
    public double area()
    {
        return x^5;
    }
    
    public double perimeter()
    {
        return x*5;
    }
}

class Hexagon implements Polygon
{
    private int x;
    
    public Hexagon()
    {
        x = 0;
    }
    
    public Hexagon(int y)
    {
        x = y;
    }
    
    public double area()
    {
        return x^6;
    }
    
    public double perimeter()
    {
        return x*6;
    }
}

class Octagon implements Polygon
{
    private int x;
    
    public Octagon()
    {
        x = 0;
    }
    
    public Octagon(int y)
    {
        x = y;
    }
    
    public double area()
    {
        return x^8;
    }
    
    public double perimeter()
    {
        return x*8;
    }
}

class Rectangle implements Polygon
{
    private int a;
    private int b;
    
    public Rectangle()
    {
        a = 0;
        b = 0;
    }
    
    public Rectangle(int x, int y)
    {
        a = x;
        b = y;
    }
    
    public double area()
    {
        return a * b;
    }
    
    public double perimeter()
    {
        return (a+b)*2;
    }
}

public class polygon_Values
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.println("Enter three sides of the triangle: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        Triangle T1 = new Triangle(a,b,c);
        
        System.out.println("Area of the triangle is: " + T1.area());
        System.out.println("Perimeter of the triangle is: " + T1.perimeter());
        
        System.out.println("Enter two sides of the isosceles triangle: ");
        a = in.nextInt();
        b = in.nextInt();
        
        IsoscelesTriangle IT1 = new IsoscelesTriangle(a,b);
        System.out.println("Area of isosceles triangle is: " + IT1.area());
        System.out.println("Perimeter of isosceles triangle is: " + IT1.perimeter());
        
        System.out.println("Enter the sides of the square: ");
        a = in.nextInt();
        
        Square S1 = new Square(a);
        System.out.println("Area of the square is: " + S1.area());
        System.out.println("Perimeter of the square is: " + S1.perimeter());
        
        System.out.println("Enter side of the pentagon: ");
        a = in.nextInt();
        
        Pentagon P1 = new Pentagon(a);
        System.out.println("Area of the pentagon is: " + P1.area());
        System.out.println("Perimeter of the pentagon is: " + P1.perimeter());
        
        System.out.println("Enter side of the hexagon: ");
        a = in.nextInt();
        
        Hexagon H1 = new Hexagon(a);
        System.out.println("Area of the hexagon is: " + H1.area());
        System.out.println("Perimeter of the hexagon is: " + H1.perimeter());
        
        System.out.println("Enter side of the octagon: ");
        a = in.nextInt();
        
        Octagon O1 = new Octagon(a);
        System.out.println("Area of the octagon is: " + O1.area());
        System.out.println("Perimeter of the octagon is: " + O1.perimeter());
        
        
        System.out.println("Enter the length and width of the rectangle: ");
        a = in.nextInt();
        b = in.nextInt();
        
        Rectangle R1 = new Rectangle(a,b);
        System.out.println("Area of rectangle is: " + R1.area());
        System.out.println("Perimeter of rectangle is: " + R1.perimeter());
    }

}




