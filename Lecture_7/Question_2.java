/* Write a method named isEven that accepts an int argument. The method 
should return true if the argument is even, or false otherwise. Also write a program to test 
your method. */

package Lecture_7;
import java.util.*;

public class Question_2 {
    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println( isEven(num) );
    }
}
