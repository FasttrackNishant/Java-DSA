package com.company;

public class Java_11_10_III_kadanes_algorithm {

    public static void kadanesalgo(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<0)
            {
                currSum = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {

            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
            // dono mein se jo bhi max hoga woh store hoga
        }

        System.out.println("max subarray sum is " + maxSum);

    }

    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        kadanesalgo(arr);

    }

}
