/**
 * Created by ThangNguyen on 7/26/2016.
 */
public class Clothes extends Armors  {
    public Clothes() {
    }

    public Clothes (int level) {
        super(level);
    }

    public void setTauntLine() {
        this.tauntLine = "Your normal clothes blocks the attack.";
    }
}
