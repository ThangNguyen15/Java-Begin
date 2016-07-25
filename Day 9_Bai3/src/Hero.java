/**
 * Created by ThangNguyen on 7/22/2016.
 */
public abstract class Hero {
    protected String name;
    protected int level = 1;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int attack;
    protected int defense;
    protected int hp;
    protected Weapons weapon;
    protected Armors armor;

    public Hero (String name, Weapons weapon, Armors armor ) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void setAttack(Weapons weapon) {
       if (weapon.getName() == null) {
           this.attack = level;
       }
       else {
           this.attack = level + weapon.getLevel();
       }
    }

    public int getAttack() {
        return  attack;
    }

    public void setDefense(Armors armor) {
        if (armor.getName() == null) {
            this.defense = level;
        }
        else {
            this.defense = level + armor.getLevel();
        }
    }

    public int getDefense() {
        return defense;
    }

//    public abstract void fight(Hero hero);

    public String tauntLine(){
        return "I'm ready for anything";
    }

}
