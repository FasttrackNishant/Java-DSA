package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Java_12_03_Insertion_sort {

    public static void insertionsort(int arr[], int n) {
        for (int i = 1; i < n ; i++) {

            int curr = arr[i];
            int prev = i - 1;

            //findingn out the correct position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //insertion

            arr[prev+1]= curr;

        }

    }


    public static void main(String[] args) {

        Integer arr[] = {5, 4, 3, 2, 1};
        //insertionsort(arr, 5);

//        Arrays.sort(arr );
//        Arrays.sort(arr,1,5 );
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }

}
