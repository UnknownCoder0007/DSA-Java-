package Lecture_8;
import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        for(int i = 1; i <= breadth; i++) {
            for(int j = 1; j <= length; j++) {
                if(i == 1 || i == breadth || j == 1 || j == length) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}