/**
 * Tells the player running the running play he will do
 * @author Michael Sana
 */
import java.util.Random;
public class RunBehavior implements OffenceBehavior {
/**
 * Picks the running play that the player will do
 * @return the play that the player will run
 */
    @Override
    public String play() {
        Random rand = new Random();
        int random = rand.nextInt(3);        
        if (random == 0){
            String ret = "runs a drive (up the gut)";
            return ret;
        }
        else if(random ==1){
            String ret = "runs a draw";
            return ret;
        }
        else if(random == 2){
            String ret = "runs a pitch";
            return ret;
        }
        else if(random == 3){
            String ret = "runs a reverse";
            return ret;
        }
        else
            return null;
    }
    
}
