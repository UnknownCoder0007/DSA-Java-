package JAVA.Practice.Session_6;
import java.util.*;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("The sum of digits = " + sum);
    }
}
