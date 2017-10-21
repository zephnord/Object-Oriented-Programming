import java.awt.event.KeyEvent;
/**
 * Explorer:
 *
 * Class that contains all the logic to control the explorer.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
public class Explorer extends Occupant{
  
  
  private String name;
  private Maze m;
  
  public Explorer(Square location, Maze maze, String name){
    
     super(location);
     m = maze;
     this.name = name; 
     m.lookAround(location);
    
  }
  
  public String name(){
      return name;
  }
  
  public void move(int key){
      
      Square sq = super.location();
      
      
      if(KeyEvent.VK_UP == key || KeyEvent.VK_KP_UP == key){
            if(sq.wall(sq.UP) == false){
                moveTo(  m.getSquare(  sq.row()-1, sq.col()  )   ); 
            }
      }
      
      else if(KeyEvent.VK_RIGHT == key || KeyEvent.VK_KP_RIGHT == key){
            if(sq.wall(sq.RIGHT) == false){
                moveTo(m.getSquare(sq.row(), sq.col()+1)); 
            }     
      }
      
      else if(KeyEvent.VK_DOWN == key || KeyEvent.VK_KP_DOWN == key){
            if(sq.wall(sq.DOWN) == false){
                moveTo(m.getSquare(sq.row()+1, sq.col())); 
            }     
      }
      
      
      else if(KeyEvent.VK_LEFT == key || KeyEvent.VK_KP_LEFT == key){
            if(sq.wall(sq.LEFT) == false){
                moveTo(m.getSquare(sq.row(), sq.col()-1)); 
            }
      } 
      
      
  }
  
  public void moveTo(Square s){
    super.moveTo(s);
    s.enter();
    m.lookAround(s);  
  }
  
}
  