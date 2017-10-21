/**
 * Contains the DrawableMonster class
 * 
 * @author Zeph Nord
 * @author Joseph DeLuca
 * @version Project 3
 * @version CPE102-5
 * @version Fall 2016
 */
 
public class DrawableMonster extends Monster implements Drawable {

    /**
     * Invokes the parent's constructor
     * @param maze
     */
    public DrawableMonster(Maze maze) {
        super(maze);
    }

    /**
     * Invokes the parent's constructor
     * @param maze
     * @param seed
     */
    public DrawableMonster(Maze maze, long seed) {
        super(maze, seed);
    }

    /**
     * Invokes the parent's constructor
     * @param maze
     * @param location
     */
    public DrawableMonster(Maze maze, Square location) {
        super(maze, location);
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub

    }

}
