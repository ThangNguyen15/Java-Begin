import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/22/2016.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will convert Fahrenheit degree to Celsius degree.");
        System.out.println("Fahrenheit degree: ");
        int fahrenheit = input.nextInt();

        int celsius = (fahrenheit-32)*5/9;
        System.out.println("Convert to Celsius degree: " + celsius);
    }
}
