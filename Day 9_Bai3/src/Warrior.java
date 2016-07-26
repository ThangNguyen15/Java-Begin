/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Warrior extends Hero {
    protected  String tauntLine;

    public Warrior() {}

    public Warrior(String name, int level, int strength, int dexterity, int intelligence, int attack, int defense, Weapons weapon, Armors armor) {
        super(name, level, strength, dexterity, intelligence, attack, defense, weapon, armor);
    }

    public void setAttack(Hero hero, Weapons weapon) {
        if (weapon == null) {
            this.attack = hero.getLevel();
        } else {
            this.attack = hero.getLevel() + weapon.getLevel() + weapon.getStrengthBonus();
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(Hero hero, Armors armor) {
        if (armor == null) {
            this.attack = hero.getLevel();
        } else {
            this.defense = hero.getLevel() + armor.getLevel() + armor.getStrengthBonus();
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
