/**
 * DrawableMaze:
 *
 * Class that draws the maze.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
 
 public class DrawableMaze extends Maze implements Drawable{

    public DrawableMaze(DrawableSquare[][] maze, int rows, int cols){
        super(maze, rows, cols);
    }
    
    public void draw(){
        fill(#3399FF);

        rect(0,0,500,500);

        
        for(int i = 0; i < super.rows(); i++){
            for(int j = 0; j < super.cols(); j++){
              
              ((DrawableSquare)getSquare(i,j)).draw();
              
            }
        }
        
        for(int i = 0; i < getNumRandOccupants(); i++){
          
            if(getRandomOccupant(i) instanceof Treasure){                
                    ((DrawableTreasure)getRandomOccupant(i)).draw();   
            }
            
            
            if(getRandomOccupant(i) instanceof Monster){
                ((DrawableMonster)getRandomOccupant(i)).draw();
            }
            
        }
        
        ((DrawableExplorer)getExplorer()).draw();
       
        
    }//draw closer

}
