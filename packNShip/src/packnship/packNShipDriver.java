/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packnship;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 *   
 */
public class packNShipDriver {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       
        
        //Variables
        String userChoice;
        double length;
        double radius;
        double width;
        double depth;
        
        ArrayList<Container> containers = new ArrayList<>();
        
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Type either box or tube: ");
            userChoice = input.next();
            
            if(userChoice.equalsIgnoreCase("box"))
            {
                System.out.print("Enter the width of the box: ");
                width = input.nextDouble();
                
                System.out.print("Enter the length of the box: ");
                length = input.nextDouble();
                
                System.out.print("Enter the depth of the box: ");
                depth = input.nextDouble();
                
                boxes box = new boxes(width, depth, length);
                
                containers.add(box);
            }
            else 
            {
                System.out.print("Enter the length of the tube: ");
                length = input.nextDouble();
                    
                System.out.print("Enter radius of the tube: ");
                radius = input.nextDouble();
                
                
                mailingTubes tubes = new mailingTubes(radius,length);
                
                containers.add(tubes);
                
            }
            
            System.out.println();
        }
        
        
        Collections.sort(containers);
        Container []sortedContainers = new Container[10];
        
        for(int i = 0; i < containers.size(); i++)
        {
            sortedContainers[i] = containers.get(i);
        }
        
        for(int j = 0; j < containers.size(); j++)
        {
        String classType;
        
        if(sortedContainers[j].getClass().getName().contains("boxes"))
        {
         classType= "boxes";   
        }
        else
            classType = "mailingTubes";
            
        System.out.println("Type of Container : " + classType + "\n \tContents of Container: " + sortedContainers[j].toString() + "\n");
   
        }
        
    }
    
}
