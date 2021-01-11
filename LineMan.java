import java.util.Random;
public class LineMan extends Player{

    public LineMan(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
        offenceBehavior = new OBlockBehavior();  
}
public void setDefenceBehavior(){
    Random rand = new Random();
    int random = rand.nextInt(2);   
    if(random == 0){
        defenceBehavior = new BlockBehavior();
    }
    else if (random == 1){
        defenceBehavior = new SackBehavior();
    }
    else if (random ==2){
        defenceBehavior = new StripBehavior();
    }
}
    
}
