/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.text.DecimalFormat;

/**
 *
 * @author jose
 */
public class Ball {
    
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
   
    
    

    public Ball(int x, int y, int radius, int speed, int direction)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(direction);
        this.yDelta = speed * (float) Math.sin(direction);
        
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public float xDelta()
    {
        return xDelta;
    }
    
    public float yDelta()
    {
        return yDelta;
    }
    
    public void setX(float x)
    {
        this.x = x;
    }
    
    public void setY(float y)
    {
        this.y = y;
    }
    
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    
    public void setxDelta(float xDelta)
    {
        this.xDelta = xDelta;
    }
    
    public void setyDelta(float yDelta)
    {
        this.yDelta = yDelta;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
        
    }
    
    public void move()
    {
        this.x += xDelta;
        this.y += yDelta;
        
    }
    
    public void reflectHorizontal()
    {
        this.x = -xDelta;
        System.out.println("reflectHorizontal");
    }
    
    public void reflectVertical()
    {
        this.y = -yDelta;
        System.out.println("reflectVertical");
    }
    
    public String toString()
    {
        return "Ball at (" + getX() + "," + getY() + ") of velocity(" + Math.round(xDelta*100) / 100.0
               + "," + Math.round(yDelta*100) / 100.0 +  ")";
    }
}


//Math.round(xDelta*100) / 100.0;