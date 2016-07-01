import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class SumAndAverageOfInteger {
    public static void main(SymmetricString[] args) {
        int count = 0;
        int sum = 0;
        int num;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            count++;
            sum = sum + num;

        } while (num != 0);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + ((double) sum / count));
    }
}
