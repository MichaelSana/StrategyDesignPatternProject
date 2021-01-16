/**
 * The main Offencive Player 
 */
import java.util.Random;
public class QuarterBack extends Player{

    public QuarterBack(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
        Random rand = new Random();
        int random = rand.nextInt(2);
        if (random == 0){
            offenceBehavior = new RunBehavior(); 
        }
        else
            offenceBehavior = new PassBehavior();
       
    }
    public void setDefenceBehavior(){
        //Blank because quarterback does not have a defenceBehavior

    }
    public String play() {
        return offenceBehavior.play();
    }
    
}
