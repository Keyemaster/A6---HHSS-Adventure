/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author keyew7019
 */
public class HHSSadventure {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileReader file = null;
        try {
            URL url = HHSSadventure.class.getResource("pics.txt");
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        
        Scanner in = new Scanner(file);
        
        String Location = in.nextLine();
        String Direction = in.next();
        String variable = in.next();
        Boolean isBlocked = in.nextBoolean();
        String newLocation = in.next();
        String newDirection = in.nextLine();
        
    }
}
