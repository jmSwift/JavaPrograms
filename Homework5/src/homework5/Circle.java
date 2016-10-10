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
public class Circle extends Shape {
    
    private double radius = 1.0;
    
    public Circle()
    {
        
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public Circle(double radius,String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        
    }
    
    public double getRadius()
    {
       return radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return Math.PI * Math.pow(radius,2.0);
    }
    
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    
    public String toString()
    {
        return "A Circle with radius="  + getRadius() + ", which is a subclass of " + super.toString();
    }
    
}
