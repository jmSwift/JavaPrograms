/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import homework5.Movable;

/**
 *
 * @author jose
 */
public class MovableCircle extends MovablePoint implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
       super(x,y,xSpeed,ySpeed);
       this.radius = radius;

    }
    public void moveUp()
    {
       this.y = y + ySpeed;
    }
    
    
    public void moveDown()
    {
        this.y = y - ySpeed;
    }
    
    public void moveLeft()
    {
        this.x = x - xSpeed;
    }
    
    public void moveRight()
    {
        this.x = x + xSpeed;
    }
    
    
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         // TODO code application logic here
    }
    
}
