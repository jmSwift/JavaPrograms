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
public class BookTest {
    
    public static void main(String[] args)
    {
         // TODO code application logic here
        List<Book> books = new ArrayList();
        books.add(new Book("Jose Meza",2016,99.99));
        books.add(new Book("Jose Meza",2016,19.99));
        books.add(new Book("Mark", 2005, 49.99));
        
        //Book myBook = new Book("Jose Meza",2016,99.99);
        
        //System.out.println(myBook.toString());
        
        Collections.sort(books);
        
        for(Book book: books)
            System.out.println(book);
        
        System.out.print(books.get(2));
        
        
        if(books.get(0).equals(books.get(1)))
            System.out.println("True");
        else
            System.out.println("False");
                
    
    
    }
}
