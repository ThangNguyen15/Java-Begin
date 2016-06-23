import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/23/2016.
 */
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();

        double BMI = weight/(height*height);

        if (BMI<18.5) {
            System.out.print("" + name);
            System.out.print(" is too thin!");
            System.out.println();
        }

        if (BMI>=18.5 && BMI<25) {
            System.out.print("" + name);
            System.out.print(" is balanced.");
            System.out.println();
        }

        if (BMI>=25 && BMI<=30) {
            System.out.print("" + name);
            System.out.print(" is overweight.");
            System.out.println();
        }

        if (BMI>30) {
            System.out.print("" + name);
            System.out.print("too fat!");
            System.out.println();
        }

    }
}
