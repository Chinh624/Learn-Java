package lesson_10_9_11_2023;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
        hashTable.put(1, "Basic Java");
        hashTable.put(2, "OOP");
        hashTable.put(3, "Collection");

        for (Integer key : hashTable.keySet()) {
            String value = hashTable.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println(".....");

        for (Entry<Integer, String> entry : hashTable.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println(".....");
        System.out.println("Initial table is" + hashTable);
        System.out.println("......");

        String returned_value = (String) hashTable.remove(2);
        System.out.println("......");

        System.out.println("returned value is:" + returned_value);
        System.out.println("....");

        System.out.println("New table is:" + hashTable);

    }
}

