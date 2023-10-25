package Buoi1_t5;

import java.util.ArrayList;
import java.util.List;

public class arrayListdemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // Tinh da hinh
        names.add("Peter");
        names.add("Maria");
        names.add("George");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("" + names.get(i));
        }
        System.out.println("===============");

        for (String eachName : names) {
            System.out.println("" + eachName);
        }

        System.out.println("===============");
        names.remove("George");

        for (String eachName : names) {
            System.out.println("" + eachName);
        }

        names.set(0, "Peter A");
        System.out.println("===============");

        for (String eachName : names) {
            System.out.println("" + eachName);
        }
    }
}
