
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Weapon implements WeaponInterface
{
    protected boolean javelin;
    public Staff(){
        super("Staff", 12, 2, "Flourish");
        javelin = true;
    }
    public boolean parry(){
        if (javelin == true){
            System.out.println("As the enemy attacks, you parry with your staff, dealing " + baseDamage*1.5 + " damage!");
            return true;
        }
        System.out.println("You have grown weak over the battle, and are no longer able to defend from oncoming attack.");
        return false;
    }
    public int attack(){
        if (javelin == true){
            System.out.println("A surge of electricity flows through your staff and strikes your opponent, dealing " + baseDamage + " damage!");
            return baseDamage;
        }
        System.out.println("Your loss in mana has caused your attacks to do less damage, so your attack deals " + baseDamage/2 + " damage!");
        return baseDamage/2;
    }
}
