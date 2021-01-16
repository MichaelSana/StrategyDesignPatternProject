import java.util.Random;
public class Lineman extends Player{

    public Lineman(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
        offenceBehavior = new OBlockBehavior();  
}
public void setDefenceBehavior(){
    Random rand = new Random();
    int random = rand.nextInt(2);
    //picks behavior based on which number the random number generator picks   
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
@Override
public String play() {
	// TODO Auto-generated method stub
	return null;
}
    
}
