package com.company;

public class Java_11_06_array_pairs {

    public  static  void pairs(int arr[])
    { int count = 0;
        for (int i = 0; i <= arr.length; i++) {


            for (int j = i+1; j < arr.length; j++) {

                System.out.print("("+arr[i]+","+arr[j]+")");
                System.out.print(" ");
count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are "+count);
    }

    public static void main(String[] args) {

        int [] arr = {2,4,6,8,10};
        pairs(arr);

    }

}
