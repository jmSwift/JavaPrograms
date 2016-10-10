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
public class Magazine extends Publication {
    
    private String publicationFrequency;
    
 
    Magazine(String publisher,String title, int numberOfPages, double price, String publicationFrequency ){
        super(publisher, title, numberOfPages,price);
        this.publicationFrequency = publicationFrequency;
 
    }
    
    public String getPublicationFrequency()
    {
        return publicationFrequency;
    }
    @Override
    public void print(){
        System.out.println(getPublisher());
        System.out.println(getTitle());
        System.out.println(getNumberOfPages());
        System.out.println(getPrice());
        System.out.println(getPublicationFrequency());
        
    }

    
}
