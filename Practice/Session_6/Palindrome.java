package JAVA.Practice.Session_6;
import java.util.*;

public class Palindrome {
    public static int reverseNum(int num) {
        int n = 0;
        int a = 0;
        while(num > 0) {
            n = (n * 10) + (num % 10);
            a++;
            num /= 10;
        }
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = reverseNum(n);
        if(num == n) {
            System.out.println("Yes, the number is palindrome.");
        }
        else {
            System.out.println("No, the number is not palindrome.");
        }
    }
}
