package Training_CK_16_10_2023.assignment27;

import java.util.Hashtable;

public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer, String> myHashTable = new Hashtable<>();

        int[] array = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < array.length; i++) {
            myHashTable.put(array[i], "");
        }
        for (int number : myHashTable.keySet()) {
            String value = myHashTable.get(number);
            System.out.println(value + " " + number);
        }

    }
}
