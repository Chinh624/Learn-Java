package Java;

import java.util.Scanner;

public class Vehicle {
    public static Scanner sc = new Scanner(System.in);
    public float gt;
    public int dt;
    public String name, lx;
    public float Thue;
//cau 3



//     // public float a,b;
//     // public float Dientich;
//     // public float Chuvi;
//     // cau2
//     // public float Diemtb;
//     // public int id;
//     // String name;
//     // public float LT,TH;

//     // public float Chieudai(float a){
//     // this.a = a;
//     // return a;
//     // }

//     // public float Chieurong(float b){
//     // this.b = b;
//     // return b;
//     // }

//     // public float Dientich(float a , float b){
//     // Dientich = (a*b);
//     // return Dientich;
//     // }

//     // public float Chuvi(float a , float b){
//     // Chuvi=(a+b)*2;
//     // return Chuvi;
//     // }

//     // public void Ttkt(){
//     // System.out.println("nhap chieu dai");
//     // a = sc.nextInt();

//     // System.out.println("nhap chieu rong");
//     // b = sc.nextInt();
//     // }

//     // public String toString() {
//     // return "chieu dai " + Chieudai(a) + " chieu rong " + Chieurong(b) + " dien
//     // tich " + Dientich(a,b) + " chu vi " + Chuvi(a, b);
//     // }
// cau 2

//     // public void Nttsv(){
//     // System.out.println("Ho va ten sv");
//     // name = ();

//     // System.out.println("Nhap ID");
//     // id = sc.nextInt();

//     // System.out.println("Nhap Diem LT");
//     // LT = sc.nextInt();

//     // System.out.println("Nhap Diem TH");
//     // TH = sc.nextInt();

//     // }
//     // public int IDsv (int id){
//     // return id;
//     // }

//     // public String Hoten(String name){
//     // this.name = name;
//     // return name;
//     // }

//     // public float Lythuyet(float LT){
//     // return LT;
//     // }

//     // public float Thuchanh(float TH){
//     // return TH;
//     // }

//     // public float Diemtb(float LT , float TH){
//     // Diemtb = (LT+TH)/2;
//     // return Diemtb;
//     // }

//     // public String TTsv(String name , int id , float LT , float TH){
//     // this.name = name;
//     // this.id = id;
//     // this.LT = LT;
//     // this.TH = TH;
//     // return Hoten(name) + " " + IDsv(id)+ " " + Lythuyet(LT) + " " + Thuchanh(TH)
//     // + " " + " " + Diemtb(LT, TH);
//     // }

    public String Hovaten(String name) {
        return name;
    }

    public float Dungtich(int dt) {
        return dt;
    }

    public String Loaixe(String lx) {
        return lx;
    }

    public float Giaxe(float gt) {
        return gt;
    }

    public String Getinformation() {
        System.out.printf("Full name || ");
        System.out.printf("Category vehicle || ");
        System.out.printf("vehicle Capacity || ");
        System.out.printf("price of vehicle || ");
        System.out.printf("tax vehicle || " );

        return Hovaten(this.name) + " " + Loaixe(this.lx) + " " + Dungtich(this.dt) + " " + Giaxe(this.gt) + " " + Thuexe(this.dt, this.gt);
    }

    public float Thuexe(float dt, float gt) {
        if (dt < 100) {
            Thue = gt * 1 / 100;
            System.out.println("Tax vehicle :" + Thue);
        }
        if (dt > 100 && dt <= 200) {
            Thue = gt * 3 / 100;
            System.out.println("Tax vehicle :" + Thue);
        }
        if (dt > 200) {
            Thue = gt * 5 / 100;
            System.out.println("Tax vehicle :" + Thue);
        }
        return Thue;
    }

    public void EnterInformation() {
        System.out.printf("enter your name: ");
        name = sc.next();
        System.out.println("=================");
        System.out.printf("vehicle category: ");
        lx = sc.next();
        System.out.println("=================");
        System.out.printf("capacity of vehicle: ");
        dt = sc.nextInt();
        System.out.println("=================");
        System.out.printf("price of vehicle: ");
        gt = sc.nextFloat();
        System.out.println("=================");
        Thuexe(dt, gt);
    }

}
