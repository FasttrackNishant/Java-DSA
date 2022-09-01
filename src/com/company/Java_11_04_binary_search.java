package  com.company;
import java.util.*;


public class Java_11_04_binary_search {

    public static int binsearch(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            System.out.println("mid is" + nums[mid]);
            if (nums[mid] == key) {
                return mid;
            }

            if (nums[mid] < key) // right wali condition
            {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int nums[] = {2, 5, 22, 19, 50, 90};
        int key = 90;
        System.out.println(nums.length);
        System.out.println("key is present at " + binsearch(nums, key));
    }

}
