/**
 * Created by ThangNguyen on 6/30/2016.
 */
public class SwapNum {
    public static void swap(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Swap result: " + x + ", " + y);
    }

    public static void main(String[] args) {
        swap(3, 5);
    }


}
