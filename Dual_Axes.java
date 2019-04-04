
/**
 * Write a description of class Dual_Axes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dual_Axes extends Weapon implements WeaponInterface
{
    public int chainSwings;
    public int parryDMG;
    public Dual_Axes(){
        super("Dual Axes", 20, 3, "Cyclone");
        chainSwings = 0;
        parryDMG = 5;
    }
    public boolean parry(){
        if (parryDMG == 5){
            System.out.println("As the enemy attacks, you cross your axes in front of yourself to block it, and then swing an axe at them, dealing " + parryDMG + " damage!");
        }
        System.out.println("With you heightened senses, you predict your enemy's attack, so you use your ability, " + ability + ", dealing " + parryDMG + " damage!");
        return true;
    }
    public int attack(){
        System.out.println("You swing your axes around in a frantic fashion, dealing " + baseDamage + " damage!");
        chainSwings++;
        return baseDamage;
    }
}
