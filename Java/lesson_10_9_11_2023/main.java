package lesson_10_9_11_2023;
// # learn hashmap

import java.util.Hashtable;

public class main {
public static void main(String[] args){
    Hashtable<Customer, FruitList> mySales = new Hashtable<Customer,FruitList>();

    Customer cus01 = new Customer(111, "Tran", "ABC Street, Da Nang");
        FruitList fruitList01 = new FruitList();
        fruitList01.enter("Apple");
        fruitList01.enter("Mango");
        fruitList01.enter("Cherry");


    Customer cus02 = new Customer(222, "B", "XYZ Street, Da Nang");
        FruitList fruitList02 = new FruitList();
        fruitList02.enter("WaterMelon");
        mySales.put(cus01, fruitList01);
        mySales.put(cus02, fruitList02);

        for (Customer key : mySales.keySet()) {
        FruitList value = mySales.get(key);
        System.out.println(key+ " - BUY- "+value);
        }
    }
}

