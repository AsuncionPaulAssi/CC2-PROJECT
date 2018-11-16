import java.util.Scanner;

public class Areas{
    public static void main(String[] args){
    Scanner eut = new Scanner(System.in);
    
        System.out.println("Enter Radius(Circle): ");
        double a = eut.nextDouble();
        System.out.println("Enter Base(Triangle): ");
        double b = eut.nextDouble();
        System.out.println("Enter Height(Trinngle): ");
        double c = eut.nextDouble();
        System.out.println("Enter Sides(Square): ");
        double d = eut.nextDouble();
        
        double circle = Math.PI*Math.pow(a,2);
        double triangle = b*c/2;
        double square = Math.pow(d,2);
        
        System.out.println("Area of Circle in Radius is: " + circle);
        System.out.println("Area of Triangle is: " + triangle);
        System.out.println("Area of Square is: " + square);
}
}