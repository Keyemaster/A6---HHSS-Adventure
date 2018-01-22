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
        //set the direction
        for (int i = 0; i < 5; i++) {
            Location l = new Location(in.next());
            in.next();
            l.setNorth(in.next());
            l.setEast(in.next());
            l.setSouth(in.next());
            l.setWest(in.next());

            loc[i] = l;
        }
        for (int i = 0; i < loc.length; i++) {
            System.out.println(loc[i]);
        }
    }

    //load in the image
    private BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("pics.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    //move forward
    public void move() {
        //find location
        
    }

    //turn left
    public void turnLeft() {
        System.out.println("4");
    }

    //turn right
    public void turnRight() {
        dir = nextDirection();
    }

    public static void main(String[] args) {
        //
        HHSSadventure adv = new HHSSadventure();
    }
}
