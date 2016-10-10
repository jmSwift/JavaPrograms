/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author jose
 */
public class Calendar {

    /**
     */
    public static Scanner input = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();
    public static StringBuilder day = new StringBuilder();
    public static StringBuilder month = new StringBuilder();
    public static StringBuilder notes = new StringBuilder();
    public static StringBuilder capitalizedNotes = new StringBuilder();
    
   // public static int Month;
    
    public static int[] daysPerMonth ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
    
    public static String[] monthsByNumber = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September","October","November","December"};
    public static int getYear()
    {
        System.out.println("Enter a year to display its 12-month Calendar");
        return input.nextInt();
        
    }
    
    public static int getDay(int day,int month,int year)
    {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d +1;
        
    }
    
    public static String getMonth(int month)
    {
        if(month == 1)
            return "January";
        else if(month == 2)
            return "February";
        else if( month == 3)
            return "March";
        else if(month == 4)
            return "April";
        else if(month == 5)
            return "May";
        else if(month == 6)
            return "June";
        else if(month == 7)
            return "July";
        else if(month == 8)
            return "August";
        else if(month == 9)
            return "September";
        else if(month == 10)
            return "October";
        else if( month == 11)
            return "November";
        else 
            return "December";
    }
    public static void printYear(int Year)
    {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter the Month Followed by day and then the event in quotation marks, type done when finished ");
        String userInput = input.nextLine();
        while(!userInput.equalsIgnoreCase("done"))
        {
            list.add(userInput);
            userInput = input.nextLine();
        }
        
        for(int months = 1; months <= 12; months++)
        {
            //sb.append(Year);
            month.append(getMonth(months));
            System.out.println(String.format("%23s %s",month,Year));
            System.out.println(String.format("%s %3s %3s %3s %3s %3s %3s", "Sun","Mon","Tues","Wed","Thurs","Fri","Sat"));
            int firstDayOfTheMonth = getDay(1,months,Year);
            //int day = 7;
            month.delete(0,month.length());
            for(int i = 0; i < 1; i++)
            {
                if(firstDayOfTheMonth == 2)
                    System.out.print(String.format("%4s",""));
                else if(firstDayOfTheMonth == 3)
                    System.out.print(String.format("%8s",""));
                else if(firstDayOfTheMonth == 4)
                    System.out.print(String.format("%13s",""));
                else if(firstDayOfTheMonth == 5)
                    System.out.print(String.format("%17s",""));
                else if(firstDayOfTheMonth == 6)
                    System.out.print(String.format("%23s",""));
                else if(firstDayOfTheMonth == 7)
                    System.out.print(String.format("%27s",""));

            }
            
            if(Year % 4 == 0)
                daysPerMonth[2] = 29;

            //System.out.println(firstDayOfTheMonth);

            for(int j = 1; j <= daysPerMonth[months]; j++)
            {
                System.out.print(j);
                
                   if(j < 10)
                   {
                   if(firstDayOfTheMonth % 7 == 3)
                      System.out.print(String.format("%4s",""));
                   else if(firstDayOfTheMonth % 7 == 5)
                       System.out.print(String.format("%5s",""));
                    else
                      System.out.print(String.format("%3s",""));
                   }

                   else
                   {
                       if(firstDayOfTheMonth % 7 == 3)
                      System.out.print(String.format("%3s",""));
                   else if(firstDayOfTheMonth % 7 == 5)
                       System.out.print(String.format("%4s",""));
                    else
                      System.out.print(String.format("%2s",""));
                   }
                     // System.out.print(firstDayOfTheMonth);

                if(firstDayOfTheMonth %7 ==0)
                    System.out.println();

                firstDayOfTheMonth++;
            }
                
                System.out.println("\n");
                //Convert the users input list into an array of objects and then to an array of Strings
                Object[] objDays = list.toArray();
               
                String[] strDays = Arrays.copyOf(objDays, objDays.length, String[].class);
             
                //Loop to check if the current month has any notes
                for(int k = 0; k < strDays.length;k++)
                {
                    String temp = getMonth(months);
                    //System.out.println(temp);
                    
                    if(strDays[k].toLowerCase().contains(temp.toLowerCase()))
                    {
                        notes.append(strDays[k]);
                        capitalizedNotes.append( notes.substring(0,1).toUpperCase() + notes.substring(1));
                        System.out.println(Pattern.compile("\"").matcher(capitalizedNotes).replaceAll(""));
                        notes.delete(0,notes.length()); // reset the notes to blank
                        capitalizedNotes.delete(0,capitalizedNotes.length());// reset capitalized notes to blank 
                        
                    }
                }
                   System.out.println();
        }
   
      
    }
    
    public static void main(String[] args) {
        
        int year = getYear();
        
        printYear(year);
        
    }
    
}
