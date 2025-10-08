// Write a Java program to check if a number is a palindrome in Java?

package Lecture_7;
import java.util.*;

public class Question_3 {
    public static void palindrome(int n) {
        int original = n;
        int rev = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        if(rev == original) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        palindrome(num);
    }
}
