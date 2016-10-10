/*
 TestItem.java runs all 4 classes(Item.java, WeightItem.java,UnitItem.java, TestItem.java
 */
package homework5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class ShoppingCart {
    
      public static Scanner input = new Scanner(System.in);
      //public static String choice ="";
    
      public static String tempName = "";
      public static double tempPrice = 0;
      public static double tempWeight = 0;
      public static int tempAmount = 0;
   
      public static double totalPrice = 0;
      
      public static int weightListSize = 0;
      public static int unitListSize = 0;
    
      public WeightItem []weightList = new WeightItem[30];
      public UnitItem [] unitList = new UnitItem[30];
      
      ArrayList<String> orderOfItems = new ArrayList<String>();

    public ShoppingCart() {
    }
       
       public void getChoice(String choice)
       {
           
            do{
            System.out.print("Enter U or W: ");
            choice = input.next();
            
                
                switch(choice)
                {
                    case "u":
                    case "U": 
                            System.out.print("Enter name: ");
                            tempName = input.next();
                            System.out.print("Number of units: ");
                            tempAmount = input.nextInt();
                            System.out.print("Enter price per unit: ");
                            tempPrice = input.nextDouble();
                            unitList[unitListSize] =(new UnitItem(tempName,tempPrice,tempAmount));
                            System.out.print("Cost is: " + unitList[unitListSize].cost());
      
                            System.out.println();
                            orderOfItems.add("u");
                            totalPrice += unitList[unitListSize].cost();
                            unitListSize++;
                            System.out.println();
                            break;
                    case "w":
                    case "W": 
                            System.out.print("Enter name: ");
                            tempName = input.next();
                            System.out.print("Enter price per pound: ");
                            tempPrice = input.nextDouble();
                            System.out.print("Weight is: ");
                            tempWeight = input.nextDouble();
                            weightList[weightListSize] = (new WeightItem(tempName,tempPrice,tempWeight));
                            System.out.println("Total cost: " + weightList[weightListSize].cost());
                            
                            orderOfItems.add("w");
                            totalPrice += weightList[weightListSize].cost();
                            weightListSize++;
                            System.out.println();
                            break;
                    default:
                            System.out.println("\n");
                            checkOut();
                            System.exit(0);
                }
            }while(!choice.equals("u") || !choice.equals("w"));
       }
       
       
      
       
        public void checkOut()
        {
            //double cost = 0.0;
            
            for(int i = 0, u = 0, w = 0; i < unitListSize + weightListSize;i++)
            {
                if(orderOfItems.get(i).equals("u"))
                {
                    System.out.println(unitList[u].toString());
                    System.out.println("$" +unitList[u].cost());
                    u++;
                }
                
                else
                {
                    System.out.println(weightList[w].toString());
                    System.out.println("$" + weightList[u].cost());
                    
                    w++;
                }
                
                System.out.println();
                
            
            
          
            }
                
            System.out.println("Total cost: $" + totalPrice);
        }
        
   
}

