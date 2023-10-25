package Buoi2_t5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList{

    private List<Student> students = new ArrayList<>(); // Ap dung tinh da hinh

    public StudentList() {
        Student stu00 = new Student(000, "Mr F", 9.3);
        students.add(stu00);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void create() {
        Student stu01 = new Student(111, "Mr A", 9.3);
        Student stu02 = new Student(222, "Mr B", 5.3);
        Student stu03 = new Student(333, "Mr C", 7.3);
        Student stu04 = new Student(444, "Mr D", 8.3);
        Student stu05 = new Student(555, "Mr E", 4.3);
        students.add(stu01);
        students.add(stu02);
        students.add(stu03);
        students.add(stu04);
        students.add(stu05);
    }

    public void display() {
        System.out.println("=============");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("" + students.get(i));
        }
    }

    public void update() {
        // Update
        System.out.println("Enter index of student to UPDATE: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("We update the student " + index + "for you");
            Student newStudent = new Student(999, "Mr AAA", 6.7);
            students.set(index, newStudent);
            display();
        } else {
            System.out.println("Invalid Index");
        }
    }

    public void delete(Scanner in) {
        // Remove
        System.out.println("Enter index of student to Remove: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("We Remove the student " + index + "for you");
            students.remove(index);
            display();
        } else {
            System.out.println("Invalid Index");
        }
    }
}

