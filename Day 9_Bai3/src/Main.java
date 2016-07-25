/**
 * Created by ThangNguyen on 7/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        Weapons axe = new Weapons(1, 1, "Axe");
        Armors leather = new Armors(2,1, "Leather");
        Archer archer = new Archer("a", axe, leather);
        archer.setDefense(leather);
        archer.setAttack(axe);
        leather.setTauntLine(leather);
        axe.setTauntLine(axe);
        System.out.println(archer.getAttack());
        System.out.println(archer.getDefense());
        System.out.println(archer.tauntLine());
        System.out.println(leather.getTauntLine());
        System.out.println(axe.getTauntLine());
    }
}
