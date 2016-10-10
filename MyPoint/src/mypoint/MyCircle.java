/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

/**
 *
 * @author jose
 */
public class MyCircle extends MyPoint {
    private MyPoint center;
    private int radius = 1;
    
    public MyCircle(int x,int y, int radius)
    {
        center = new MyPoint(x,y);
        this.radius = radius;
        
    }
    
    public MyCircle(MyPoint center, int radius)
    {
        this.center = center;
        this.radius = radius;
        
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    
    public MyPoint getCenter()
    {
        return center;
    }
    
    public void setCenter(MyPoint center)
    {
        this.center = center;
        
    }
    
    public int getCenterX()
    {
        return center.getX();
    }
    
    public int getCenterY()
    {
        return center.getY();
    }
    
    public void setCenterXY(int x, int y)
    {
     center.setX(x);
     center.setY(y);
        
    }
    
    public String toString()
    { 
        return ("Circle @(" + center.getX() + "," + center.getY() + ")radius = " + this.radius);
    }
    
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius,2.0);
    }
    
}
