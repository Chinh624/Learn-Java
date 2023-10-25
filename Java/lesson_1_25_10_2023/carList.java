package Buoi1_t5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carList {
    private List<Car> list = new ArrayList<Car>();

    public void addCar(Scanner s) {
        list.add(new Car(s));
    }
}
