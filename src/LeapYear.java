import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/23/2016.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a leap year: ");
        int year = input.nextInt();

        if (((year%4==0) && (year%100!=0) || (year%400==0))) {
            System.out.println("True");
        }

        if (!(((year%4==0) && (year%100!=0) || (year%400==0)))) {
            System.out.println("False");
        }
    }
}
