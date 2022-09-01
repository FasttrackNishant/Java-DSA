package com.company;
import  java.util.*;
public class Java_08_06_user_multiple {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        while(true)
        {
            int num = sc.nextInt();
            if(num %10 ==0)
            {
                //break;// for one multiple of 10
                continue;//to print except  multiple of 10
            }
            System.out.println(num);
        }





    }
}
