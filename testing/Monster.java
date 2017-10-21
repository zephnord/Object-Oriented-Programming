/**
 * Monster:
 *
 * Class that resembles a Monster.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
 
 public class Monster extends RandomOccupant{

    public Monster(Maze maze){
        super(maze);
    }
    
    public Monster(Maze maze, long seed){
        super(maze, seed);
    }

    public Monster(Maze maze, Square location){
        super(maze, location);
    }
}