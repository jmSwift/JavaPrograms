/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class OutOfRangeException extends Exception {
    
    
    public static Scanner input = new Scanner(System.in);
    public static int number = 5;
    
    public OutOfRangeException()
    {
        super("number out of range");
    }
            
    public static void main(String [] args)
    {
        
        System.out.print("Enter a number from 2-30");
        while(input.hasNextInt())
        {
            number = input.nextInt();

            try{
                if(number < 2 || number > 30)
                {
                    //super();
                    throw new Exception("number out of bounds, program now ending");
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.exit(0);

            }
        }
        
      
        
        
    }
    
    
}
