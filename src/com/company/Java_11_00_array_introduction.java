package com.company;

import java.util.*;

public class Java_11_00_array_introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to array lecture ");

        //creation
        int marks[] = new int[50];

        // marks[0] = sc.nextInt();
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        System.out.println("Marks are :- " + marks[0] + " " + marks[1] + " " + marks[2]);

//        marks[2] = 40;
//        System.out.println(marks[2]);
//
//        marks[2] = marks[2] + 3;
//        System.out.println(marks[2]);


        int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("percentage is " + percentage);


        //array lenght

        int arr[] = {3, 5, 6, 4, 85, 7, 94};
        System.out.println("lenght of array" + arr.length);

    }


}
