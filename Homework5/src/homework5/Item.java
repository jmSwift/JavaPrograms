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
public abstract class Item {
    
  public String name;
  public double unitPrice;
  
  public Item(String name, double unitPrice)
  {
      this.name = name;
      this.unitPrice = unitPrice;
  }
  
  public String getName()
  {
      return name;
  }
   
  public double getPrice()
  {
      return unitPrice;
  }
  
  public void setName(String name)
  {
      this.name = name;
  }
  
  public void setPrice(double unitPrice)
  {
      this.unitPrice = unitPrice;
  }
    
  public abstract double cost();
  
}