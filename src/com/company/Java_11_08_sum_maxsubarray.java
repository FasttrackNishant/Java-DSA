package com.company;

public class Java_11_08_sum_maxsubarray {


    public static void sumofarray(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] );
                    // sum calculate karni hain
                    currSum += arr[k];

                }
                System.out.print("]");
                System.out.print(" ");
                System.out.print(":-"+currSum+" ");
                if (currSum > maxSum) {
                     maxSum=currSum ;
                }
            }
                System.out.println();

        }
        System.out.println("Maximum sum is "+maxSum);

    }


    public static void main(String[] args) {

        int arr[] = {1,-2,6,-1,3};

        sumofarray(arr);
    }
}
