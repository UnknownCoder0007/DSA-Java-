package Lecture_6;
import java.util.*;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++) {
            for(int num = 1; num <= n; num++) {
                if(line+num <= n+1) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}

// public class HalfPyramidPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of lines: ");
//         int n = sc.nextInt();
//         for(int line = 1; line <= n; line++) {
//             for(int num = 1; num <= line; num++) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }
//     }
// }
