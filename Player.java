
public abstract class Player{
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String name) {
        this.name = name;
    }

    public void setDefenceBehavior() {
        ((Player) defenceBehavior).setDefenceBehavior();
    }

    public void setOffenceBehavior() {
        ((Player) offenceBehavior).setOffenceBehavior();
    }

    public abstract String play();

    public void turnover(){
        if (defence = true)
            defence = false;
        else
            defence = true;
    }

}