/**
 * Created by ThangNguyen on 7/22/2016.
 */
public abstract class Weapons extends Equipment {
    protected int strengthBonus;
    protected int dexterityBonus;
    protected int intelligenceBonus;
    protected String tauntLine;

    public Weapons() {
    }

    public Weapons(int level) {
        super(level);
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public String getTauntLine() {
        return tauntLine;
    }

}
