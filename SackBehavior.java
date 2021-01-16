/**
 * Tells the player who he will sack
 * @author Michael Sana
 */
public class SackBehavior implements DefenceBehavior {
/**
 * Tells the player the play he will do
 * @return tells the player to sack the quarterback
 */
    @Override
    public String play() {
        String ret = "sack the quarterback";
        return ret;
    }
    
}
