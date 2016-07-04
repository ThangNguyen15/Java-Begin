import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/2/2016.
 */
public class Calendar {
    static int numOfDay = 0;
    static int h = 0;

    public static boolean isLeapYear(int year) {
        boolean b = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return b;
    }

    public static int getNumberOfDayInMonth(int year, int month) {
        int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            daysOfMonth[month] = 29;
        }
        numOfDay = daysOfMonth[month];
        return numOfDay;
    }

    public static int getStartDay(int year, int month) {
        int dayInWeek; //day in week (e.g: Monday, Tuesday,...)
        int q = 1; //day in month (e.g: 1st, 2nd,...)
        int m; //month
        int j; //century
        int k; //year in century

        j = year / 100; //calculate the century
        k = year % 100;

        if (month == 1 || month == 2) {
            m = month + 12;
            k = k - 1;
            h = (q + ((26 * (m + 1)) / 10) + (k + (k / 4)) + ((j / 4) + 5 * j)) % 7;
        } else {
            m = month;
            h = (q + ((26 * (m + 1)) / 10) + (k + (k / 4)) + ((j / 4) + 5 * j)) % 7;
        }
        return h;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numOfDay = getNumberOfDayInMonth(year, month);
        if (startDay == 0){
            System.out.print("\t\t\t\t\t\t");
        }
        else if (startDay == 1) {
            System.out.print("\t\t\t\t\t\t\t");
        }
        else if (startDay == 2) {
            System.out.print("\t");
        }
        else if (startDay == 3) {
            System.out.print("\t\t");
        }
        else if (startDay == 4) {
            System.out.print("\t\t\t");
        }
        else if (startDay == 5) {
            System.out.print("\t\t\t\t");
        }
        else if (startDay == 6) {
            System.out.print("\t\t\t\t\t");
        }

        for (int i = 1; i <= numOfDay; i++) {
            System.out.printf("%3d ", i);
            if (((i + startDay - 1) % 7 == 0) || (i == numOfDay)) {
                System.out.println();
            }
        }


    }

    public static void printMonthTitle(int year, int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("" + monthNames[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt();
        System.out.println("Enter month: ");
        int month = input.nextInt();

        printMonthTitle(year, month);
        printMonthBody(year, month);

    }
}
