/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg6;

/**
 *
 * @author jose
 */
public abstract class Publication implements Comparable{
    
    private String publisher;
    private String title;
    private int numberOfPages;
    private double price;
    
    Publication(String publisher, String title, int numberOfPages, double price) 
    {
        this.publisher = publisher;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.price = price;
        
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getNumberOfPages(){
        return numberOfPages;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void print()
    {
        System.out.println(getPublisher());
        System.out.println(getTitle());
        System.out.println(getNumberOfPages());
        System.out.println(getPrice());
        
    }
    
    @Override 
    public int compareTo(Object o)
    {
        Magazine magazine = (Magazine)o;
        
        if(title.compareToIgnoreCase(magazine.getTitle()) < 0){
            return -1;
        }
        else if (title.compareToIgnoreCase(magazine.getTitle()) > 0){
       
            return 1;
        
        } 
        else
            return 0;
    }
}
