package com.company;

public class Java_07_00_conditionals {

    public static void main(String[] args) {


        System.out.println("Conditionals Statement");

        int age = 23;

        if (age>=20)
        {
            System.out.println("can drive");
        }
        else
            System.out.println("can't drive ");

    //ternary operators

        int num = 3;

       String type =  ((num %2 )==0)?"even" : "odd";
        System.out.println(type);


        int marks = 45;
        String result = (marks >=33 ? "Passed ": "Failed");
        System.out.println(result);


    }
}
