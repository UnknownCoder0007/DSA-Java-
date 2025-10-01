package Arrays;
import java.util.*;

public class largestInArray {
    public static int largest (int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static void main (String args[]) {
        int numbers[] = {1, 2, 3, 6, 7, 4, 5};
        int largest = largest (numbers);
        System.out.println ("Largest number in the array = " + largest);
    }
}
