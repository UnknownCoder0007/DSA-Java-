package Practice.Session_5;
import java.util.*;

public class FloydsTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        int a = 1;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row >= col) {
                    System.out.print(a + " ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}
