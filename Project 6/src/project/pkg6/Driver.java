/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jose
 */
public class Driver {

    /**
    
     */
    public static void main(String[] args) {
        
        Magazine[] newMagazines = new Magazine[10];
        newMagazines[0] = new Magazine ("MezaPublications", "My first mag", 140, 9.99, "bi-weekly");
        newMagazines[1] = new Magazine("Pearson","Calculus 2 tips and tricks",130, 9.99, "monthly");
        newMagazines[2] = new Magazine("Pearson", "Physics tips and tricks", 150, 14.99, "monthly");
        newMagazines[3] = new Magazine("Wolters Kluwer", "March tv guide", 120, 9.99, "monthly");
        newMagazines[4] = new Magazine("Pearson", "Computer science lnguages", 500, 49.99, "monthly");
        newMagazines[5] = new Magazine("Pearson", "Algebra tips and tricks", 200, 19.99,"yearly");
        newMagazines[6] = new Magazine("Pearson", "Speaking and tricks", 200, 9.99,"yearly");
        newMagazines[7] = new Magazine("Pearson", "java tips and tricks", 200, 14.99,"yearly");
        newMagazines[8] = new Magazine("Pearson", "c++ tips and tricks", 200, 18.99,"yearly");
        newMagazines[9] = new Magazine("Pearson", "objective-c tips and tricks", 200, 19.99,"yearly");
        
        
        ArrayList<Magazine> magazine = new ArrayList<>();
        for(int i = 0; i < newMagazines.length;i++)
            magazine.add(newMagazines[i]);
        
        Collections.sort(magazine);
        
        for(int j = 0; j < newMagazines.length;j++){
            //Magazine tempMagazine = new Magazine();
            magazine.get(j).print();
            System.out.println();
        }

            
        
        
        
    }

   
   
    
}
