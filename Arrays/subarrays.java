package Arrays;
import java.util.*;

public class subarrays {
    public static void subarrays (int num[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                System.out.print("] ");
                System.out.println("Sum = " + sum);
                if (max < sum) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
            }
        }
        System.out.println("Max sum = " + max);
        System.out.println("Min sum = " + min);
    
    }

    public static void main (String args[]) { 
        int num[] = {2, 4, 6, 8, 10};
        subarrays (num);
    }
}
