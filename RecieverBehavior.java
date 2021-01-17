/**
 * Tells the Receiver player what to do
 * @author Michael Sana
 */
import java.util.Random;
public class RecieverBehavior implements OffenceBehavior {
    /**
     * Randomly picks the play that the reciever will do
     * @return the play that he will run
     */
    @Override
    public String play() {
        Random rand = new Random();
        int random = rand.nextInt(4);  
        if(random == 0){
            return "runs a slant route";
        }
        else if (random == 1){
            return "runs a out route";
        }
        else if (random ==2){   
            return "runs a seem route";
        } 
        else if (random == 3){   
            return "runs a screen pass";
        }
        else if (random == 4){
            return "runs a hail mary";
        } 
        else
            return null;
    }
    
    
}
