/**
 * DrawableTreasure:
 *
 * Class that draws the treasure objects.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
float angle;
float jitter;
public class DrawableTreasure extends Treasure implements Drawable {


  public DrawableTreasure(Maze maze) {
    super(maze);
  }

  public DrawableTreasure(Maze maze, long seed) {
    super(maze, seed);
  }

  public DrawableTreasure(Maze maze, Square location) {
    super(maze, location);
  }

  public void draw() {
    // nose

    if ( this.location().seen() && found() == false) {

      fill(255,255,0);
      triangle( this.location().x()+23, this.location().y()+25, this.location().x()+17, this.location().y()+35, this.location().x()+27, this.location().y()+35);
      triangle( this.location().x()+27, this.location().y()+15, this.location().x()+22, this.location().y()+25, this.location().x()+32, this.location().y()+25);
      triangle( this.location().x()+32, this.location().y()+25, this.location().x()+27, this.location().y()+35, this.location().x()+37, this.location().y()+35);

    }

    if ( found() == true) {

      
       fill(0,255,255);
       
  pushMatrix();
  
      
      triangle( this.location().x()+23, this.location().y()+25, this.location().x()+17, this.location().y()+35, this.location().x()+27, this.location().y()+35);
      triangle( this.location().x()+27, this.location().y()+15, this.location().x()+22, this.location().y()+25, this.location().x()+32, this.location().y()+25);
      triangle( this.location().x()+32, this.location().y()+25, this.location().x()+27, this.location().y()+35, this.location().x()+37, this.location().y()+35);
     
    popMatrix();  
    
    
    }
  }
  
}

