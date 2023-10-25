package Buoi1_t5;

import java.util.Scanner;

public class Car {
    String make;
    String model;
    String year;

    public Car(Scanner s) {
        System.out.println("Typ in model ");
        model = s.nextLine();
        System.out.println("Type in year");
        year = s.nextLine();
    }

}
