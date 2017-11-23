/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

/**
 *
 * @author keyew7019
 */
public class Direction {

    private String Direction;

    public Direction(String D) {
        if (Direction == D) {
            this.Direction = D;
        }
    }

    @Override
    public String toString() {
        String format = "Direction: " + this.Direction + "\n";

        return format;
    }
}
