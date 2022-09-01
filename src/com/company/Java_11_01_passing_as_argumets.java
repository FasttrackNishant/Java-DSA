package com.company;

public class Java_11_01_passing_as_argumets {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {


            marks[i] = marks[i]+10;
        }
    }

    public static void main(String[] args) {

        int marks[] = {1, 2, 3};
        update(marks);


        //print marks
        for (int i = 0; i < marks.length; i++) {

            System.out.println( marks[i]+" ");
        }
        System.out.println();


    }

}
