package com.company;

import java.util.*;

public class Java_09_05_checkprime {

    public static boolean prime(int n) {

        for (int i = 2; i < n-1; i++) {

            if (n % i == 0) {
                return false;
            } else {
                return true;
            }
        }

    public static void main(String[] args) {
        System.out.println("check prim number");
        int n = 45;
        boolean result = prime(n);
        System.out.println(result);

    }

}
