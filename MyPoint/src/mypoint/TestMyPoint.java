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
public class TestMyPoint {
    
    public static void main(String[] args)
    {
        MyPoint another = new MyPoint(13,25);
        
        System.out.println(another.toString());
        
        System.out.println(another.distance(3,10));
        
        
        MyPoint newPoint = new MyPoint(3,10);
        
        System.out.println(another.distance(newPoint));
        
        MyCircle circle = new MyCircle(0,0,5);
        
        circle.setCenterXY(25,25);
        System.out.println(circle.toString());
        
        
        MyTriangle tri= new MyTriangle(1,1,2,2,3,3);
        
        System.out.println(tri.toString());
        
        
    }
}
