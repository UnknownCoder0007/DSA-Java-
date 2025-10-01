package Lecture_6;
import java.util.*;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int line = 1; line <= n; line++) {
            for(int j = 1; j <= line; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
