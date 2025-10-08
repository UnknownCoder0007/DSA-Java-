package Lecture_7;
import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        if(n == 0) {
            return fact;
        }
        for(int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = factorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
