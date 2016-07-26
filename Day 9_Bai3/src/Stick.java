/**
 * Created by ThangNguyen on 7/26/2016.
 */
public class Stick extends Weapons {
    public Stick() {
    }

    public Stick (int level) {
        super(level);
    }

    public void setTauntLine() {
        this.tauntLine = "You poke your stick for.";
    }
}
