import java.util.*;

public class Java_09_05_checkprime {

    public static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                return false;
            }
        return true;

    }

    public static void primeinrange(int n) {


        for (int i = 2; i <= n; i++) {

            if (check(i)) {

                System.out.print(i);

            }


        }
        System.out.println();
    }


    public static void main(String[] args) {

        System.out.println("check prim number");
        int n = 43;
        boolean result = check(n);
        System.out.println(result);
        primeinrange(20);


    }


}


