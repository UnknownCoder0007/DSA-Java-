package Lecture_2;
import java.util.*;

public class ProductOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("Product of a&b = " + product);
    }
}
