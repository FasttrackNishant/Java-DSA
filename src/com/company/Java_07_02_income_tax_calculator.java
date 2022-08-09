package com.company;

import java.util.*;

public class Java_07_02_income_tax_calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        float tax;

        if (salary < 500000) {
            tax = 0;
            System.out.println("Your Tax is " + tax);
            System.out.println("Total Salary = " + (salary - tax));
        } else if (salary >= 500000 && salary < 1000000)
        {
            tax = (float) (salary * (0.2));
            System.out.println("Your Tax is " + tax);
            System.out.println("Total Salary = " + (salary - tax));

        } else if (salary > 100000)
        {
            tax = (float) (salary * (0.3));
            System.out.println("Your Tax is " +tax);
            System.out.println("Total Salary = " + (salary - tax));
        }


    }
}
