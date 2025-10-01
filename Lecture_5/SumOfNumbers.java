package Lecture_5;
import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till where you want to add: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
