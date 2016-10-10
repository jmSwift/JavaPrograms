/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkrange;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class OutOfRangeException extends Exception {

    public static Scanner scanner = new Scanner(System.in);
    
    public OutOfRangeException()
    {
        super();
    }
    
    public OutOfRangeException(String s){
        super(s);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        
        do{
            
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            
        try 
        {
            if(input < 25 || input > 50)
            {
                throw new OutOfRangeException();
            }
        }
        catch(OutOfRangeException ex)
        {
            System.out.println("Please enter a number between 25 and 50! ");
        }
    }while(input < 25 || input > 50);
        
        
        
  }
    
}
