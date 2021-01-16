import java.util.Random;
/**
 * Gives the Defencive Block and what they will block to the player
 * @author Michael Sana
 */
public class BlockBehavior implements DefenceBehavior {
    /**
     * Randomly picks what the player will attempt to block
     * @return What the player will try to block
     */
    @Override
    public String play() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        if(random == 0 ){
            String output = "block a kick";
            return output;
        }
        else if(random == 1 ){
            String output = "block a punt";
            return output;
        }
        else if(random == 2 ){
            String output = "block a pass";
            return output;
        }
        else if(random == 3 ){
            String output = "block a catch";
            return output;
        }
        else
            return null;
    }
    
}
