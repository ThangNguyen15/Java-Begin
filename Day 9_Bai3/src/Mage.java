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

    public void setAttack(Weapons weapon) {
        this.attack = level + weapon.getLevel() + weapon.getIntelligenceBonus();
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(Armors armor) {
        this.defense = level + armor.getLevel() + armor.getIntelligenceBonus();
    }

    public int getDefense() {
        return defense;
    }


//    @Override
//    public void fight(Hero hero) {
//
//    }
//

    public String setTauntLine(){
        return "Mind over matter";

    }
}
