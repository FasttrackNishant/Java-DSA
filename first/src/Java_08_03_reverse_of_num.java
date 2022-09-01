package com.company;
import java.util.*;
public class Java_08_03_reverse_of_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n;
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;

        }
    }
}
