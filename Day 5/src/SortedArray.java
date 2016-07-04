import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/4/2016.
 */
public class SortedArray {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arrayInt = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value for element " + (i + 1) + " :");
            arrayInt[i] = input.nextInt();
        }
        System.out.println(isSorted(arrayInt));
    }
}