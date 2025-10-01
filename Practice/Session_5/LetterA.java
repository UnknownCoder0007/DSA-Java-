package Practice.Session_5;

public class LetterA {
    public static void main(String args[]) {
        int n = 5;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col+row == n-1 || col-row == n-3 || row == n-1) {
                    System.out.print("* ");
                }
                else if(row == n && col == 1) {
                    System.out.print("* ");
                }
                else if(row == n && col == n) {
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
