

public class Receiver extends Player{
    public Receiver(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
      offenceBehavior = new RecieverBehavior();
    }
    public void setDefenceBehavior(){

    }

}
