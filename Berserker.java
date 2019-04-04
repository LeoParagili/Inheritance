
/**
 * Write a description of class Berserker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Berserker extends Player
{
    protected boolean rabidBeast;    
    Dual_Axes axes = new Dual_Axes();
    public Berserker(String name, String gender){
        super(name, gender);
        archetype = "Berserker";
        rabidBeast = false;
    } 
    public boolean rabidBeast(){
        if (axes.chainSwings > 5){
            rabidBeast = true;
            axes.parryDMG *= 4;
        }
        return rabidBeast;
    }
}
