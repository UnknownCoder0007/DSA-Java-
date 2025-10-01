package Lecture_8;
import java.util.*;

public class InvertedNumbersPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows + 1 - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// public class InvertedNumbersPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             int a = 1;
//             for (int j = 1; j <= rows; j++) {
//                 if ((i + j) <= (rows + 1)) {
//                     System.out.print(a + " ");
//                 }
//                 else {
//                     System.out.print("  ");
//                 }
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }
