/**
 * Created by ThangNguyen on 7/26/2016.
 */
public class Leather extends Armors{
    public Leather() {
    }

    public Leather (int level, int dexterityBonus) {
        super(level);
        this.dexterityBonus = dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    public void setTauntLine() {
        this.tauntLine = "Your sneaky armor allows you to dodge the attack.";
    }

}
