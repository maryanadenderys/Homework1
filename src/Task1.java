//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.util.Scanner;

public class Task1 {
    private static Scanner interval;

    public Task1() {
    }

    public static void main(String[] args) {
        interval = new Scanner(System.in);
        System.out.print("enter the a: ");
        int a = interval.nextInt();
        System.out.print("enter the b: ");
        int b = interval.nextInt();
        int[] interval = new int[51];
        boolean oddnumbers = false;
        int sumoddnumbers = 0;
        boolean evennumbers = false;
        int sumevennumbers = 0;

        int i;
        for(i = a; i < b; ++i) {
            interval[i] += i;
            int var9 = 2 * interval[i] - 1;
            sumoddnumbers += var9;
            System.out.print(var9 + ", ");
        }

        System.out.println("");
        System.out.println("sum odd numbers: " + sumoddnumbers);

        for(i = b; i >= a; --i) {
            interval[i] = i;
            int var10 = 2 * interval[i];
            sumevennumbers += var10;
            System.out.print(var10 + ", ");
        }

        System.out.println("");
        System.out.println("sum even numbers: " + sumevennumbers);
    }
}
