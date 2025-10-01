package Practice.Session_5;
import java.util.*;
public class XPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number of lines: ");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row-col == 0 || row+col == n+1) {
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

