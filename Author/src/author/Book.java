/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;

/**
 *
 * @author jose
 */
public class Book extends Author{
    
    private String name;
    //private final String email;
   // private char gender;
    private Author author;// = new Author(name,super.email,super.gender);
    private double price;
    private int qtyInStock = 0;
    
    public Book(String name, Author author,double price)
    {
     
        this.author = author;
        this.name = name;
        this.price = price;
        
    }
    
    public Book(String name, Author author, double price, int qtyInStock)
    {
        this.author = author;
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Author getAuthor()
    {
        return author;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    
    public void setQtyInStock(int qtyInStock)
    {
        this.qtyInStock = qtyInStock;
    }
    
    public String toString()
    {
        return (author.getName() + " by " + this.name + "(" + author.getGender() + ")at" + author.getEmail());
    }
}
