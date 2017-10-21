import java.util.*;
/**
 * Maze:
 *
 * Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
public class Maze
{
   // named constants
   public static final int ACTIVE = 0;
   public static final int EXPLORER_WIN = 1;
   public static final int MONSTER_WIN = 2;
    
    // instance variables
   private Square[][] maze;
   private ArrayList<RandomOccupant> randOccupants;
   private Explorer explorer;
   private int rows;
   private int cols;

   /**
    * Constructor for objects of class Maze
    */
   public Maze(Square[][] maze, int rows, int cols)
   {
      this.maze = maze;
      this.rows = rows;
      this.cols = cols;
		
      randOccupants = new ArrayList<RandomOccupant>();
		
   }
	
   // QUERIES
   public Square getSquare(int row, int col) { 
        
        return maze[row][col]; 
   }
   
   public int rows() {return rows;}
   public int cols() {return cols;}
   public String explorerName() {return explorer.name();}
   public Explorer getExplorer() {return explorer;}
    

   public RandomOccupant getRandomOccupant(int index) {
            return randOccupants.get(index);  
   }
   public int getNumRandOccupants() {
        return randOccupants.size();
   }
   
	
   public void addRandomOccupant(RandomOccupant ro) {
        randOccupants.add(ro);
   }
	
   public void setExplorer(Explorer e) {
        explorer = e;
   }
	
   public void explorerMove(int key)
   {
      explorer.move(key);
   }
	
   public void randMove()
   {
      for(int i = 0; i < randOccupants.size(); i++){
          (randOccupants.get(i)).move();
      }
   }
	
   /**
    * Returns the status of the game.
    *
    * If all treasures have been found, return EXPLORER_WIN.
    * If not, check each maze occupant, if it is a Monster and
    *   it is in the same location as the Explorer, return
    *   MONSTER_WIN.  Note that you can use == to check locations, do you know why?
    * Otherwise, return ACTIVE.
    */
   public int gameStatus()
   {
      int status = ACTIVE;
      
      
      for(int i = 0; i < randOccupants.size(); i++){
      
          if( (randOccupants.get(i)) instanceof Monster){
          
              if( ((Monster)randOccupants.get(i)).location() == explorer.location() ){
                    return MONSTER_WIN;
              }
          }
      
      
      }
      
      if( foundAllTreasures() == true){
          return EXPLORER_WIN;
      }
             
      return status;
   }
	
   private boolean foundAllTreasures()
   {
      boolean foundAll = true;
      int count = 0;
      int begin = 0;
        
      for(int i = 0; i < randOccupants.size(); i++){
            
            if(randOccupants.get(i) instanceof Treasure){
                begin++;
                if( ((Treasure)randOccupants.get(i)).found() == true ) {
                   count++;
                }
            }
      }
      
      
      if( count != begin){
            foundAll = false;
      }
              
      return foundAll;
   }
    
   public void lookAround(Square s){
      int row = s.row();
      int col = s.col();
      
        
      // Clear what was previously in view
      resetInView();
        
      // Set the current square so that we are viewing it (obviously)
      s.setInView(true);
      
      
      
      if( s.wall(s.UP) == false){
               (getSquare(row-1,col)).setInView(true);
               
                if( getSquare(row-1,col).wall(s.LEFT) == false){
            
                      (getSquare(row-1,col-1)).setInView(true);
                }
            
                if( getSquare(row-1,col).wall(s.RIGHT) == false){
                
                      (getSquare(row-1,col+1)).setInView(true);
                }
            
      }
      
      if( s.wall(s.RIGHT) == false){
            (getSquare(row,col+1)).setInView(true);
            
            if( getSquare(row,col+1).wall(s.UP) == false){
            
                (getSquare(row-1,col+1)).setInView(true);
            }
            
            if( getSquare(row,col+1).wall(s.DOWN) == false){
            
                (getSquare(row+1,col+1)).setInView(true);
            }
      }
      
      if( s.wall(s.DOWN) == false){
            (getSquare(row+1,col)).setInView(true);
            
            if( getSquare(row+1,col).wall(s.LEFT) == false){
            
                (getSquare(row+1,col-1)).setInView(true);
            }
            
            if( getSquare(row+1,col).wall(s.RIGHT) == false){
            
                (getSquare(row+1,col+1)).setInView(true);
            }
      }
      
      if( s.wall(s.LEFT) == false){
      
            (getSquare(row,col-1)).setInView(true);
      
            if( getSquare(row,col-1).wall(s.UP) == false){
            
                (getSquare(row-1,col-1)).setInView(true);
            }
            
            if( getSquare(row,col-1).wall(s.DOWN) == false){
            
                (getSquare(row+1,col-1)).setInView(true);
            }
      
      
      }

   }
    
   private void resetInView()
   {
      for (int i = 0; i<rows; i++) {
         for (int j = 0; j<cols; j++) {
            maze[i][j].setInView(false);
         }
      }
   }
}