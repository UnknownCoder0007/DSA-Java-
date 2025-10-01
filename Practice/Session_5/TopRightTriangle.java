package Practice.Session_5;
import java.util.*;
public class TopRightTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col - row >= 0) {
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
