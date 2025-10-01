package Practice.Session_6;
import java.util.*;

public class EvenNumber{
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean ans = isEven(n);
        System.out.println(ans);
    }
}