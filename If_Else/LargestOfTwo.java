package Lecture_4;
import java.util.*;

public class LargestOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        if(a >= b) {
            System.out.println("a = " + a + " is largest");
        }
        else {
            System.out.println("b = " + b + " is largest");
        }
    }
}
