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
public class KidsMagazine extends Magazine {
    
    private int age; 
    
    KidsMagazine(String publisher,String title, int numberOfPages, double price, String publicationFrequency, int age)
    {
        super(publisher,title,numberOfPages,price,publicationFrequency);
        this.age = age;
    }
    
    public int getAge()
    {
        return age;
    }
}
