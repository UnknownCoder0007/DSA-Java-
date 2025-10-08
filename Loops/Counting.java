package Lecture_5;
import java.util.*;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till where you want to print: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}
