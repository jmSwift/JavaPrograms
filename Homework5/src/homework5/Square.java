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
public class Square extends Rectangle {
    
    public Square()
    {
        
    }
    
    public Square(double side)
    {
        super.setLength(side);
    }
    
    public Square(double side, String color, boolean filled)
    {
       super(side,side,color,filled);

    }
    
    public double getSide()
    {
        return super.getLength();
    }
    
    public void setSide()
    {
        
    }
    
    public void setWidth(double side)
    {
        super.setWidth(side);
    }
    
    public void setLength(double side)
    {
        super.setLength(side);
    }
    
    public String toString()
    {
         return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
