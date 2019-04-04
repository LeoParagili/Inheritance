
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon
{
    protected String type;
    protected int baseDamage;
    protected int range;
    protected int level = 1;
    protected String ability;
    public Weapon(String type, int baseDamage, int range, String ability){
        this.type = type;
        this.baseDamage = baseDamage;
        this.range = range;
        this.ability = ability;
    }
    public String getType(){
        return type;
    }
    public int getBaseDamage(){
        return baseDamage;
    }
    public int getRange(){
        return range;
    }
    public int getLevel(){
        return level;
    }
    public String getAbility(){
        return ability;
    }
}
