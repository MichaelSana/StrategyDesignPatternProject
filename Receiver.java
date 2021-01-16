
/**
 * The main call for the Receiving player
 * @author Michael Sana
 */
public class Receiver extends Player{
    /**
     * Calls the name of the Receiver
     * @return The Recieving Players name
     * @param name
     */
    public Receiver(String name) {
        super(name);
    }
    
    public void setOffenceBehavior(){
      offenceBehavior = new RecieverBehavior();
    }
    public void setDefenceBehavior(){

    }
    /**
     * Tells the Player which play to do
     * @return The play that will be done
     */
    @Override
    public String play() {
        // TODO Auto-generated method stub
        return null;
    }

}
