package Lecture_7;
import java.util.*;

public class SumTwoNumbers {
    public static int calculateSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum = " + sum);
    }
}
