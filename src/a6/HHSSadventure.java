/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author keyew7019
 */
public class HHSSadventure {

    Scanner in = null;
    public Scene[] scene;
    public int position = 0;

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

        Location[] loc = new Location[24];

        in = new Scanner(file);
        in.nextLine();
        in.nextLine();
        for (int i = 0; i < 5; i++) {
            Location l = new Location(in.next());
            l.getNorth();

        }
    }
    
    private BufferedImage loadImage(String name){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("pics.txt"));
        }catch(Exception e){
            e.printStackTrace();
        }
        return img;
    }

    public void move() {
        Scene stuff = new Scene();
        //find location
        int i = 0;
        while (i < 4) {
            String goDirection = in.next();
            if (goDirection != stuff.Direction()) {
                String ignore = in.nextLine();
                i++;
            } else {
                break;
            }
        }
        String imagetext = in.next();
        Boolean isBlocked = in.nextBoolean();
        if (isBlocked = false) {
            String newLocation = in.next();
            String newDirection = in.nextLine();
        }
    }

    public String nextDirection() {
        return scene[position].nextDirection();
    }
    
    public void turnLeft() {
        System.out.println("4");
    }
    
    public void turnRight() {
        System.out.println("5");
    }

    public static void main(String[] args) {
        //
    }
}
