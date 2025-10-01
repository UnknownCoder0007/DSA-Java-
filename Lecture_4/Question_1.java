/* Write a Java program to get a number from the user and print whether it is positive or negative. */

package Lecture_4;
import java.util.*;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        double n = sc.nextDouble();
        if(n == 0) {
            System.out.println("Neither +ve nor -ve");
        }
        else if(n > 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
