/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarket;

import java.text.DecimalFormat;

/**
 *
 * @author jose
 */
public class player extends bank implements Comparable {
    
    //public double money;
    public String name;
    public int amountOfStocks;
    public double stockWorth = 30;
    public double currentBid;
    public boolean firstTimeSellingStock;
    
    DecimalFormat formatdec = new DecimalFormat("0.00");
    
    public player(String newBankName, double balance, String playerName){
        super(newBankName, balance);
        bankName = newBankName;
        this.name = playerName;
        this.balance = balance;
        this.amountOfStocks = 0;
        this.firstTimeSellingStock = true;
        /*
        stockWorth = 30;
        this.amountOfStocks = 0;
        currentBid = 0;
*/
    }
    
    public player(String name, double balance)
    {
        super(name,balance);
    }
    public int getAmountOfStocks()
    {
        return amountOfStocks;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean isFirstTimeSellingStock()
    {
        return firstTimeSellingStock;
    }
    
    public void soldFirstStock()
    {
        firstTimeSellingStock = false;
    }
    public void sellStocks(int numberOfStocksSold){
        if(numberOfStocksSold > amountOfStocks)
            System.out.println("Can not sell more stocks then owned");
        else
            amountOfStocks -= numberOfStocksSold;
        
    }
    
    public void buyStocks(int numberOfStocksBought)
    {
       amountOfStocks += numberOfStocksBought;
    }

    public double getStockWorth()
    {
        return stockWorth;
    }
    
    public void setCurrentBid(double currentBid){
        this.currentBid = currentBid;
    }
    
    public double getCurrentBid(){
        return currentBid;
    }
    
    
    public String toString()
    {
        return ("Name : " + getName() + "\nBalance: $" + formatdec.format(getBalance()) + "\nNumber of Stocks owned: " + getAmountOfStocks());
    }

    @Override
    public int compareTo(Object o) {
       player newPlayer = (player)o;
       if(balance > newPlayer.getBalance())
           return -1;
       else if(balance < newPlayer.getBalance())
           return 1;
      else
           return 0;
           
    }
    
    public void collectInterest(double interestRate)
    {
        balance += ((interestRate/100)* balance);
    }
}
