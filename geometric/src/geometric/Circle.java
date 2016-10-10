/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric;

/**
 *
 * @author jose
 */
public class Circle {
    
    protected double radius = 1.0;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double getPerimeter()
    {
        return(2*Math.PI*radius);
    }
    
    public double getArea()
    {
        return(Math.PI*Math.pow(radius,2.0));
    }
}