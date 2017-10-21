/**
 * Square:
 *
 * Class that creates a square in the given Maze.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
 
 public class Square {

  public static final int SQUARE_SIZE = 50;
  public static final int UP = 0;
  public static final int RIGHT = 1;
  public static final int DOWN = 2;
  public static final int LEFT = 3;

  private boolean[] walls = new boolean[4];
  private boolean seen = false;
  private boolean in_View = false;

  private int row = 0, col = 0;

  private Treasure tr = null;

  public Square(boolean up, boolean right, boolean down, boolean left, 
  int row, int col) {

    walls[0] = up;
    walls[1] = right;
    walls[2] = down;
    walls[3] = left;
    this.row = row;
    this.col = col;
  }

  public boolean wall(int direction) {
    return walls[direction];
  }

  public int row() {
    return row;
  }

  public int col() {
    return col;
  }

  public boolean seen() {
    return seen;
  }

  public boolean inView() {
    return in_View;
  }
  
  public Treasure treasure(){
    return tr;
  }

  public void setTreasure(Treasure t){
    this.tr = t;
  }


  public int x() {
      return (col * SQUARE_SIZE);
  }
  
  public int y() { 
      return (row * SQUARE_SIZE); 
  }
  
  public void setInView(boolean inView){
    
    if(inView == true){
        this.seen = true;
    }
    
    in_View = inView;
      
  }
  
  public void enter(){
   
    if(this.tr != null){
        tr.setFound();
    }
    
  }
  
}
