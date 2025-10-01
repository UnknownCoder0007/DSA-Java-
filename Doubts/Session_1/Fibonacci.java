package Doubts.Session_1;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of term: ");
        int n = sc.nextInt();
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
