
/**
 * A Singular Football Player
 * @author Michael Sana
 */
public abstract class Player{
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    /**
     * Gives each individual player the atribute of one name
     * @return The name of the player
     * @param name
     */
    public Player(String name) {
        this.name = name;
    }
    /**
     * Sets what each player will do on defence for the play
     * @return The behavior they will use
     */
    public void setDefenceBehavior() {
        ((Player) defenceBehavior).setDefenceBehavior();
    }
/**
     * Sets what each player will do on offence for the play
     * @return The behavior they will use
     */
    public void setOffenceBehavior() {
        ((Player) offenceBehavior).setOffenceBehavior();
    }
/**
 * A abstract class which has each player choose the play they will do
 * @return none
 */
    public abstract String play();
/**
 * Has the players team be switched from Offence to Defence or Defence to Offence
 * @return The teams offencive or defencive positions
 */
    public void turnover(){
        if (defence = true)
            defence = false;
        else
            defence = true;
    }

}