/**
 * DrawableSquare:
 *
 * Class that draws the squares.
 * 
 * @author (Keith Abdulla) 
 * @version (5/13/12)
 */
 
 public class DrawableSquare extends Square implements Drawable{


    public DrawableSquare(boolean up, boolean right, boolean down,
        boolean left, int row, int col){
        
            super(up, right, down, left, row, col);
    }
    
    public void draw(){
      
        
        if( this.inView() == true && this.seen() == true){
           fill(255,255,255);
           noStroke();
           rect(this.x(), this.y(), 50, 50); 
           
           for(int i = 0; i < 4; i++){
             if( wall(i) == true){
                   if(i == 0){
                     fill(0);
                     rect( this.x(), this.y(), 50,5, 180*PI);
                   }
                   
                   if(i == 1){
                     fill(0);
                     rect( this.x()+45, this.y(), 5,50, 180*PI);
             
                   }
                   
                   if(i == 2){
                     fill(0);
                     rect( this.x(), this.y()+50, 50,5, 180*PI);
                   }
                   
                   if(i == 3){
                     fill(0);
                     rect( this.x(), this.y(), 5,50, 180*PI);
                   }      
             } 
          }
       }
        
        if( this.seen() == true && this.inView() == false ){
          fill(10,200,40,191);
          rect(this.x(), this.y(), 50, 50); 
          
            for(int i = 0; i < 4; i++){
                     
             if( wall(i) == true){
                   if(i == 0){
                     fill(0);
                     rect( this.x(), this.y(), 50,5, 180*PI);
                   }
                   
                   if(i == 1){
                     fill(0);
                     rect( this.x()+45, this.y(), 5,50, 180*PI);
                   }
                   
                   if(i == 2){
                     fill(0);
                     rect( this.x(), this.y()+50, 50,5, 180*PI);
                   }
                   
                   if(i == 3){
                     fill(0);
                     rect( this.x(), this.y(), 5,50, 180*PI);
                   }      
             } 
          } 
        }

    }//draw() closer

}//class closer
