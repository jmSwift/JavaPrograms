/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;

/**
 *
 * @author jose
 */
public class Parser {
     private Scanner scanner;


    public Parser(Scanner scanner) {
        this.scanner = scanner;
    } // Parser


    public void run ( ) {
        scanner.getToken( );
        statement( );
    } // run


    private void statement ( ) {
        //   statement = { expression  ";" } "."  
        while(scanner.token != Token.period) {
        int value = expression( );
        System.out.println("=> " + value);
        scanner.getToken( );  // flush ";"
        } // while
    } // statement


    private int expression ( ) {
        //    expression = term { ( "+" | "-" ) term }
        int left = term( );
        while (scanner.token == Token.plusop || 
           scanner.token == Token.minusop) {
            int saveToken = scanner.token;
            scanner.getToken( );
            switch (saveToken) {
                case Token.plusop:
                    left += term( );
                    break;
                case Token.minusop:
                    left -= term( );
                    break;
            } // switch
        } // while
        return left;
    } // expression


    private int term ( ) {
        //    term = factor { ( "*" | "/" ) factor }
        int left = factor( );
        while (scanner.token == Token.timesop || 
           scanner.token == Token.divideop) 
        {
            int saveToken = scanner.token;
            scanner.getToken( );
            switch (saveToken) {
                case Token.timesop:
                    left *= factor( );
                    break;
                case Token.divideop:
                    left /= factor( );
                    break;
            } // switch
        } // while
        return left;
    } // term

    private int factor(){
       // factor = primary ^ primary | primary
       int left = primary();
       while(scanner.token == Token.caretop )
       {
           //scanner.token = Token.caretop;
           int saveToken = scanner.token;
           scanner.getToken();
           switch(saveToken)
           {
               case Token.caretop:
                   left = (int)Math.pow(left,primary());
                   break;
               default:
                   scanner.error("Expecting a caret (^)");
                   break;
           }
       }
       
     //  System.out.print("hello");
       return left;
    }

    private int primary ( ) {
        //    factor    = number | "(" expression ")"
        int value = 0;
        switch (scanner.token) {
            case Token.number:
                value = scanner.number( );
                scanner.getToken( );  // flush number
                break;
            case Token.lparen:
                scanner.getToken( );
                value = expression( );
                
                if (scanner.token != Token.rparen)
                scanner.error("Missing ')'");
                scanner.getToken( );  // flush ")"
                break;
            default:
                scanner.error("Expecting number or (");
                break;
        } // switch
        return value;
    } // factor

}
