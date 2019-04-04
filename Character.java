
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character
{
    protected String name;
    protected String gender;
    protected int hp = 100;
    public Character(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getHP(){
        return hp;
    }
}
