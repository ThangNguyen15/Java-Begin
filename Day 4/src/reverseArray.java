/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class reverseArray {
    public static String[] reverseArray(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"foo", "bar", "test", "dump"};
        reverseArray(arr);


    }
}
