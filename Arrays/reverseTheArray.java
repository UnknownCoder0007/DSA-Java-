package Arrays;
import java.util.*;

public class reverseTheArray {
    public static void reverse (int num[]) {
        int first = 0;
        int last = num.length - 1;
        int temp = 0;
        while (first < last) {
            temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
        }
    }
    
    public static void main (String args[]) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse (num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
