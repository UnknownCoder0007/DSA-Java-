// Write a Java method to compute the average of three numbers.

package Lecture_7;
import java.util.*;

public class Question_1 {
    public static double average(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        System.out.println("Average = " + average(a, b, c));
    }
}
