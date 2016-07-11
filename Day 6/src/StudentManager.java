/**
 * Created by ThangNguyen on 7/10/2016.
 */
public class StudentManager {
    private int noOfStudent = 0;
    Student[] students = new Student[1000];

    public StudentManager() {
    }

    public int setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
        return noOfStudent;
    }

    public void addStudent() {
        for (int i = 0; i < noOfStudent; i++) {
            students[i] = new Student();
            students[i].addStudent();
        }
    }

    public void displayStudent() {
        System.out.println("\tName\t\t\t\tGender\t\t\tAge");
        for (int i = 0; i < noOfStudent; i++) {
            System.out.printf("%10s %18s %12s", students[i].getName(), students[i].getGender(), students[i].getAge());
            System.out.println();
        }
    }

    public Student[] deleteStudent() {
        Student student = new Student();
        Student[] newStuArray = new Student[noOfStudent - 1];
        for (int i = 0; i < student.getIndex(); i++) {
            newStuArray[i] = students[i];
        }
        for(int i = student.getIndex() + 1; i<noOfStudent;i++){
            newStuArray[i] = students[i-1];
        }
        return newStuArray;
    }
}