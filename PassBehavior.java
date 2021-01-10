import java.util.Random;
public class PassBehavior implements OffenceBehavior{

    @Override
    public String play() {
        Random rand = new Random();
        int random = rand.nextInt(4);  
        if(random == 0){
            String ret = "throws a slant route";
            return ret;
        }
        else if (random == 1){
            String ret = "throws a out route";
            return ret;
        }
        else if (random ==2){
            String ret = "throws a seem route";
            return ret;
        } 
        else if (random == 3){
            String ret = "throws a screen pass";
            return ret;
        }
        else if (random == 4){
            String ret = "throws a hail mary";
            return ret;
        } 
        else
            return null;
    }
    
}
