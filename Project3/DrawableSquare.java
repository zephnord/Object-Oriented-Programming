/**
 * Contains the DrawableSquare class
 * 
 * @author Zeph Nord
 * @author Joseph DeLuca
 * @version Project 3
 * @version CPE102-5
 * @version Fall 2016
 */
public class DrawableSquare extends Square implements Drawable {
    
    /**
     * Constructor to initialize data in the parent class Square
     * @param up
     * @param right
     * @param down
     * @param left
     * @param row
     * @param col
     */
    public DrawableSquare(boolean up, boolean right, 
            boolean down, boolean left, int row, int col) {
        super(up, right, down, left, row, col);
    }
    
    public void draw() {
        
    }
}
