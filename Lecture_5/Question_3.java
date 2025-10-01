// Write a program to find the factorial of any number entered by the user.

package Lecture_5;
import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = n; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
