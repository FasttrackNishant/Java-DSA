package com.company;

public class Java_08_04_do_while {
    public static void main(String[] args) {


        int cnt = 1;

        do {
            if (cnt == 8) {
                continue;
            }
            System.out.println("hello world" + cnt);
            cnt++;


        } while (cnt < 12);
    }

}
