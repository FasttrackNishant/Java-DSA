package com.company;
import  java.util.*;


public class Java_05_03_area_of_circle {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of Radius :- ");
        float radius = sc.nextFloat();
        float pie = 3.14f;
        float area = pie * radius*radius;

        System.out.println("area of the circle is "+area);
    }

}
