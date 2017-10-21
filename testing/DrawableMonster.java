/**
 * DrawableMonster:
 *
 * Class that draws the monster objects.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */

public class DrawableMonster extends Monster implements Drawable {

  public DrawableMonster(Maze maze) {
    super(maze);
  }

  public DrawableMonster(Maze maze, long seed) {
    super(maze, seed);
  }

  public DrawableMonster(Maze maze, Square location) {
    super(maze, location);
  }

  public void draw() {

    if ( location().inView() == true) {

      pushMatrix();
      //where is this super being called?
      translate(  this.location().x()+25, this.location().y()+25 );
      noStroke();

      // head
      fill(0);
      ellipse(0, -10, 25, 25);

      // eyes
      fill(255);
      ellipse(0, -10, 20, 18);
      fill(0);
      ellipse(0, -17, 20, 10);
      fill(0);
      ellipse(-2, -10, 2, 2);
      ellipse(2, -10, 2, 2);

      // muzzle / jowels
      fill(0);
      ellipse(0, -3, 22, 10);
      fill(0);
      rect(-7, 0, 14, 13);
      ellipse(0, 10, 20, 10);
      fill(0);
      ellipse(-10, 5, 7, 15);
      ellipse(10, 5, 7, 15);

      // nose
      fill(0);
      ellipse(0, -6, 8, 5);

      // teeth
      fill(255);
      triangle(-7, 0, -5, -5, -3, 0);
      triangle(7, 0, 5, -5, 3, 0);

      // ears
      fill(255);
      ellipse(-10, -20, 6, 3);
      ellipse(10, -20, 6, 3);

      popMatrix();
    }
  }
} 

