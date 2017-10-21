import java.util.*;
import java.awt.event.KeyEvent;
/**
 * RandomOccupant:
 *
 * Class that randomly places it's occupants into squares.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */

public abstract class RandomOccupant extends Occupant{


    private Random r = new Random();
    private Maze m;


    public RandomOccupant(Maze maze){
    
        m = maze;
        
        int row = r.nextInt(m.rows());        
        int col = r.nextInt(m.cols());
        
        moveTo(m.getSquare(row,col));                        
    }
    
    public RandomOccupant(Maze maze, long seed){
        m = maze;        
        r = new Random(seed);
        
        int row = r.nextInt(m.rows());        
        
        int col = r.nextInt(m.cols());
        
        moveTo(m.getSquare(row,col)); 
        
 
    
    }
    
    public RandomOccupant(Maze maze, Square location){
        m = maze;
        moveTo(location);
        
    }
    
    public void move(){
        
        Square sq = this.location();
        boolean turn = true;
        
        while(turn){
        
        int a_ran_wall = r.nextInt(4);
        
            if(a_ran_wall == sq.UP){
                  if(sq.wall(sq.UP) == false){
                      moveTo(m.getSquare(sq.row()-1, sq.col())); 
                      turn = false;
                  }
            }
            
            else if(a_ran_wall == sq.RIGHT){
                  if(sq.wall(sq.RIGHT) == false){
                      moveTo(m.getSquare(sq.row(), sq.col()+1));
                      turn = false;     
                  }     
            }
      
            else if(a_ran_wall == sq.DOWN){
                  if(sq.wall(sq.DOWN) == false){
                      moveTo(m.getSquare(sq.row()+1, sq.col()));
                      turn = false; 
                  }     
            }
            
            else if(a_ran_wall == sq.LEFT){
                  if(sq.wall(sq.LEFT) == false){
                      moveTo(m.getSquare(sq.row(), sq.col()-1));
                      turn = false; 
                  }
            } 
                  
        }
        
    
    }

}