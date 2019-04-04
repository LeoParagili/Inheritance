
/**
 * Write a description of class Long_Bow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Long_Bow extends Weapon
{
    protected int power;
    public Long_Bow(){
        super("Long Bow", 10, 5, "Focus");
    }
    public boolean parry(){
        return true;
    }
    public int attack(){
        return baseDamage;
    }
}
