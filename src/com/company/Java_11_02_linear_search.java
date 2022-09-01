package com.company;

public class Java_11_02_linear_search {

    public static int linearsearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {2, 4, 6, 8, 10, 14, 18};
        String menu[] = {"panner " , "dosa" ,"samosa" , "thali"};
        int key = 10;
        int res = linearsearch(nums,key);
        System.out.println(res);

        // check it for menu

        // tim


    }
}
