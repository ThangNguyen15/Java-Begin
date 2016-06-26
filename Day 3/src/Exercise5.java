import java.util.Scanner;

import java.lang.String;

/**
 * Created by chabinu on 6/26/2016.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First element: ");
        double a = input.nextDouble();
        System.out.println("Second element: ");
        double b = input.nextDouble();
        System.out.println("Enter a simple arithmetic operator +,-,* or : ");
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Arithmetic operator: " + op);
                System.out.println("Result: " +(a+b));
                break;
            case "-":
                System.out.println("Arithmetic operator: " + op);
                System.out.println("Result: " +(a-b));
                break;
            case "*":
                System.out.println("Arithmetic operator: " + op);
                System.out.println("Result: " +(a*b));
                break;
            case ":":
                if (b == 0) {
                    System.out.println("Second element must be different from 0. Try again");
                }
                else {
                    System.out.println("Arithmetic operator: " + op);
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("You entered a wrong arithmetic operator.");
                break;
        }

    }
}
