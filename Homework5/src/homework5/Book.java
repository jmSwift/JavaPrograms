/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jose
 */
public class Book implements Comparable {

    private String author;
    private int year;
    private double price;
    
    public Book(String author,int year, double price)
    {
        this.author = author;
        this.year = year;
        this.price = price;
    }
    
    public String getAuthor()
    {
        return author;
    }
           
    public int getYear()
    {
        return year;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return ("Author: " + author + "\nYear:" + year + "\nPrice:$" + price +"\n");
    }
    
     public int compareTo(Object obj)
    {
       Book book =  (Book)obj;// downcasting
       //Book book = Book.class.cast(obj);
        
        if(year < book.year)
            return 1;
        else if(year == book.year)
        {
            if(price > book.price)
                return 1;
            else
                return -1;
        }
        else 
            return -1;
        
    }
    
     public boolean equals(Object obj)
     {
         //Book book = Book.class.cast(obj);
         
         Book book =  (Book)obj;
         
         return(year == book.year && book.author.equals(author));
             
     }
     
    public static void main(String[] args) {
       
   
   
}

}