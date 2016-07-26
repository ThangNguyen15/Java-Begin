/**
 * Created by ThangNguyen on 7/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        Archer hero = new Archer("aaa",1,1,1,1,1,1,null,null);
        hero.setAttack(null);
        hero.setDefense(null);
        hero.setTauntLine();
        System.out.println(hero.getAttack());
        System.out.println(hero.getDefense());
        System.out.println(hero.getTauntLine());
    }
}
