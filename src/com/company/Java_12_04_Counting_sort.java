package com.company;

public class Java_12_04_Counting_sort {

    public static void countingsort(int arr[]) {

        //range nikalni hain like largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }
        //ab count array banayenge
        /*
         * yaha +1 isliye kyki hum sare +ve numberes le rahe hain like
         * hum 0 se start karte hain but last tak equal hone pe jana hain */
        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {

            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }

        }

    }


    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 3, 2, 4,2, 7};
        countingsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
