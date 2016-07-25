/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Weapons extends Equipment {
    protected int bonus;
    protected String name;
    protected String tauntLine;
    public Weapons(int level, int bonus, String name) {
        super(level);
        this.bonus = bonus;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setTauntLine(Weapons weapon) {
        switch (weapon.getName()) {
            case "Stick":
                this.tauntLine = "You poke your stick for";
                break;
            case "Axe":
                this.tauntLine = "You swing your mighty axe for";
                break;
            case "Bow":
                this.tauntLine = "You shoot an arrow for";
                break;
            case "Staff":
                this.tauntLine = "You cast a spell for";
                break;
        }
    }

    public String getTauntLine() {
        return tauntLine;
    }
}
