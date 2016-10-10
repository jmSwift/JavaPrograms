import java.util.*;

public class Pizza
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double diameter, area, radius;
        double price;
        double pricePerSquareInch;
        
        System.out.print("Enter the diameter of the pizza in inches: ");
        diameter = input.nextDouble();
        
        radius = diameter/2.0;
        area = 3.14*radius*radius;
        
        System.out.print("Enter the price of the pizza");
        price = input.nextDouble();
        
        pricePerSquareInch = price/area;
        
       System.out.println("The price per square inch of a "+ diameter 
               + " inch pizza is $" + pricePerSquareInch );
    }
}

