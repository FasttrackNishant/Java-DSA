package com.company;

import java.util.*;

public class Java_08_05_prime_or_not {

    public static void main(String[] args) {

        System.out.println("to find the prime " +
                "numbers");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isprime = true;

        // one special case for two
        if (num == 2) {
            System.out.println("n is a prime number");
        }


        //for (int i = 2; i <= num - 1; i++) {
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    // n is the multiple of i
                    isprime = false;
                }

            }

            if (isprime == true)
                System.out.println("Number " + num + " is prime ");
            else
                System.out.println("Number " + num + " is not prime ");


        }


    }
