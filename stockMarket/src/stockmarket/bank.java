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
public class bank  {
    
    public String bankName;
    public double balance;
    
    public bank(String name, double balance){
        this.bankName = name;
        this.balance = balance;
        
    }
    public void withDrawal(double amountWithdraw){
        
        if(amountWithdraw > balance)
            System.out.println("Cannot withDraw that amount, please try a lower amount");
        else
            balance -= amountWithdraw;
        
    }
    
    public void deposit(double amountDeposited)
    {
        balance += amountDeposited;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getBankName()
    {
        return bankName;
    }
    
    
   


}
