package Buoi1_t5;

import java.util.ArrayList;
import java.util.List;

public class human {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // Tinh da hinh
        // create a list of String
        names.add("Peter");
        names.add("Maria");
        names.add("George");
        // in ra fori tab
        for (int i = 0; i < names.size(); i++) {
            System.out.println("" + names.get(i));
        }
        System.out.println("===============");
        // foreach loop fore tab
        for (String eachName : names) {
            System.out.println("" + eachName);
        }
        // xoa 1 phan tu trong names
        System.out.println("===============");
        // names.remove(2);
        names.remove("George");
        for (String eachName : names) {
            System.out.println("" + eachName);
        }
        // Sua 1 phan tu trong array list
        names.set(0, "Peter A");
        System.out.println("===============");
        // foreach loop fore tab
        for (String eachName : names) {
            System.out.println("" + eachName);
        }
    }

}
