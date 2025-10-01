package Lecture_5;
import java.util.*;

// public class CheckPrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i = 2; i <= Math.sqrt(n); i++) {
//             if(n % i == 0) {
//                 isPrime = false;
//             }
//         }
//         String ans = (isPrime)? "Prime Number" : "Not a Prime Number";
//         System.out.println(ans);
//     }
// }


public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        String ans = (isPrime)? "Prime Number" : "Not a Prime Number";
        System.out.println(ans);
    }
}
