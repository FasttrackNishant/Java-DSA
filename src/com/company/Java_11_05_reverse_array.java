package com.company;

public class Java_11_05_reverse_array {

    public static void reverse(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            // swap

            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }

    }

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 14};
        print(arr);
        reverse(arr);
        print(arr);


    }

}


