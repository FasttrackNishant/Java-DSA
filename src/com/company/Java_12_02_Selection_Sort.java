package com.company;

public class Java_12_02_Selection_Sort {

    public static void selectionsort(int arr[]) {

        int n = arr.length;
        for (int turns = 0; turns < n - 1; turns++) {

            int mini = turns;

            int i = turns + 1;
            if (arr[mini] > arr[i]) {

                /*
                agar if ke andar ki condion reverse kardi toh decreasing ordinger mein array aa jayega
                int temp = arr[mini];
                arr[mini]= arr[j];
                arr[j]= temp;

                ab agar ye kiya toh bubble sort   ban jayega so
                 */

            }
            //yaha swap karegne

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }


    }


    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1, 10};
        print(arr);
        selectionsort(arr);
        print(arr);

    }

}
