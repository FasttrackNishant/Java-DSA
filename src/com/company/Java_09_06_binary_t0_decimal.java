package com.company;

public class Java_09_06_binary_t0_decimal {

    public static void bintodec(int n) {
        int pow = 0;
        int binnum = 0;

        while (n > 0) {
            int rem = n % 2;

            binnum = binnum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;

        }
        System.out.println("Binary form is " + binnum);


    }

    public static void main(String[] args) {


        System.out.println("hello world");

        bintodec(5);


    }

}
