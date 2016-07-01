/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class OverloadMethod {
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static double sum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.6, 4.4));

    }
}
