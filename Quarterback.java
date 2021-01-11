import java.util.Random;
public class Quarterback extends Player{

    public Quarterback(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
        Random rand = new Random();
        int random = rand.nextInt(1);    
        if (random == 0){
            offenceBehavior = new RunBehavior();
        }
        else if(random == 1){
            offenceBehavior = new PassBehavior();
        }
    }
    public void setDefenceBehavior(){

    }
    
}
