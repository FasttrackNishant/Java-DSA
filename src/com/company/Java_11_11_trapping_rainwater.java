package com.company;

public class Java_11_11_trapping_rainwater {

    public static int trapped_rainwater(int height[]) {
        //calcualte left max boundry
        int n = height.length;
        int width = 1;
        int trappedwater = 0;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {

            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        //calculate right max boundry

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }

        //waterlevel nikalo waterlevel = min(leftmax , rightmax)
        for (int i = 0; i < n; i++) {

            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            trappedwater += (waterlevel - height[i]) * width;
        }


        //trapped water
        return trappedwater;

    }


    public static void main(String[] args) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("The value of Trapped Rainwater is ");
        System.out.println(trapped_rainwater(height));

    }
}
