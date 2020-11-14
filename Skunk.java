/*Sarah Mehri with help of professor Ken
 *4/24/2020
 *Skunk.java
 *This program will extend from critter.java
 */
import java.awt.*;

public class Skunk extends Critter 
{  
   //fields
   private int moveNumber;
   private boolean hasEaten;

   //constructor
   public Skunk() 
   {
      moveNumber = 1;
      hasEaten = false;
   }
   
   // simulator calls eat() whenever Skunk ends up
   // landing on a food item
   @Override
   public boolean eat() {
      hasEaten = true;     
		return true;         
	}
   
   //get move method it goes W, W, N and repeats, unless he eats food 
   @Override
   public Direction getMove() {
      Direction result = Direction.CENTER;
     
      if (moveNumber == 1 || moveNumber == 2) {
         result = Direction.WEST;
      }
      else {
         if (!hasEaten)//hasEaten == false 
         {
            result = Direction.NORTH;
         }
         else {
            result = Direction.SOUTH;
         }
      }
      
		moveNumber++;//increment move number
      
      // when moveNumber is 4, reset it to 1
      if (moveNumber > 3) {
         moveNumber = 1;
      }
      
      return result;
	} // end getMove

} // end Skunk