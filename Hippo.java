/*Sarah Mehri
 *4/24/2020
 *Hippo.java
 *This program will extend from critter.java
 */

//imports
import java.awt.Color;
import java.util.Random;
 
public class Hippo extends Critter{
   //fields
   private int hunger;
   private int numEatenAlready;
   private final Direction[] direction = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
   private int numMoved;
   private Direction currentDirection;
 
   //constructs the instantiated variables(fields)
   public Hippo (int hunger)
   {
      this.hunger = hunger;//the field's hunger = this parameter hunger
      numEatenAlready = 0;
      numMoved = 0;
      currentDirection = Direction.CENTER;
   }
 
   //get color method
   @Override
   public Color getColor()
   {
      //if number of eaten is less number of to eat or still hungry
      if(numEatenAlready < hunger)
      {
         return Color.gray;
      }
      else
      {
         return Color.white;//not hungry 
      }
   }
  
   //eat method 
   @Override
   public boolean eat()
   {
      numEatenAlready++;//number eaten Already + 1
      if(numEatenAlready < hunger)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   //fight method
   @Override
   public Attack fight(String opponent)
   {
      if(numEatenAlready < hunger)//if number of eaten is less number of to eat or still hungry

      {
         return Attack.SCRATCH;
      }
      else
      {
         return Attack.POUNCE;
      }
   }
   //get move method
   @Override
   public Direction getMove()
   {  
      Random r = new Random();//instantiating random object
      int number = r.nextInt(4);
      if(numMoved == 5 || numMoved == 0)
      {
         currentDirection = direction[number];//randomly choose from the array direction
         numMoved = 0;
      }
      numMoved++;
      return currentDirection;
   }
   
   //String method
   @Override
   public String toString()
   {  
      //return the number of eaten to string
      return hunger+"";
   }
}