package Buoi9_t5;

import java.util.SortedSet;

public class TreeSet {
    public static void main(String[] args){
        SortedSet<String> fruits = new java.util.TreeSet<>();

        // them cac phan tu vo fruits = pt .add.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);
        System.out.println("Fruits Set 2: " + fruits);

        // add them vo trung lap thi no se bo qua.
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);
        // add them vo truits.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
    }
    
}
