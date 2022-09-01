package com.company;

import java.util.Scanner;

public class Java_08_01_sum_of_N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print sum");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("The sum is "+sum);


        //for loop

        for (int j = 1; j<=n ; j++)
        {
            System.out.print(j+" ");
        }
    }
}
