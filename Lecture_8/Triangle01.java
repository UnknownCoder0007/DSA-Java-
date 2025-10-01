package Lecture_8;
import java.util.*;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}


// public class Triangle01 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         int a = 1;
//         for (int i = 1; i <= rows; i++) {
//             if (i % 2 != 0) a = 1;
//             else a = 0;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(a + " ");
//                 if (a == 1) a = 0;
//                 else a = 1;
//             }
//             System.out.println();
//         }
//     }
// }