/* Write a Java program that takes a year from the user and print whether that
   year is a leap year or not.
*/

package Lecture_4;
import java.util.*;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        if(year % 4 != 0) {
            System.out.println("It is not a leap year");
        }
        else if(year % 100 == 0 && year % 400 != 0) {
            System.out.println("It is not a leap year");
        }
        else {
            System.out.println("It is a leap year");
        }
    }
}


//public class Question_5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a year : ");
//        int year = sc.nextInt();
//        if(year % 4 == 0) {
//            if(year % 100 == 0) {
//                if(year % 400 == 0) {
//                    System.out.println("It is a leap year.");
//                }
//                else {
//                    System.out.println("It is not a leap year");
//                }
//            }
//            else {
//                System.out.println("It is a leap year");
//            }
//        }
//        else {
//            System.out.println("It is not a leap year");
//        }
//    }
//}
