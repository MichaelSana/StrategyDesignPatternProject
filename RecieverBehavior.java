import java.util.Random;
public class RecieverBehavior implements OffenceBehavior {

    @Override
    public String play() {
        Random rand = new Random();
        int random = rand.nextInt(4);  
        if(random == 0){
            String ret = "runs a slant route";
            return ret;
        }
        else if (random == 1){
            String ret = "runs a out route";
            return ret;
        }
        else if (random ==2){
            String ret = "runs a seem route";
            return ret;
        } 
        else if (random == 3){
            String ret = "runs a screen pass";
            return ret;
        }
        else if (random == 4){
            String ret = "runs a hail mary";
            return ret;
        } 
        else
            return null;
    }
    
    
}