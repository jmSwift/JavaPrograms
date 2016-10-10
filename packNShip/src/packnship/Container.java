/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packnship;

import java.text.DecimalFormat;

/**
 *
 * @author jose
 */
public abstract class Container implements Comparable{
    
    public DecimalFormat df = new DecimalFormat("#.00"); 
    public double length;
    
    abstract double getSize();
    
    abstract double getCost();
    
    public double getLength()
    {
        return length;
    }
    
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
    
}
