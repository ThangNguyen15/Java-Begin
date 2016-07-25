/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Armors extends Equipment{
    protected int bonus;
    protected String name;
    protected String tauntLine;
    public Armors(int level, int bonus, String name) {
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

    public void setTauntLine(Armors armor) {
        switch (armor.getName()) {
            case "Clothes":
               tauntLine = "Your normal clothes blocks the attack";
               break;
            case "Chainmail":
                tauntLine = "Your mighty chainmail blocks the attack";
                break;
            case "Leather":
                tauntLine = "Your sneaky armor allows you to dodge the attack";
                break;
            case "Robes":
                tauntLine = "Your magical robes protect you from the attack";
                break;
        }
    }

    public String getTauntLine() {
        return tauntLine;
    }
}
