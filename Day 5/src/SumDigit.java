import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/3/2016.
 */
public class SumDigit {
    public static int sumOfDigit(long number) {
        int sum = 0;
        long digit;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            sum = (int) (sum + digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = input.nextLong();
        System.out.println(sumOfDigit(number));
    }
}
