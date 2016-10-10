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
public class UnitItem extends Item {
    
    public int amount = 0;
    
    public UnitItem(String name, double price, int amount)
    {
        super(name,price);
        this.amount = amount;
    }
    public double cost()
    {
        return amount * unitPrice;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    
    public String toString()
    {
        return "Name " + super.getName() + "\nPrice: " + super.getPrice() + "\nAmount: " + getAmount();
    }
    
    
}
