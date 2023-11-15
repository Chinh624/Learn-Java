package lesson_2_25_10_2023;

public class Menu {
    public static int getUserChoice() {
    int choice;
    System.out.println("Press 1: Create");
    System.out.println("Press 2: Display");
    System.out.println("Press 3: Update");
    System.out.println("Press 4: Delete");
    System.out.println("Press 5: Exits");
    System.out.print("Enter choice: ");
    choice = Main.in.nextInt();
    return choice;
    }
}
