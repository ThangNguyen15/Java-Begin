import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/10/2016.
 */
public class StudentManager {
    private int noOfStudent = 0;
    private int num = 0;
    Student[] students = new Student[1000];

    public StudentManager() {
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void inputStudent() {
        for (int i = 0; i < noOfStudent; i++) {
            students[i] = new Student();
            students[i].addStudent();
        }
    }

    public void displayStudent() {
        System.out.println("Index\t\t\tName\t\t\t\tGender\t\t\tAge");
        for (int i = 0; i < noOfStudent + num; i++) {
            System.out.printf("%2d%20s %18s %12s", i, students[i].getName(), students[i].getGender(), students[i].getAge());
            System.out.println();
        }
    }

    public void addStudent() {
        for (int i = noOfStudent; i < noOfStudent + num; i++) {
            students[i] = new Student();
            students[i].addStudent();
        }
    }

    public void deleteStudent(int index) {
        Student[] newStuArray = new Student[noOfStudent + num - 1];
        for (int i = 0; i < index; i++) {
            newStuArray[i] = students[i];
        }
        for(int i = index + 1 ; i < noOfStudent + num; i++) {
            newStuArray[i-1] = students[i];
        }
        students = newStuArray;
        noOfStudent--;
    }

    public void editStudent(int index) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        students[index].setName(input.nextLine());
        System.out.println("Enter gender: ");
        students[index].setGender(input.nextLine());
        System.out.println("Enter age: ");
        students[index].setAge(input.nextInt());
    }

}