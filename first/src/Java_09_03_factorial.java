package com.company;

public class Java_09_03_factorial {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;


        }
        return f;
    }

    public static void main(String[] args) {


        int res = factorial(5);
        System.out.println(res);

    }

}
