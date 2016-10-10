/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author jose
 */
import java.util.*;

public class Factorial {

   public static Scanner input = new Scanner(System.in);
   
   public static int Factorial(int num)
   {
       int factorial_value = 1;
       
       for( int i = num; num > 1; num--)
       {
           
           factorial_value = factorial_value* num;
           
       }
           
       return factorial_value;
       
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Please enter a number and I will find the factorial value: ");
        int number = input.nextInt();
        
        
        System.out.println("The factorial value of " + number + " is " + Factorial(number));
        System.out.print("got it");
    }
    
}
