// Write a Java method to compute the sum of the digits in an integer.

package Lecture_7;
import java.util.*;

public class Question_5 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(num));
    }
}