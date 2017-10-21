/**
 * Occupant
 *
 * Abstract class that includes properties common to all maze occupants.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
 
 public abstract class Occupant {

  private Square sq;
  
  public Occupant() {
  }

  public Occupant(Square start) {
      sq = start;
  }
  
  public Square location(){ 
      return sq;  
  }
  
  public void moveTo(Square newLoc){
      this.sq = newLoc;
  }
 
  
}

