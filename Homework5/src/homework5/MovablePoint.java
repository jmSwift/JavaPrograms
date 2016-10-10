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
public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public String toString()
    {
        return ("(" + x + "," + y + ")\n" + "xSpeed = " + xSpeed + " and ySpeed =" + ySpeed);
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
    
    
    
}
