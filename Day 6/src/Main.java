import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/10/2016.
 */
public class Main {
    public static StudentManager studentManager = new StudentManager();
    public static Student student = new Student();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Student management program.");
            System.out.println("===========MENU============");
            System.out.println("1. Input student info.");
            System.out.println("2. Show student.");
            System.out.println("3. Add student.");
            System.out.println("4. Delete student.");
            System.out.println("5. Quit program.");
            System.out.println("Your option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter number of student you want to input: ");
                    int noOfStudent = input.nextInt();
                    studentManager.setNoOfStudent(noOfStudent);
                    studentManager.inputStudent();
                    break;
                case 2:
                    System.out.println("========STUDENT'S INFO========");
                    studentManager.displayStudent();
                    break;
                case 3:
                    System.out.println("Enter number of student you want to add: ");
                    int num = input.nextInt();
                    studentManager.setNum(num);
                    studentManager.addStudent();
                    break;
                case 4:
                    System.out.println("Enter index of student you want to delete:");
                    int index = input.nextInt();
                    student.setIndex(index);
                    System.out.println(studentManager.deleteStudent());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Try again!");
            }
        } while (option != 4);
    }
}



