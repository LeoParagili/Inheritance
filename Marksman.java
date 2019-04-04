
/**
 * Write a description of class Marksman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Marksman extends Player
{
    protected boolean grapple;
    public Marksman(String name, String gender){
        super(name, gender);
        archetype = "Marksman";
    }
}
