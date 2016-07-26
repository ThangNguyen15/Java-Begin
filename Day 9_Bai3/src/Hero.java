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
    protected Weapons weapon;
    protected Armors armor;

    public Hero() {
    }

    public Hero(String name, int level, int strength, int dexterity, int intelligence, int attack, int defense, Weapons weapon, Armors armor) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.attack = attack;
        this.defense = defense;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public abstract void setAttack(Hero hero, Weapons weapon);

    public abstract void setDefense(Hero hero, Armors armor);

    public String tauntLine(){
        return "I'm ready for anything";
    }
}
