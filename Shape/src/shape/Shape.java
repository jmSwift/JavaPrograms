/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author jose
 */
public class Shape {

    private String color = "red";
    private boolean filled = true;
    
    public Shape()
    {
       
    }
    
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public boolean isFilled()
    {
        return filled;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
