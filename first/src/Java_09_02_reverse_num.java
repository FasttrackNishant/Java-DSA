package com.company;

public class Java_09_02_reverse_num {


    public static void swap(int  a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {


        int a = 3;
        int b = 9;
        System.out.println("Befor swap");
        System.out.println(a + " " + b);


        swap(a, b);
        System.out.println("after swap ");
        System.out.println(a + " " + b);


    }

}
