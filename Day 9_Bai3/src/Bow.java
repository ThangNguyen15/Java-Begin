/**
 * Created by ThangNguyen on 7/25/2016.
 */
public class Bow extends Weapons{

    public Bow() {}

    public Bow (int level, int dexterityBonus) {
        super(level);
        this.dexterityBonus = dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }


    public void setTauntLine() {
        this.tauntLine = "You shoot an arrow for.";
    }

}
