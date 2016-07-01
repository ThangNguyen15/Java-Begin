import java.util.Scanner;
import java.lang.String;

/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class ImprovedBMICalculator {

    public static void BMICalculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();

        double BMI = weight / (height * height);

        if (BMI < 18.5) {
            System.out.print("" + name);
            System.out.print(" is too thin!");
            System.out.println();
        } else if (BMI < 25) {
            System.out.print("" + name);
            System.out.print(" is balanced.");
            System.out.println();
        } else if (BMI <= 30) {
            System.out.print("" + name);
            System.out.print(" is overweight.");
            System.out.println();
        } else {
            System.out.print("" + name);
            System.out.print("too fat!");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        do {
            BMICalculator();
            System.out.println("Continue?(Y/N): ");
            option = input.next();
        } while (option.equals("Y") || option.equals("y"));

    }
}

