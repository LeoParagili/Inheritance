
/**
 * Write a description of class Swordsman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Swordsman extends Player
{
    protected boolean honor;
    Broadsword sword = new Broadsword();
    public Swordsman(String name, String gender){
        super(name, gender);
        archetype = "Swordsman";
        honor = false;
    }
}
