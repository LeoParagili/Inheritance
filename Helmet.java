
/**
 * Write a description of class Helmet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Helmet implements DefenseCommands
{
    protected int armor;
    public Helmet(){
        armor = 50;
    }
    public boolean blocked(){
        return true;
    }
}
