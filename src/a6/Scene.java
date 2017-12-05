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
public class Scene {

    private String direction;
    private String nextDirection;
    private String nextLocation;
    private boolean isBlocked;

    // Get the direction
    public String Direction() {
        // return the direction
        return direction;
    }

    public String nextLocation(){
        return nextLocation;
    }
    
    // get the direction for the new location
    public String nextDirection() {
        return nextDirection;
    }

    // check if pathway is blocked
    public boolean isBlocked() {
        if (isBlocked = true) {
            return true;
        } else {
            return false;
        }
    }

    public String image(String name) {
        return name;
    }

    @Override
    public String toString() {
        String format = "Direction: " + this.direction + "\n";

        return format;
    }
}