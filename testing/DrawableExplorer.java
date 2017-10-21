/**
 * DrawableExplorer:
 *
 * Class that draws the explorer.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
 
 public class DrawableExplorer extends Explorer implements Drawable{

    public DrawableExplorer(Square location, Maze maze, String name){
    
        super(location, maze, name);
    }
    
    public void draw(){
        
       pushMatrix();
       fill(0);
       translate( this.location().x()+27  ,  this.location().y()+35 );
       
       fill(255,204,0);
       triangle(10,0, -15, -10, -20, -30); 
       
       fill(0,255,0);
       triangle(10,5, -4, -30, -20, -25); 
       fill(#FFCC99);
       
       ellipse(1, -10, 25, 25);  
       // eyes
       fill(255);
       ellipse(0, -10, 20, 18);
       fill(0,255,0);
       ellipse(0, -17, 20, 13);
       fill(0);
       ellipse(-2, -10, 2, 2);
       ellipse(2, -10, 2, 2);
       popMatrix();
    }

} 
