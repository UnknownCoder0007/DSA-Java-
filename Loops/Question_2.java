package Lecture_5;
import java.util.*;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int choice;
        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n % 2 == 0) {
                sumEven += n;
            }
            else {
                sumOdd += n;
            }
            System.out.print("Do you want to continue? (0 for No / 1 for Yes) ");
            choice = sc.nextInt();
        } while(choice == 1);
        System.out.println("Sum of Even numbers = " + sumEven);
        System.out.println("Sum of Odd numbers = " + sumOdd);
    }
}
