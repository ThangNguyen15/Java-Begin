/**
 * Created by ThangNguyen on 7/10/2016.
 */
public class StudentManager {
    private int count = 0;
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
            count++;
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

    public Student[] deleteStudent() {
        Student[] newStuArray = new Student[noOfStudent + num - 1];
        Student student = new Student();
        for (int i = 0; i < student.getIndex(); i++) {
            newStuArray[i] = students[i];
        }
        for(int i = student.getIndex()+1 ; i < noOfStudent + num; i++) {
            for (int j = student.getIndex(); i < noOfStudent + num - 1; j++) {
                newStuArray[j] = students[i];
            }
        }
            return newStuArray;
    }


}