package com.company;

import java.util.Scanner;

public class Java_16_01_Strings_intro {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++)
            System.out.print(str.charAt(i));

        System.out.println();

    }

    public static void main(String[] args) {

        System.out.println("Welcome back");
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "Elon Musk";
        String str1 = new String("pqr");

        //take input

//        Scanner sc = new Scanner(System.in);
//        String name;
////      name =sc.next();
//        name = sc.nextLine();
//        System.out.println(name);


        //Concatination
        String fName = "Ramu";
        String lName = "Kaka";
        System.out.println(fName + lName);

        //indexing

        printString(str);

    }

}
