package Lecture_7;
import java.util.*;

public class CheckPrimeNumber {
    // public static boolean isPrime(int n) {
    //     boolean flag = true;
    //     if(n == 2) {
    //         return flag;
    //     }
    //     for(int i = 2; i < n; i++) {
    //         if(n % i == 0) {
    //             flag = false;
    //             break;
    //         }
    //     }
    //     return flag;
    // }

    public static boolean isPrime(int n) {
        if(n == 0) {
            return false;
        }
        if(n == 1) {
            return false;
        }
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println( isPrime(num) );
    }
}
