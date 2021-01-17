/**
 * Tells the player which picks the Offensive Block as its Offensive move commands
 * @author Michael Sana
 */
public class OBlockBehavior implements OffenceBehavior {
/**
 * Tells the player what the Offensive Block has him do
 * @return Outputs the string saying the player blocks defenders
 */
    @Override
    public String play() {
        return "block defenders";
    }
    
}
