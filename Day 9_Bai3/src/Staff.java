/**
 * Created by ThangNguyen on 7/26/2016.
 */
public class Staff extends Weapons {

    public Staff() {}

    public Staff (int level, int intelligenceBonus) {
        super(level);
        this.intelligenceBonus = intelligenceBonus;
    }

    public void setIntelligenceBonus(int intelligenceBonus) {
        this.intelligenceBonus = intelligenceBonus;
    }


    public void setTauntLine() {
        this.tauntLine = "You cast a spell for.";
    }

}
