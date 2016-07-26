/**
 * Created by ThangNguyen on 7/26/2016.
 */
public class Robes extends Armors {
    public Robes() {}

    public Robes (int level, int intelligenceBonus) {
        super(level);
        this.intelligenceBonus = intelligenceBonus;
    }

    public void setIntelligenceBonus(int intelligenceBonus) {
        this.intelligenceBonus = intelligenceBonus;
    }


    public void setTauntLine() {
        this.tauntLine = "Your magical robes protect you from the attack.";
    }

}
