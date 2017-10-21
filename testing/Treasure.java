/**
 * Treasure:
 *
 * Class that contains logic for Treasure properties.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */

public class Treasure extends RandomOccupant{

    private boolean treasure_found;
    
    public Treasure(Maze maze){
        super(maze);
        treasure_found = false;
        super.location().setTreasure(this); 
          
    }
    
    public Treasure(Maze maze, long seed){
        super(maze, seed);
        treasure_found = false;
        super.location().setTreasure(this); 
         
    }
    
    public Treasure(Maze maze, Square location){
        super(maze, location);
        treasure_found = false;
        location.setTreasure(this);
    }
    
    public boolean found(){
        return treasure_found;
    }
    
    public void setFound(){
        this.treasure_found = true;
    }
    
    public void move(){
       
    }
    
    

}