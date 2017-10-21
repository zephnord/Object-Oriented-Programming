/**
 * Contains the abstract class Occupant
 * 
 * @author Zeph Nord
 * @author Joseph DeLuca
 * @version Project 3
 * @version CPE102-5
 * @version Fall 2016
 */

public abstract class Occupant {
    private Square square;

    /**
     * Default constructor
     */
    public Occupant() {
    }

    /**
     * Overridden constructor for Occupant
     * 
     * @param start
     */
    public Occupant(Square start) {
        this.square = start;
    }

    /**
     * a query method for the location
     * 
     * @return
     */
    public Square location() {
        return square;
    }

    /**
     * a command to change the Occupants location
     * 
     * @param newLoc
     */
    public void moveTo(Square newLoc) {
        this.square = newLoc;
    }
}
