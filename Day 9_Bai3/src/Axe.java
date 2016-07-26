/**
 * Created by ThangNguyen on 7/26/2016.
 */
public class Axe extends Weapons {

    public Axe() {}

    public Axe (int level, int strengthBonus) {
        super(level);
        this.strengthBonus = strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }


    public void setTauntLine() {
        this.tauntLine = "You swing your mighty axe for.";
    }

}
