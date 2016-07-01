import java.util.Scanner;
import java.lang.String;

/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class SymmetricString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s2 = "";

        System.out.println("Enter a string: ");
        String s1 = input.nextLine();
        for (int i = s1.length() - 1; i >= 0; i--) {
          s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)) {
            System.out.println("The string is symmetric.");
        }
        else {
            System.out.println("The string is not symmetric.");
        }
    }


}
