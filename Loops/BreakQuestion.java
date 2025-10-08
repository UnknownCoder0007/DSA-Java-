// Keep entering numbers till user enters a multiple of 10

package Lecture_5;
import java.util.*;

public class BreakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                System.out.println("You're out of the loop");
                break;
            }
            System.out.println(n);
        }
    }
}
