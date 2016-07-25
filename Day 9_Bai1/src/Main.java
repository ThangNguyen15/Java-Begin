
/**
 * Created by ThangNguyen on 7/21/2016.
 */
public class Main {
    public static int sumOfDigit(long number) {
        int sum = 0;
        long digit;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            sum = (int) (sum + digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100; i++){
            System.out.println(sumOfDigit(98765432112333333L));
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.duration());
    }
}
