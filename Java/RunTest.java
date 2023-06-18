package Java;

import java.util.Scanner;

public class RunTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Please select menu");
        System.out.println("1: enter vehicle[1], vehicle[2], vehicle[3]");
        System.out.println("2: show table");
        System.out.println("3: exit");
        System.out.println("Select menu");
        char Kt = sc.next().charAt(0);
        switch (Kt) {
            case '1':
                System.out.println("Enter information veheicle[1]");
                vehicle1.EnterInformation();
                System.out.println("Enter information veheicle[2]");
                vehicle2.EnterInformation();
                System.out.println("Enter information veheicle[3]");
                vehicle3.EnterInformation();
                break;
            case '2':
                System.out.println("=================");
                System.out.println(vehicle1.Getinformation());
                System.out.println("=================");
                System.out.println(vehicle2.Getinformation());
                System.out.println("=================");
                System.out.println(vehicle3.Getinformation());
                break;
            case '3':
                System.out.println("exit");
                break;
        }
    }
}

}

//         // System.out.printf("Ho ten");
//         // System.out.printf(" ID");
//         // System.out.printf(" Diem LT");
//         // System.out.printf(" Diem TH");
//         // System.out.printf(" TB");
//         // System.out.println(" ");
//         // Venhicle Sv1 = new Venhicle();
//         // System.out.println(Sv1.TTsv("chinh", 99501, 10,10));
//         // Venhicle Sv2 = new Venhicle();
//         // System.out.println(Sv2.TTsv("hasaghi", 995201, 10,10));
//         // Venhicle Sv3 = new Venhicle();
//         // System.out.println(Sv3.TTsv("yone", 199501, 10,20));
//     }
// }