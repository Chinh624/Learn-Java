package Buoi1_t5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        carList carlist = new carList();
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("\t Welcome ");
        do {
            System.out.println("Make a Choice ");
            System.out.println("1. Add a car ");
            System.out.println("2. Show carlist");
            System.out.println("3. Delete car ");
            System.out.println("4. Exit ");
            System.out.print("Type in your choise : ");
            choice = s.nextInt();
            s.nextLine();
            if (choice == 1) {
                carlist.addCar(s);
            }
        } while (choice != 4);
    }
}
