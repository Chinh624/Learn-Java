package lesson_2_25_10_2023;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    int choice;
    StudentList studentList = new StudentList();
    while (true) {
    choice = Menu.getUserChoice();
    switch (choice) {
        case 1:
        studentList.create();
    break;
        case 2:
        studentList.display();
    break;
        case 3:
        studentList.update();
    break;
        case 4:
        studentList.delete(Main.in);
    break;
        case 5:
    return;
        default:
        System.out.println("Invalid");
        }
        }
    }
}
