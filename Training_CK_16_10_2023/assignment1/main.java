package Training_CK_16_10_2023.assignment1;

import java.util.Scanner;


public class main {
        public static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
    int choice;
    StudentList studentList = new StudentList();
    while (true) {
    choice = Menu.getUserChoice();
    switch (choice) {
        case 1:
        studentList.addStudent();
    break;
        case 2:
        studentList.displayStudent();
    break;
        case 3:
        studentList.updateStudent();
    break;
        case 4:
        studentList.deleteStudent(main.in);
    break;
        case 5:
    return;
        default:
        System.out.println("Invalid");
        }
        }
    }
}
