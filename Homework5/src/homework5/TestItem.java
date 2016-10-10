/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class TestItem {
    
    public static Scanner input = new Scanner(System.in);
    public static String choice ="";
    
    public static String tempName = "";
    public static double tempPrice = 0;
    public static double tempWeight = 0;
    public static int tempAmount = 0;
   
    public static int weightListSize = 0;
    public static int unitListSize = 0;
    
    
    public static void main(String[] args)
    {
        
       
       ShoppingCart myShoppingCart = new ShoppingCart();
       
       String choice = "";
       
       myShoppingCart.getChoice(choice);
       
        
    
    }
    
}
