/**
 * Contains the DrawableTreasure class
 * 
 * @author Zeph Nord
 * @author Joseph DeLuca
 * @version Project 3
 * @version CPE102-5
 * @version Fall 2016
 */
public class DrawableTreasure extends Treasure implements Drawable {

    /**
     * Calls the parents constructor
     * @param maze
     */
    public DrawableTreasure(Maze maze) {
        super(maze);
    }

    /**
     * Calls the parent's constructor
     * @param maze
     * @param seed
     */
    public DrawableTreasure(Maze maze, long seed) {
        super(maze, seed);
    }

    /**
     * Calls the parent's constructor
     * @param maze
     * @param location
     */
    public DrawableTreasure(Maze maze, Square location) {
        super(maze, location);
    }

    @Override
    public void draw() {

    }

}
