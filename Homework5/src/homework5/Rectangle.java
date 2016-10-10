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
public class Rectangle extends Shape{
    
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle()
    {
        super();
    }
    
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
       
    }
    
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.length = length;
        //super.setColor(color);
        //super.setFilled(filled);
        //super(color,filled);
        
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    
    public double getArea()
    {
        return length * width;
    }
    
    public double getPerimeter()
    {
        return ((2*length) + (2*width));
    }
    
    public String toString()
    {
        return "A Rectangle with width=" + getWidth() + " and length=" + getLength() + ", which is a subclass of " + super.toString();
    }
}
