/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

/**
 *
 * @author keyew7019
 */
public class Location {

    private String image;
    private String North;
    private String South;
    private String East;
    private String West;

    private String direction;
    
    private String nextDirection;
    private String nextLocation;
    
    private boolean isBlocked;
    public int position = 0;

    // constructor using the name
    public Location(String image) {
        this.image = image;
    }
    

    public void setNorth(String north) {
        this.North = north;
    }

    public void setEast(String east) {
        this.East = east;
    }

    public void setSouth(String south) {
        this.South = south;
    }

    public void setWest(String west) {
        this.West = west;
    }

    public String getNorth() {
        return North;
    }

    public String getEast() {
        return East;
    }

    public String getSouth() {
        return South;
    }

    public String getWest() {
        return West;
    }

    //return the next direction
    public String nextDirection() {
        return nextDirection;
    }

    //return the next direction
    public String nextLocation() {
        return nextLocation;
    }
    
     // check if pathway is blocked
    public boolean isBlocked() {
        if (isBlocked = true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String format = this.image + "\n";
        
        format += "North: " + this.North + "\n";
        format += "East: " + this.East + "\n";
        format += "South: " + this.South + "\n";
        format += "West: " + this.West + "\n";

        return format;
    }
}
