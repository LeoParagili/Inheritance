
/**
 * Write a description of class Mage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mage extends Player
{
    protected int mana;
    Staff staff = new Staff();
    public Mage(String name, String gender){
        super(name, gender);
        archetype = "Mage";
        int mana = 100;
    }
    public int manaDrain(){
        if (mana == 0){
            staff.javelin = false;
        }
        if (staff.javelin == true && mana > 0){
            mana =- 10;
        }
        return mana;
    }
}
