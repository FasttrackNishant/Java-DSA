package com.company;

public class Java_07_03_print_largest_3_num {
    public static void main(String[] args) {
        int a= 629;
        int b = 45;
        int c= 200;

        if( (a>=b) && (a>=c))
        {
            System.out.println("a is largest");
        }
        else if(b>=c)
        {
            System.out.println("b is largest");
        }
        else
        {
            System.out.println("c is largest");
        }

    }
}
