package com.company;

import java.util.*;

public class Java_11_03_largest_number {

    public static int getlargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
// - infinity;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] > largest) {
                largest = nums[i];


            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        System.out.println("smallest value is " + smallest);
        return largest;


    }


    public static void main(String[] args) {

        //find the largest number present in the array

        int nums[] = {10, 2, 444, 6, 7, 74, 37};
        System.out.println(getlargest(nums));


    }
}
