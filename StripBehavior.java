/**
 * Tells the player how he will strip the ball
 * @author Michael Sana
 */
public class StripBehavior implements DefenceBehavior {
/**
 * Tells the player who he will strip the ball from
 * @return the player strip the ball from the runner
 */
    @Override
    public String play() {
        String ret = "strip a ball from runners hand";
        return ret;
    }
    
}
