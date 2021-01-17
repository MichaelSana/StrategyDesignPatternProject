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
            return "block a kick";
        }
        else if(random == 1 ){
            return "block a punt";
        }
        else if(random == 2 ){
            return  "block a pass";
        }
        else if(random == 3 ){
            return "block a catch";
        }
        else
            return null;
    }
    
}
