import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/3/2016.
 */
public class CreditCard {
    public static int getSize(long number) {
        int size = 0;
        while (number > 0) {
            number = number / 10;
            size++;
        }
        return size;
    }

    public static int getDigit(int number) {
        int temp = 0;
        if (number <= 9) {
            number = number;
        } else {
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                temp = temp + digit;
            }
            number = temp;

        }
        return number;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        int size = getSize(number);
        int[] arrDigit = new int[size];
        while (number > 0) {
            for (int i = 0; i <= size - 1; i++) {
                arrDigit[i] = (int) (number % 10);
                number = number / 10;
            }

            for (int i = 1; i <= size - 1; i += 2) {
                sum = sum + getDigit(arrDigit[i] * 2);
            }
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        int size = getSize(number);
        int[] arrDigit = new int[size];
        while (number > 0) {
            for (int i = 0; i <= size - 1; i++) {
                arrDigit[i] = (int) (number % 10);
                number = number / 10;
            }
            for (int i = 0; i <= size - 1; i += 2) {
                sum = sum + arrDigit[i];
            }

        }
        return sum;
    }

    public static int getPrefix(long number, int n) {
        int prefix = (int) (number / Math.pow(10, (getSize(number) - n)));
        return prefix;
    }

    public static boolean isRightPrefix(long number) {
        int a = getPrefix(number, 1);
        int b = getPrefix(number, 2);
        boolean checkPrefix = (a == 4 || a == 5 || a == 6 || b == 37);
        return checkPrefix;
    }

    public static boolean isValid(long number) {
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        boolean checkValid = (sum % 10 == 0 && isRightPrefix(number));
        return checkValid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        do {
            System.out.println("Enter a credit card number: ");
            number = input.nextLong();
            if (isValid(number)) {
                System.out.println("" + number + " is a valid credit card number.");
            } else {
                System.out.println("" + number + " is invalid.");
            }
        } while (number != 0);

    }
}


