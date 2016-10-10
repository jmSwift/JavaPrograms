/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

/**
 *
 * @author jose
 */
public class Fact {

    public static void factorial(int n){
        int i, f;
       // n = 3;
        i = 1;
        f = 1;
        while(i < n) {
            i += 1;
            f *= i;
            
            System.out.println("N = " + n + " F = " + f);
        }
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       factorial(17);
        
        
    }
    
}
