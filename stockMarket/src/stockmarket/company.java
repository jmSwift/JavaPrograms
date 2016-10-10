/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarket;

/**
 *
 * @author jose
 */
public class company extends player {
    
    public String name;
    public int shares;
    public double priceOfShare;
    
    public company(String name , double startingBalance)
    {
        super(name,startingBalance);
        this.name = name;
        balance = startingBalance;
        amountOfStocks = 1000;
        stockWorth = 30;
    }
    
    public String getName()
    {
        return this.name;
    }
    
   
}
