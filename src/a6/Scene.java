/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

/**
 *
 * @author keyew7019
 */
public class Scene {

    private String direction;
    private String nextL;
    private String nextD;
    private boolean isBlocked;

    // Get the direction
    public String Direction(String D) {
            this.direction = D;
            return direction;
    }

    // move to next location
    public void nextLocation() {
        if (isBlocked == false) {
            nextL = nextL + 1;
        }
    }

    // get the direction for the new location
    public String nextDirection() {
        if(nextL == nextL){
        return direction;
        }
        return "";
    }

    // check if pathway is blocked
    public boolean isBlocked() {
        if (isBlocked = true) {
            return true;
        } else {
            return false;
        }
    }

    
    public void image() {
        
    }

    @Override
    public String toString() {
        String format = "Direction: " + this.direction + "\n";

        return format;
    }
}
