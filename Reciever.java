public class Reciever extends Player {

    public Reciever(String name) {
        super(name);
    }
    public void setOffenceBehavior(){
      offenceBehavior = new RecieverBehavior();
    }
    public void setDefenceBehavior(){

    }
    
}
