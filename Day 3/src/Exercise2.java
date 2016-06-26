import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Created by ThangNguyen on 6/26/2016.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will solve quadractic equation: ax^2+bx+c=0");

        System.out.println("Enter value for a: ");
        double a = input.nextDouble();
        System.out.println("Enter value for b: ");
        double b = input.nextDouble();
        System.out.println("Enter value for c: ");
        double c = input.nextDouble();

        double delta = b*b-4*a*c;
        double x1, x2;

        if (delta > 0) {
            x1=(-b+sqrt(delta))/(2*a);
            x2=(-b-sqrt(delta))/(2*a);
            System.out.println(" Roots are x1 = " +x1+ " and x2 = " +x2);
        }
        else if (delta == 0) {
            x1= (-b)/(2*a);
            System.out.println("Root is x1 = x2 = " +x1);
        }
        else {
            System.out.println("The equation has no root!");
        }
    }
}
