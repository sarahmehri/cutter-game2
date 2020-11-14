/*Sarah Mehri
 *4/24/2020
 *Vulture.java
 *This program will extend from Bird.java
 */
 
import java.awt.*;
public class Vulture extends Bird
{
   //field
	private boolean hungry;

   //constractor
   public Vulture()
   {
      hungry = true;
   }

   //eat method overriding, vuluter is initialy hungry until eat once
   //or fight, it gets hungery
	@Override
	public boolean eat() 
   {
      if(hungry)//if hungry is true
       {
		   hungry = false;
			return true;
		 }

		 return false;
	}

   //fight method overriding
	@Override
	public Attack fight(String opponent) 
   {
		hungry = true;
		return super.fight(opponent);
	}
   //color method overriding
	@Override
	public Color getColor()
   {
		return Color.BLACK;//vuluter color
	}
}