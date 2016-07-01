/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean b = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return b;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2016));
    }
}
