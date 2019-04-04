
/**
 * Write a description of class Hunter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hunter extends Player
{
    protected boolean cloak;
    public Hunter(String name, String gender){
        super(name, gender);
        archetype = "Hunter";
    }
}
