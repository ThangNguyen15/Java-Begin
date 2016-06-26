import java.util.Scanner;

/**
 * Created by ThangNguyen on 6/26/2016.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int h; //day in week (e.g: Monday, Tuesday,...)
        int q; //day in month (e.g: 1st, 2nd,...)
        int m; //month
        int j; //century
        int k; //year in century

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a month: ");
        int month = input.nextInt();
        System.out.println("Enter a day: ");
        q = input.nextInt();

        j = year/100; //calculate the century

        switch (month) {
            case 1:
                m = 13;
                k = (year % 100) - 1;
                h = (q + ((26*(m+1))/10) + (k+(k/4)) + ((j/4)+5*j)) % 7;

                switch (h) {
                    case 0:
                        System.out.println("It's Saturday.");
                        break;
                    case 1:
                        System.out.println("It's Sunday. ");
                        break;
                    case 2:
                        System.out.println("It's Monday.");
                        break;
                    case 3:
                        System.out.println("It's Tuesday.");
                        break;
                    case 4:
                        System.out.println("It's Wednesday.");
                        break;
                    case 5:
                        System.out.println("It's Thursday.");
                        break;
                    case 6:
                        System.out.println("It's Friday.");
                        break;
                }

                break;

            case 2:
                m = 14;
                k = (year % 100) - 1;
                h = (q + ((26*(m+1))/10) + (k+(k/4)) + ((j/4)+5*j)) % 7;

                switch (h) {
                    case 0:
                        System.out.println("It's Saturday.");
                        break;
                    case 1:
                        System.out.println("It's Sunday. ");
                        break;
                    case 2:
                        System.out.println("It's Monday.");
                        break;
                    case 3:
                        System.out.println("It's Tuesday.");
                        break;
                    case 4:
                        System.out.println("It's Wednesday.");
                        break;
                    case 5:
                        System.out.println("It's Thursday.");
                        break;
                    case 6:
                        System.out.println("It's Friday.");
                        break;
                }

                break;

            default:
                m = month;
                k = year % 100;
                h = (q + ((26*(m+1))/10) + (k+(k/4)) + ((j/4)+5*j)) % 7;

                switch (h) {
                    case 0:
                        System.out.println("It's Saturday.");
                        break;
                    case 1:
                        System.out.println("It's Sunday. ");
                        break;
                    case 2:
                        System.out.println("It's Monday.");
                        break;
                    case 3:
                        System.out.println("It's Tuesday.");
                        break;
                    case 4:
                        System.out.println("It's Wednesday.");
                        break;
                    case 5:
                        System.out.println("It's Thursday.");
                        break;
                    case 6:
                        System.out.println("It's Friday.");
                        break;
                }

                break;

        }


    }
}
