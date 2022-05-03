package org.except.homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExc {
    static Scanner scan = new Scanner(System.in);

    public static int[] arrayTest = {1,2,3,4,5,6,7,8,9,0};


    public void getIntFromArr(){

        System.out.println("Введите индекс массива который хотите увидеть");
        int num = scan.nextInt();
        System.out.println(arrayTest[num]);
    }

}
