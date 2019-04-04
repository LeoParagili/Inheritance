
/**
 * Abstract class Player - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Player extends Character
{
   protected String archetype;
   public Player(String name, String gender){
       super(name, gender);
   }
   public void playerStart(){
       System.out.println("You are a " + archetype);
   }
}
