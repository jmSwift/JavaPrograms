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
public class MovableTest {
    
    public static void main(String[] args)
    {
        MovablePoint point = new MovablePoint(0,0,2,2);
        
        point.moveUp();
        point.moveRight();
        
        System.out.println(point.toString());
        
        MovableCircle circle = new MovableCircle(25,25,2,1,5);
        
        circle.moveUp();
        circle.moveLeft();
        
        System.out.println(circle.toString());
        
        
    }
}
