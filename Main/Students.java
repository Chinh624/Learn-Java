package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    private String name;
    private int id;
    // khoi tao bien list chua class studens = array list
    private List<Students> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String showStudent() {
        return "Student -- Name: " + getName() + " " + "ID: " + getId();
    }

    public void addStudent() {
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String studentName = scanner.nextLine();
            System.out.print("ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();

            Students student = new Students();
            student.setName(studentName);
            student.setId(studentId);
            studentList.add(student);
        }
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID and Name to delete (separated by space): ");
        int deleteId = scanner.nextInt();
        String deleteName = scanner.next();

        Students studentToDelete = null;
        for (Students student : studentList) {
            if (student.getId() == deleteId && student.getName().equals(deleteName)) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {
            studentList.remove(studentToDelete);
            System.out.println("Student deleted: " + studentToDelete.showStudent());
        } else {
            System.out.println("Student not found.");
        }
    }

    public void showStudentlists() {
        for (Students student : studentList) {
            System.out.println(student.showStudent());
        }
    }

    public void swapStudent() {
        System.out.println("Enter ID you want to swap: ");
        int swapId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name you want to swap: ");
        String swapName = scanner.nextLine();

        for (Students student : studentList) {
            if (student.getId() == swapId && student.getName().equals(swapName)) {
                System.out.println("Enter new Name for swapping: ");
                String newSwapName = scanner.nextLine();

                System.out.println("Enter new ID for swapping: ");
                int newSwapId = scanner.nextInt();

                student.setName(newSwapName);
                student.setId(newSwapId);

                System.out.println("Student swapped: " + student.showStudent());
                return;
            }
        }
        System.out.println("Student not found for swapping in student list");
    }
}
