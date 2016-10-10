/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author jose
 */
public class shapeTest {
    
    public static void main(String[] args)
    {
        
    
    Shape shape = new Shape("blue", true);
    Circle circle = new Circle(1.0, "green", false);
    Rectangle rectangle = new Rectangle(5.0,5.0);
    Square square = new Square (5.0);
    
    System.out.println(shape.toString());
    System.out.println(circle.toString());
    System.out.println(rectangle.toString());
    System.out.println(square.toString());
    
    }
    
}
