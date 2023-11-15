package lesson_10_9_11_2023;

import java.util.Hashtable;

public class Test3 {
    public static void main(String[] args []){
        // #create aray with name myDictionary = Hashtable
        Hashtable<String, String> myDictionary = new Hashtable<String, String>();
        System.out.println("" + myDictionary);
        // add elements for myDictionary
        myDictionary.put("happy", "having or showing a feeling of pleasure or contentment");
        myDictionary.put("lucky", "good things happened in my life");
        myDictionary.put("one", "a number with the count one");

        for (String key : myDictionary.keySet()) {
            String value = myDictionary.get(key);
            System.out.println(key+ " "+value);
    }
}
}

