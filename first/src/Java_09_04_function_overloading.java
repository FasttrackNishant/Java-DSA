package com.company;

public class Java_09_04_function_overloading {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }


    public static float add(float a, float b) {
        return a + b;
    }

    public static int add(int a, int b) {

        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(2, 4, 6));

        System.out.println(add(4, 5));
        System.out.println(add(3.6f, 6.7f));

    }

}
