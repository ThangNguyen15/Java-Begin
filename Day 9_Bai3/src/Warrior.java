/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Warrior extends Hero {

    public Warrior() {}

    public Warrior(String name, int level, int strength, int dexterity, int intelligence, int attack, int defense, Weapons weapon, Armors armor) {
        super(name, level, strength, dexterity, intelligence, attack, defense, weapon, armor);
    }

    public void setAttack(Weapons weapon) {
        this.attack = level + weapon.getLevel() + weapon.getStrengthBonus();
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(Armors armor) {
        this.defense = level + armor.getLevel() + armor.getStrengthBonus();
    }

    public int getDefense() {
        return defense;
    }

//
//    @Override
//    public void fight(Hero hero) {
//
//    }



    @Override
    public String tauntLine(){
        return "I AM MIGHTY";

    }
}
