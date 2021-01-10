import java.util.Random;

public class BlockBehavior implements DefenceBehavior {

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
