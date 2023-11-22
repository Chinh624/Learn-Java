package Training_CK_16_10_2023.assignment27;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable<String, String> myDictionary = new Hashtable<String, String>();
        System.out.println("" + myDictionary);
        myDictionary.put("happy", "having or showing a feeling of pleasure or  contentment");
        myDictionary.put("lucky", "good things happened in my life");
        myDictionary.put("one", "a number with the count one");
        // In ra
        for (String key : myDictionary.keySet()) {
            String value = myDictionary.get(key);
            System.out.println(key + " " + value);
        }
    }

}
