/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packnship;

/**
 *
 * @author jose
 */
public class boxes extends Container {

    private double width;
    private double depth;
    
    boxes(double width, double depth, double length){
        this.width = width;
        this.depth = depth;
        this.length = length;
    }
    
    
    @Override
    double getSize() {
        return width * depth *getLength();
        
    }

    @Override
    double getCost() {
        return 0.35 * getSize();
    }

    @Override
    public int compareTo(Object o) {
       Container container = (Container) o;
       
       if(getCost() < container.getCost()){
           
           return -1;
       } 
       else if (getCost() > container.getCost()) {
           
             return 1;
        }
    
       return 0;
   
    }
    
    public String toString()
    {
        return (" Length: " + length + " Width: " + width + " Depth: " + depth + " Cost: $" + df.format(getCost()));
    }
}
