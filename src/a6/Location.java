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

    public String getImage() {
        return image;
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
