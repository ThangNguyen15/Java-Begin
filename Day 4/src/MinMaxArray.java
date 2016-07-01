import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter value for element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int max = array[0];
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        System.out.println("Biggest element: " + max + " index " + pos);
        int min = array[0];
        pos = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        System.out.println("Smallest element: " + min + " index " + pos);
    }
}
