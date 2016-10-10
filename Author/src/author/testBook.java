/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;
//import java.io;
/**
 *
 * @author jose
 */
public class testBook {
    
    public static void main(String[] args)
    {
        Author author = new Author("The life of Jose Meza", "beastie805@email.com", 'm');
        Book newBook = new Book("Jose",author,13.50);
       
        
        System.out.println(newBook.toString());
    }
    
}
