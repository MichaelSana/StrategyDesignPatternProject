
public abstract class Player{
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    public Player(String name){
        this.name = name;
    }
    public void setDefenceBehavior(){
        defenceBehavior.setDefenceBehavior();
    }
    public void setOffenceBehavior(){

    }
    public String play(){

    }
    public void turnover(){

    }
}