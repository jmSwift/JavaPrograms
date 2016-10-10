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
public class Book extends Publication {
    
   private String author;
    
    Book(String publisher, String title, int numberOfPages, double price, String author) 
    {
        super(publisher,title,numberOfPages,price);
        this.author = author;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    @Override
    public void print()
    {
        System.out.println(getPublisher());
        System.out.println(getTitle());
        System.out.println(getNumberOfPages());
        System.out.println(getPrice());
        System.out.println(getAuthor());
    }

}
