
/**
 * Write a description of class Broadsword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Broadsword extends Weapon implements WeaponInterface
{
    public int honorGuage;
    public Broadsword(){
        super("Broadsword", 15, 2, "Valiance");
        honorGuage = 0;
    }
    public int attack(){
        return baseDamage;
    }
    public boolean parry(){
        return true;
    }
}
