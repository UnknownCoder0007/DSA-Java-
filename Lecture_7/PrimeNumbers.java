package Lecture_7;
import java.util.*;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i = 2; i <= (Math.sqrt(n)); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i = 2; i <= n; i++) {
            boolean flag = isPrime(i);
            if(flag == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till where you want to print: ");
        int num = sc.nextInt();
        primeInRange(num);
    }
}
