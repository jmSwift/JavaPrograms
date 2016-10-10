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
public class WeightItem extends Item {
    
    public double weight = 0;
    
    public WeightItem(String name, double price, double weight)
    {
        super(name,price);
        this.weight = weight;
    }
    
    public double cost()
    {
        return weight * unitPrice;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public String toString()
    {
        return "Name " + super.getName() + "\nPrice: " + super.getPrice() + "\nLbs: " + getWeight();
    }
    
}
