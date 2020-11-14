/*Sarah Mehri
 *4/24/2020
 *Butterfly.java
 *This program will extend from critter.java
 */

import java.awt.*;
public class Butterfly extends Critter 
{  //fields
   private int moveNumber;
   
   //constructor
   public Butterfly() 
   {
      moveNumber = 1; 
   }
   
   //never eats (this is the default behavior)
   @Override
   public boolean eat() {
           
		return false;         
	}
   public Color getColor() {
		return Color.YELLOW;
	}
   
   // always forfeits 
   @Override
   public Attack fight(String opponent) 
   {
		return Attack.FORFEIT;
	}
   
   //moves N, W, N, E, then repeats
   @Override
   public Direction getMove() {
      Direction result = Direction.CENTER;
     
      if (moveNumber == 1 || moveNumber == 3) 
      {
         result = Direction.NORTH;
      }
         if(moveNumber == 2)
         {
            result = Direction.WEST;
         }
         if(moveNumber == 4)
         {
            result = Direction.EAST;
         }
      
            
		moveNumber++;//increment the move number
      
      //if move number is greater than 4 
      if (moveNumber > 4) {
         moveNumber = 1;
      }
      
      return result;
	}
   
   //alternates between "x" and "-" on each move
   @Override
   public String toString() {
   String action = "";
   if(moveNumber == 1)
   {
      action = "x";
   }
   if(moveNumber == 2)
   {
      action = "-";
   }
   if(moveNumber == 3)
   {
      action = "x";
   }
   if(moveNumber == 4)
   {
      action = "-";
   }

		return action;
	}
 
}