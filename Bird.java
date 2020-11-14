/*Sarah Mehri
 *4/24/2020
 *Bird.java
 *This program will extend from critter.java
 */


import java.awt.*;

public class Bird extends Critter {
   //fields
   private int moveNumber;
   private Direction result;

   //constracts the fields
   public Bird()
   {
      moveNumber = 1;
      result = Direction.CENTER; 
   }
   //eat method overriding 
   @Override
   public boolean eat() 
   {
		return false; //never eats     
  	}

	// attack method overriding, if the opponent is ant, it roar
   //but always pounce
	public Attack fight(String opponent)
   {  
      //if the opponent is Ant
      if (opponent == "%")
      {
         return Attack.ROAR;//return roar
      }
      else
      {
         return Attack.POUNCE;
      }
   }
	// color method , always blue
   @Override
	public Color getColor() 
   {
		return Color.BLUE;
	}

   //get move method overriding
	@Override
   public Direction getMove() 
   {  //the move number goes up to 12, 
      if (moveNumber == 1 || moveNumber == 2 ||moveNumber == 3 ) {
         //move number 1,2 & 3 get the North direction
         result = Direction.NORTH;
      }
      else if (moveNumber == 4 || moveNumber == 5 ||moveNumber == 6 ) {
         //move number 4,5 & 6 get the East direction
         result = Direction.EAST;
      }
      else if(moveNumber == 7 || moveNumber == 8 ||moveNumber == 9 ) {
         //move number 7,8 & 9 get the South direction
         result = Direction.SOUTH;
      }
      else if (moveNumber == 10 || moveNumber == 11 ||moveNumber == 12) {
         //move number 10,11 & 12 get the West direction
         result = Direction.WEST;
      }       
		moveNumber++;//increment the move number
      
      // when moveNumber is 13, reset it to 1
      if (moveNumber > 12)
      {
         moveNumber = 1;
      }
      
      return result;
	} // end getMove

// to string method how to display
   @Override
	public String toString() 
   {
      String symbol = "";
      if(result.equals(Direction.NORTH))
      {
		   symbol ="^";//when go North
      }
      else if(result.equals(Direction.EAST))

      {
         symbol = ">";//when go east
      }
      else if(result.equals(Direction.SOUTH))
      {
         symbol =  "V";//when go South
      }
      else if(result.equals(Direction.WEST))
      {
         symbol = "<";//when go West
      }
      return symbol;    
	}
}//end the Bird class

   

