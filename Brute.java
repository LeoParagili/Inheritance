
/**
 * Write a description of class Brute here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Brute extends Player
{
    protected boolean finalPush;
    Shield shield = new Shield();
    public Brute(String name, String gender){
        super(name, gender);
        archetype = "Brute";
        finalPush = false;
    }
    public boolean finalPush(){
        if (shield.strength == 0){
            finalPush = true;
            shield.baseDamage *= 2;
        }
        return finalPush;
    }
}
