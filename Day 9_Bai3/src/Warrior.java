/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Warrior extends Hero {
    protected  String tauntLine;

    public Warrior() {}

    public Warrior(String name, int level, int strength, int dexterity, int intelligence, int attack, int defense, Weapons weapon, Armors armor) {
        super(name, level, strength, dexterity, intelligence, attack, defense, weapon, armor);
    }

    public void setAttack(Weapons weapon) {
        if (weapon == null) {
            this.attack = level;
        } else {
            this.attack = level + weapon.getLevel() + weapon.getStrengthBonus();
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(Armors armor) {
        if (armor == null) {
            this.attack = level;
        } else {
            this.defense = level + armor.getLevel() + armor.getStrengthBonus();
        }
    }

    public int getDefense() {
        return defense;
    }



    public void setTauntLine(){
        this.tauntLine = "I AM MIGHTY";
    }

    public String getTauntLine() {
        return tauntLine;
    }
}
