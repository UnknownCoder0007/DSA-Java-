package Lecture_8;
import java.util.*;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// public class InvertedRotatedHalfPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         for(int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 if ((i+j) >= (rows + 1)) {
//                     System.out.print("* ");
//                 }
//                 else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }