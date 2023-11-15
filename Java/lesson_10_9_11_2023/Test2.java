package lesson_10_9_11_2023;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Test2 {
    public static void main(String[] args) {
        Student studen1 = new Student(1, "Student1");
        Student studen2 = new Student(2, "Student2");
        Student studen3 = new Student(3, "Student3");
        Hashtable<Integer, Student> hashTable = new Hashtable<Integer, Student>();
        hashTable.put(studen1.getId(), studen1);
        hashTable.put(studen2.getId(), studen2);
        hashTable.put(studen3.getId(), studen3);
        for (Integer key : hashTable.keySet()) {
            Student value = hashTable.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println(".....");
        Student returned_value = (Student) hashTable.remove(2);
        System.out.println(".....");

        System.out.println("returned value is :" + returned_value);
        System.out.println(".....");

        for (Entry<Integer, Student> entry : hashTable.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println(".....");

        System.out.println("is the key 'I' present?" +
                hashTable.containsKey(1));
    }
}
