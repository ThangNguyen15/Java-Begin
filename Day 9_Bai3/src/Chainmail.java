/**
 * Created by ThangNguyen on 7/25/2016.
 */
public class Chainmail extends Armors {

    public Chainmail() {
    }

    public Chainmail (int level, int strengthBonus) {
        super(level);
        this.strengthBonus = strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public void setTauntLine() {
        this.tauntLine = "Your mighty chainmail blocks the attack.";
    }

}
