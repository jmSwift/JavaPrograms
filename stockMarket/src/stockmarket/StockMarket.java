/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jose
 */
public class StockMarket {
    
    /**
     * @param args the command line arguments
     */
  
    
    
    
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
        File file = new File("stockMarketTransaction.txt");
        PrintWriter output = new PrintWriter(new FileWriter(file, true));
        DecimalFormat formatdec = new DecimalFormat("0.00");
        
        Random randy = new Random();
        ArrayList<player> playerList = new ArrayList<player>();
        player jose = new player("bank of america",2000, "jose");
        player tony = new player("wells fargo" , 2000, "tony");
        player chris = new player("bank of america", 2000, "chris");
        player rudy = new player("wells fargo", 2000, "rudy");
        player anna = new player("chase", 2000, "anna");
        
        company NorthropGrunman = new company("Northrop",0);
        company google = new company("google",0);
        company amazon = new company("amazon",0);
        
        int personSellingStock;
        int numberOfStocksBeingSold;
        double highest = 0; // highest bid price
        int highestBidder = 0;
        double temp;
        double stockPrice;
        int checkIfBidding;
        
        playerList.add(jose);
        playerList.add(tony);
        playerList.add(chris);
        playerList.add(rudy);
        playerList.add(anna);
        playerList.add(google);
        playerList.add(NorthropGrunman);
        playerList.add(amazon);
       
        long t = System.currentTimeMillis();
        long end = t+30000;
        //long everyTenSeconds = t + 10000;
        long firstTen = t + 10000;
        long secondTen = t + 20000;
        long thirdTen = t + 29000;
        
        boolean tenSeconds = false;
        boolean twentySeconds = false;
        boolean thirtySeconds = false;
        
        System.out.println("Program is now running, Please allow 30 seconds \n");
        
        while(System.currentTimeMillis() < end) {
            //get random person to sell stock
            personSellingStock = randy.nextInt(playerList.size()) ;

            while(playerList.get(personSellingStock).amountOfStocks == 0)
            {
                personSellingStock = randy.nextInt(playerList.size());
            }
            
            //get stock worth
            temp = playerList.get(personSellingStock).getStockWorth();
           
            
            numberOfStocksBeingSold  = randy.nextInt(playerList.get(personSellingStock).getAmountOfStocks() ) +1;
            
            
            //get random bids
            for(int i = 0; i < playerList.size(); i++)
            {
                if(!playerList.get(i).equals(playerList.get(personSellingStock))){
                    checkIfBidding = randy.nextInt(2);
                    if(checkIfBidding == 0)
                     playerList.get(i).setCurrentBid(ThreadLocalRandom.current().nextDouble(0,temp));
                   

                }
            }

            highestBidder = randy.nextInt(playerList.size());

            while(playerList.get(personSellingStock).equals(playerList.get(highestBidder))){
                highestBidder = randy.nextInt(playerList.size());
            }

            highest = playerList.get(highestBidder).getCurrentBid();
           

            for(int i = 0; i < playerList.size(); i++)
            {
                if(!playerList.get(i).equals(playerList.get(personSellingStock))){
                    if( highest < playerList.get(i).getCurrentBid()){
                        highest = playerList.get(i).getCurrentBid();
                        highestBidder = i;
                    }
                }
            }

            
            //Accept or Decline highest bidders offer
            if(playerList.get(personSellingStock).isFirstTimeSellingStock() == true)
            {
                if(playerList.get(highestBidder).getCurrentBid() > playerList.get(personSellingStock).getStockWorth() * .75 &&
                playerList.get(highestBidder).getBalance() > playerList.get(highestBidder).getCurrentBid() * numberOfStocksBeingSold){
                    playerList.get(personSellingStock).sellStocks(numberOfStocksBeingSold);
                    playerList.get(highestBidder).withDrawal(numberOfStocksBeingSold * playerList.get(highestBidder).getCurrentBid());
                    playerList.get(highestBidder).buyStocks(numberOfStocksBeingSold);
                //playerList.get(personSellingStock).sellStocks(numberOfStocksBeingSold);
                    playerList.get(personSellingStock).deposit(numberOfStocksBeingSold * playerList.get(highestBidder).getCurrentBid());
                    playerList.get(personSellingStock).soldFirstStock();
                    
                    //print transactions to file
                    output.println(playerList.get(personSellingStock).getName() + " sold : " +
                            numberOfStocksBeingSold + " stocks to:  " + playerList.get(highestBidder).getName()  + " for: $" +
                            formatdec.format(playerList.get(highestBidder).getCurrentBid() * numberOfStocksBeingSold)) ;
                   
                    
                }
            }
            else if(playerList.get(highestBidder).getCurrentBid() > playerList.get(personSellingStock).getStockWorth() * .9 &&
               playerList.get(highestBidder).getBalance() > playerList.get(highestBidder).getCurrentBid() * numberOfStocksBeingSold)
            {
                playerList.get(personSellingStock).sellStocks(numberOfStocksBeingSold);
                playerList.get(highestBidder).withDrawal(numberOfStocksBeingSold * playerList.get(highestBidder).getCurrentBid());
                playerList.get(highestBidder).buyStocks(numberOfStocksBeingSold);
                //playerList.get(personSellingStock).sellStocks(numberOfStocksBeingSold);
                playerList.get(personSellingStock).deposit(numberOfStocksBeingSold * playerList.get(highestBidder).getCurrentBid());

                
                //print transactions to file
                    output.println(playerList.get(personSellingStock).getName() + " sold : " +
                            numberOfStocksBeingSold + " stocks to:  " + playerList.get(highestBidder).getName() + " for: $" +
                            formatdec.format(playerList.get(highestBidder).getCurrentBid() * numberOfStocksBeingSold));
                   
            }
             
            
            //Collect interest every 10 seconds
           if(System.currentTimeMillis() > firstTen && tenSeconds == false){
               tenSeconds = true;
               Collections.sort(playerList);
               playerList.get(0).collectInterest(5);
               playerList.get(1).collectInterest(5);
               for(int i = 2; i < playerList.size(); i++)
                {
                    playerList.get(i).collectInterest(3);
                }
               
           } else if(System.currentTimeMillis() > secondTen && twentySeconds == false) {
               twentySeconds = true;
               Collections.sort(playerList);
               playerList.get(0).collectInterest(5);
               playerList.get(1).collectInterest(5);
               for(int i = 2; i < playerList.size(); i++)
                {
                    playerList.get(i).collectInterest(3);
                }
              
           } else if(System.currentTimeMillis() > thirdTen && thirtySeconds == false){
               thirtySeconds = true;
               Collections.sort(playerList);
               playerList.get(0).collectInterest(5);
               playerList.get(1).collectInterest(5);
               for(int i = 2; i < playerList.size(); i++)
                {
                    playerList.get(i).collectInterest(3);
                }
               
           }
               

        

        ///end of while-loop
        }
        
        
        
        for(int i = 0; i < playerList.size(); i++)
        {
            System.out.println(playerList.get(i).toString());
        }
        
       
        
    }
}
    

