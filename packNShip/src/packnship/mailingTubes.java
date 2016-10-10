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
public class mailingTubes extends Container {

    private double radius;
    
    mailingTubes(double radius, double length)
    {
        this.radius = radius;
        this.length = length;
    }
    
    @Override
    double getSize() {
       return (2 * Math.PI * radius + length);
    }

    @Override
    double getCost() {
        return 0.25 * getSize();
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
        return(" Length: " + length + " Radius: " + radius + " Cost: $" + df.format(getCost()));
        
    }
}
