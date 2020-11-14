/*Sarah Mehri
 *4/24/2020
 *Ant.java
 *This program will extend from critter.java
 */

//import
import java.awt.*;

public class Ant extends Critter 
{
   //fields
   private boolean walkSouth;
   private int moveNumber;
   
   //constracts the fields
   public Ant(boolean walkSouth)
   {
      this.walkSouth = walkSouth;//the field's walkSouth equals the walkSouth parameter by keyboard this
      moveNumber = 1;
   }
	// fight method override, always Scratch
   @Override
	public Attack fight(String opponent) 
   { 
      return Attack.SCRATCH;
   }

	// get color method overriding, always red color
   @Override
	public Color getColor() 
   {
		return Color.RED;
	}

	// to String method how to display
   @Override
	public String toString() 
   {
		return "%";
	}
   
   //get move method overriding
   @Override
   public Direction getMove() {
   Direction result = Direction.CENTER;//placeholder the variable result
     
   if (moveNumber == 1 || moveNumber == 3)
    {
      result = Direction.SOUTH;
      if(!walkSouth)//if walk south is false
      {
         result = Direction.NORTH;
      }
    }
    else 
    {
      result = Direction.EAST;
    }
    
	 moveNumber++;//increment the move number
   
    // when moveNumber is 5, reset it to 1
    if (moveNumber > 4)
    {
      moveNumber = 1;
    }
   
    return result;
    // end getMove
   }
}