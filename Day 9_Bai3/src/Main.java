/**
 * Created by ThangNguyen on 7/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        Bow weapon = new Bow(1,5);
        Archer hero = new Archer("aaa",2,1,1,1,1,1,weapon,null);
        weapon.setTauntLine();
        hero.setTauntLine();
        hero.setAttack(hero, weapon);
        hero.setDefense(hero, null);
        System.out.println(hero.getTauntLine());
        System.out.println(weapon.getTauntLine());
        hero.setLevel(10);
        System.out.println(hero.getAttack());
        System.out.println(hero.getDefense());

    }
}
