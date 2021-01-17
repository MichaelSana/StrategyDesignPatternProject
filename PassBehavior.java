/**
 * Gives the different pass options for a passing Offensive player
 * @author Michael Sana
 */
import java.util.Random;
public class PassBehavior implements OffenceBehavior{
/**
 * Randomly picks a type of pass for the player to throw
 * @return The type of pass that will be thrown
 */
    @Override
    public String play() {
        Random rand = new Random();
        int random = rand.nextInt(4);  
        if(random == 0){
            return "throws a slant route";
        }
        else if (random == 1){
            return "throws a out route";
        }
        else if (random ==2){
            return "throws a seem route";
        } 
        else if (random == 3){
            return "throws a screen pass";
        }
        else if (random == 4){
            return "throws a hail mary";
        } 
        else
            return "oops it shouldnt be here";
    }
    
}
