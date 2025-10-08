// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

package Lecture_2;
import java.util.*;

public class Question_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        float avg = (a + b + c) / 3.0f;
        System.out.println("The average of a,b,c = " + avg);
    }
}
