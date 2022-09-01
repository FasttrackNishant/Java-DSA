package com.company;

public class Java_05_00_Variable_datatypes {

    public static void main(String[] args) {

        //java mein type conversion possible hain sirf type compoativle mein and from small to large

        int a = 45;
        long b = a;

//       this will give an error
//       long a= 34;
//       int b= a;
        //but agar jabardasti karni hain to ho sakta hain using typecasting

        float fl = 34.98f;
        int bb = (int) fl; // this is called as a typecasting

        //character to number is also possible

        char ch = 'a';
        int asc = ch;

        System.out.println(b);
        System.out.println(asc);

        //Type promotion

        char ac = 'a';
        char bc = 'b';
        System.out.println(bc- ac);


        //ek tricky question

        byte bt = 5;
//        bt = bt*10;//this will not work

        bt = (byte) (bt*10); //done
        System.out.println(bt);

    }
}
