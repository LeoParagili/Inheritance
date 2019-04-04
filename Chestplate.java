
/**
 * Write a description of class Chestplate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chestplate implements DefenseCommands
{
   protected int armor;
   protected int resistance;
   public Chestplate(){
       armor = 100;
       resistance = 2;
   }
   public boolean blocked(){
       return true;
    }
}
