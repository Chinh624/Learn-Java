package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students studentList = new Students();

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Show Student");
            System.out.println("4. Swap Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    continue;
                case 2:
                    studentList.deleteStudent();
                    continue;
                case 3:
                    studentList.showStudentlists();
                    continue;
                case 4:
                    studentList.swapStudent();
                    continue;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                    break;
            }
        }

    }
}
