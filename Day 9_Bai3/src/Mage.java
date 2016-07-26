/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Mage extends Hero {
    protected String tauntLine;

    public Mage() {
    }

    public Mage(String name, int level, int strength, int dexterity, int intelligence, int attack, int defense, Weapons weapon, Armors armor) {
        super(name, level, strength, dexterity, intelligence, attack, defense, weapon, armor);
    }

    public void setAttack(Hero hero, Weapons weapon) {
        if (weapon == null) {
            this.attack = hero.getLevel();
        } else {
            this.attack = hero.getLevel() + weapon.getLevel() + weapon.getIntelligenceBonus();
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(Hero hero, Armors armor) {
        if (armor == null) {
            this.defense = hero.getLevel();
        } else {
            this.defense = hero.getLevel() + armor.getLevel() + armor.getIntelligenceBonus();
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setTauntLine(){
        this.tauntLine = "Mind over matter";
    }

    public String getTauntLine() {
        return tauntLine;
    }
}
