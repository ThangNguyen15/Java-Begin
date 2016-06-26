import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/26/2016.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String string1 = input.nextLine();
        System.out.println("Enter second string: ");
        String string2 = input.nextLine();

        if (string1.contains(string2)) {
            System.out.println("String 2 is a substring of string 1.");
        }
        else {
            System.out.println("String 2 is not a substring of string 1.");
        }

    }
}
