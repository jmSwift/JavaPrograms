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
public class MyPoint {

    /**
     * @param args the command line arguments
     */
    
    public int x = 0;
    public int y = 0;
    
    public MyPoint()
    {
        
    }
    
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public String toString()
    {
        return ("(" + x + "," + y + ")");
    }
    
    public double distance(int x, int y)
    {
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }
    
    public double distance(MyPoint another)
    {
        return another.distance(this.x,this.y);
    }
    
    public static void main(String[] args) {
        
      
        // TODO code application logic here
    }
    
}
