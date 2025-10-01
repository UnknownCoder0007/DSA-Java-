package Doubts.Session_1;
import java.util.*;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.print("Enter length of the word: ");
        int len = sc.nextInt();
        String rev = "";
        for(int i = (len-1); i >= 0; i--) {
            rev += word.charAt(i);
        }
        System.out.println("Reversed String = " + rev);
    }
}
