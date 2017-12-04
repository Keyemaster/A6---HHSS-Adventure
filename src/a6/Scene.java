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
    private String nextL;
    private String nextDirection;
    private boolean isBlocked;

    // Get the direction
    public String Direction() {
        // return the direction
        return direction;
    }

    // move to next location
    public void nextLocation() {
        // if the path is not blocked, go forward one spot
        if (isBlocked == false) {
            nextL = nextL + 1;
        }
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