/**
 * Created by ThangNguyen on 7/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        Bow weapon = new Bow(1,5);
        Archer hero = new Archer("aaa",1,1,1,1,1,1,weapon,null);
        hero.setAttack(weapon);
        hero.setDefense(null);
        weapon.setTauntLine();
        hero.setTauntLine();
        System.out.println(hero.getAttack());
        System.out.println(hero.getDefense());
        System.out.println(hero.getTauntLine());
        System.out.println(weapon.getTauntLine());
    }
}
