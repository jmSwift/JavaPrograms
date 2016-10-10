/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */;;
package permutation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Permutation {
    
    public static Scanner input = new Scanner(System.in);
    

    //got the method from here and changed it slightly http://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html
      public static void permute(String beginningString, String endingString)
      {
          String temp = "[";
           if (endingString.length() <= 1)
           {
               for(int i = 0; i < beginningString.length();i++)
               {
                  
                   temp +=  beginningString.charAt(i) + ",";
                   
                   //System.out.print(beginningString.charAt(i) +" ");
                   //System.out.print(endingString);
               //System.out.println();
               }
               
               temp +=  endingString + "]";
           System.out.println(temp);
           
           }
           else
            for (int i = 0; i < endingString.length(); i++)
            
        try {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

          permute(beginningString + endingString.charAt(i), newString);
        } 
        catch (StringIndexOutOfBoundsException exception) {
          exception.printStackTrace();
        }
      
  }

    //public static ArrayList<String> strList = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String line;
        
        System.out.print("Enter a list of numbers separated by commas: ");
        line = input.nextLine();
        
        String [] tokens = line.split(",");
        
        String word = "";
        
        for(int i = 0; i < tokens.length; i++)
            word += tokens[i];
        
        
        permute("",word);
        
        
        
    }
    
}
