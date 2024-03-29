
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
        defenceBehavior.play();
    }
/**
     * Sets what each player will do on offence for the play
     * @return The behavior they will use
     */
    public void setOffenceBehavior() {
        offenceBehavior.play();
    }
/**
 * Picks the play that each Player will do
 * @return The play that Player will do
 */
    public String play(){
       if (defence = false){
           return "Can't find error resulting in setOffenceBehavior not being a string";
        }
        else if(defence = true) {
            return "Can't find error resulting in setDefenceBehavior not being a string";
        }
        else{
            return null;
        }
    }
/**
 * Has the players team be switched from Offence to Defence or Defence to Offence
 * @return The teams offencive or defencive positions
 */
    public void turnover(){
        if (defence = true){
            defence = false;
        }
        else{
            defence = true;
        }
    }

}