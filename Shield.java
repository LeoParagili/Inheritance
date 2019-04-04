
/**
 * Write a description of class Shield here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shield extends Weapon implements DefenseCommands
{
   public int strength;
   public Shield(){
       super("Shield", 8, 1, "Bash Dash");
       strength = 5;
   }
   public boolean blocked(){
       if (strength > 0){
           strength--;
           System.out.println("Your shield blocked the attack.");
           return true;
       }
       System.out.println("You failed to block the attack with your shield.");
       return false;
   }
   public int attack(){
       if (baseDamage == 8){
           System.out.println("You take your shield and bash your opponent with it, dealing " + baseDamage + " damage!");
       }
       System.out.println("You use your ability, " + ability + ", dealing " + baseDamage + " damage!");
       return baseDamage;
   }
   
}
