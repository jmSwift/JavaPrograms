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
public class Container {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Container(int x, int y, int width, int height)
    {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + height;
        this.y2 = y + height;
    }
    
    //getters
    
    public int getX1()
    {
        return x1;
    }
    
    public int getY1()
    {
        return y1;
    }
    
    public int getX2()
    {
        return x2;
    }
    
    public int getY2()
    {
        return y2;
    }
    
    //setters
    
    public void setX1(int x1)
    {
        this.x1 = x1;
    }
    
    public void setY1(int y1)
    {
        this.y1 = y1;
    }
    
    public void setX2(int x2)
    {
        this.x2 = x2;
    }
    
    public void setY2(int y2)
    {
        this.y2 = y2;
    }
    
    
    public boolean collidesWith(Ball ball)
    {
        if(ball.getX() < 0 || ball.getX() > 100)
        {
            ball.reflectHorizontal();
            return true;
        }
        if(ball.getY() < 0 || ball.getY() > 100)
        {
            ball.reflectVertical();
            return true;
        }
        
        return false;
    }
    
    public String toString()
    {
        return "Container at (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")";
    }
}
