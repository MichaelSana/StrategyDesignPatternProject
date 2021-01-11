//import java.util.Random;
public class Quarterback extends Player{

    public Quarterback(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
      
     
            offenceBehavior = new RunBehavior();
            offenceBehavior = new PassBehavior();
       
    }
    public void setDefenceBehavior(){

    }
    
}
