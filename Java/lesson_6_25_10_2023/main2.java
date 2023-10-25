package Buoi7_t5;

import java.util.Random;

public class main2 {
    public static int [] enterRandomArray(int size){
        int [] tmp = new int[size];
        Random rd = new Random();
        for (int i = 0; i < tmp.length; i++){
            tmp[i] = rd.nextInt(100);
        }
        return tmp;
    }

    public static void main(String[] args) {
        int [] myArr = new int[10];
        myArr = enterRandomArray(10);
        int result01, result02;
        display(myArr);
        result01 = sumByIterative(myArr);
        System.out.println("Result 1: " + result01);
        result02 = sumByRecursive(myArr,myArr.length);
        System.out.println("Result 2: " + result02);
    }

    private static int sumByIterative(int[] myArr) {
        int rs = 0;
        for (int i = 0; i < myArr.length; i++) {
            rs = rs + myArr[i];
        }
        return rs;
    }

    private static int sumByRecursive(int[] myArr, int index) {
        if (index <= 0) {
            return 0;
        }else{
            return myArr[index -1 ] + sumByRecursive(myArr,index - 1);
        }
    }

    private static void display(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]+ " ");
        }
    }
}