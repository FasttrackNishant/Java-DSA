package com.company;

import java.util.*;

public class Java_09_01_functions {


    public static void print() {
        System.out.println("Helllo world");

    }

    public static int sum(int a , int b) {

        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {


        System.out.println("Function and Methons &");
        print();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int result =  sum(a,b);
        System.out.println(result );

    }
}
