/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;

//import java.io;
import java.io.DataInputStream;
//import java.io;
/**
 *
 * @author jose
 */
public class Project01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parser parser = new Parser(new Scanner(
                     new DataInputStream(System.in)));

        System.out.println(" This program illustrates recursive descent parsing using a");
        System.out.println(" procedural approach.");
        System.out.println("The grammar:");
        System.out.println("\t statement = { expression  \";\" } \".\"");
        System.out.println("\t expression = term { ( \"+\" | \"-\" ) term }");
        System.out.println("\t term      = factor { ( \"*\" | \"/\" ) factor }\");\"");
        System.out.println("\t factor    = primary ^ primary | primary");
        System.out.println("\t primary   = number | \"(\" expression \") ");
    
        parser.run( );
        System.out.println("done");
        // TODO code application logic here
    }
    
}
