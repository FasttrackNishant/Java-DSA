package com.company;

public class Java_08_03_reverse_of_num {

    public static void main(String[] args) {

        int num = 2952193;
        int n;
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;

        }
    }
}
