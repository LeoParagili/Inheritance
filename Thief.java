
/**
 * Write a description of class Thief here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thief extends Player
{
    protected int stamina;
    public Thief(String name, String gender){
        super(name, gender);
        archetype = "Thief";
        ability = "Pickpocket";
    }
}
