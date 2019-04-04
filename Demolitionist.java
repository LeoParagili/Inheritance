
/**
 * Write a description of class Demolitionist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demolitionist extends Player
{
    protected boolean immunity;
    protected int bombs;
    public Demolitionist(String name, String gender){
        super(name, gender);
        archetype = "Demolitionist";
        ability = "Explosive Immunity";
    }
}
