/**
 * Created by ThangNguyen on 7/22/2016.
 */
public class Warrior extends Hero {
    public Warrior(String name, Weapons weapon, Armors armor) {
        super(name, weapon, armor);
        this.strength = 5;
    }

    public void setAttack(Weapons weapon) {
        if (weapon.getName() == null) {
            this.attack = level;
        }
        else if (weapon.getName().equals("Axe")) {
            this.attack = level + weapon.getLevel() + weapon.getBonus();
        }
        else {
            this.attack = level + weapon.getLevel();
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(Armors armor) {
        if (armor.getName() == null) {
            this.defense = level;
        }
        else if (armor.getName().equals("Chainmail")) {
            this.defense = level + armor.getLevel() + armor.getBonus();
        }
        else {
            this.defense = level + armor.getLevel();
        }
    }

    public int getDefense() {
        return defense;
    }


    @Override
    public void fight(Hero hero) {

    }



    @Override
    public String tauntLine(){
        return "I AM MIGHTY";

    }
}
