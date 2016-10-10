/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcard;

/**
 *
 * @author jose
 */
public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    
    public CreditCard(String customerName,String bankName,String accountNumber, int theLimit,double startBalance)
    {
        customer = customerName;
        bank = bankName;
        account = accountNumber;
        limit = theLimit;
        balance = startBalance;
        
    }
    
    // parameter of 4 that calls the first constructor and sets balance to 0 ,for new accounts
    public CreditCard(String customer, String bank, String account, int limit)
    {
        this(customer,bank,account,limit,0.0);
    }
    
    public String getCustomer()
    {
        return customer;
    }
    
    public String getBank()
    {
        return bank;
    }
    
    public String getAccount()
    {
        return account;
    }
    
    public int getLimit()
    {
        return limit;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public boolean charge(double price)
    {
        if(price + balance > limit)
            return false;
        
        //charge is successful
        balance += price;
        return true;
    }
    
    public void makePayment(double amount)
    {
        balance -= amount;
    }
    
    public static void printSummary(CreditCard card)
    {
        //System.out.println(card.customer);
        System.out.println(card.customer);
        System.out.println(card.bank);
        System.out.println(card.account);
        System.out.println(card.limit);
        System.out.println(card.balance);
        
    }
    
    public static void main(String[] args)
    {
        CreditCard[] wallet = new CreditCard[3];
        
        wallet[0] = new CreditCard("Jose Meza", "Capital One", "123456", 5000);
        wallet[1] = new CreditCard("Jose Meza", "Wells Fargo" , "234343", 7000);
        wallet[2] = new CreditCard("Jose Meza", "Bank of America", "567567", 3000);
        
        
       for(int val = 1; val <= 16; val++)
        {
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
            
            
        }
        
        for(CreditCard card: wallet)
        {
            CreditCard.printSummary(card);
            while(card.getBalance() > 200)
            {
                card.makePayment(200);
                System.out.println("New Balance " + card.getBalance());
            }
            
        }
    }
}

