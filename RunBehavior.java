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
            return "runs a drive (up the gut)";
        }
        else if(random ==1){
            return "runs a draw";
        }
        else if(random == 2){
            return "runs a pitch";
        }
        else if(random == 3){
            return "runs a reverse";
        }
        else{
            return "Is not playing";
    }

    
    }
}
