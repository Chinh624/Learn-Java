package BKTGK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        Animal obj = new Animal(name, age); 

        System.out.println("You created an Animal: " + obj.getName() + " "  + obj.getAge());
    }
}