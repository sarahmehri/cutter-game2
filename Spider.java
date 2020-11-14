/*Sarah Mehri
 *4/24/2020
 *Spider.java
 *This program will extend from critter.java
 */

import java.awt.*;

// The following Critter class named Spider is
// an attempt to make a critter that goes
// E, E, E, E, E and W, W, W, W, W repeats,
// they always eat, they fight SCRATCH but if they face Ant, they Roar
//when they go East, they show up E letter, and went West, they show W letter
// and repeats.

public class Spider extends Critter 
{
   private int moveNumber;
   private boolean hasEaten;
   private Direction result = Direction.CENTER;
   
   //constractors 
   public Spider() 
   {
      moveNumber = 1;
      hasEaten = false;
   }
   
   
   //eat method, always spider eat
   @Override
   public boolean eat() {
      hasEaten = false;     
		return true;         
	}
   
   //move method, 10 times, 5 East and 5 West
   @Override
   public Direction getMove() 
   {
      //5 times to East    
      if (moveNumber == 1 || moveNumber == 2 || moveNumber == 3 ||moveNumber == 4 || moveNumber == 5 ) 
      {
         result = Direction.EAST;
      }
      //5 times to West
      else if(moveNumber == 6 || moveNumber == 7 || moveNumber == 8 ||moveNumber == 9 || moveNumber == 10)
      {
         result = Direction.WEST;
      
      }
      
		moveNumber++;//move number increment
      
      // when moveNumber is 11, reset it to 1
      if (moveNumber > 10) {
         moveNumber = 1;
      }
      
      return result;
	} // end getMove

   //String method overriding, when goes west, show it by W letter and 
   //when goes East, show it by E letter.
   @Override
	public String toString() 
   {
      String symbol = "";//place holder
      if(result.equals(Direction.WEST))
      {
		   symbol ="W";//when go west
      }
      else if(result.equals(Direction.EAST))

      {
         symbol = "E";//when go east
      }
      return symbol;
   }
   // get color method overriding
   @Override
	public Color getColor() 
   {
      //Spider goes west show with W
      if(result.equals(Direction.WEST))
      {
		   return Color.RED;
      }
            
      return Color.BLUE;//goes East show it by E
   }
   
	// attack method overriding
   @Override 
	public Attack fight(String opponent)
   {  
      //if the opponent is Ant
      if (opponent == "%" )
      {
         return Attack.ROAR;//return roar
      }
      else
      {
         return Attack.SCRATCH;
      }
   }
}
 