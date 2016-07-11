import java.util.Scanner;

/**
 * Created by ThangNguyen on 7/10/2016.
 */
public class Student {
    private String name;
    private String gender;
    private int age;
    private int index;

    Scanner input = new Scanner(System.in);

    public Student() {
    }

    public Student(int index, String name, String gender, int age) {
        this.index = index;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addStudent() {
        System.out.println("Student's name: ");
        setName(input.nextLine());
        System.out.println("Student's gender: ");
        setGender(input.nextLine());
        System.out.println("Student's  age: ");
        setAge(input.nextInt());
    }
}







