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

    Scanner in = null;
    
    /**
     * @param args the command line arguments
     */
    public HHSSadventure() {
        

        FileReader file = null;
        try {
            URL url = HHSSadventure.class.getResource("pics.txt");
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        in = new Scanner(file);


    }

    public void move() {
        String Location = in.nextLine();
        String Direction = in.next();
        String imagetext = in.next();
        Boolean isBlocked = in.nextBoolean();
        if (isBlocked = false) {
            String newLocation = in.next();
            String newDirection = in.nextLine();
        }
    }
}