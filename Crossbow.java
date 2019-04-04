
/**
 * Write a description of class Crossbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Crossbow extends Weapon
{
    protected int bolts;
    public Crossbow(){
        super("Crossbow", 15, 5, "Explosive Arrow");
    }
    public boolean parry(){
        return true;
    }
    public int attack(){
        return baseDamage;
    }
}
