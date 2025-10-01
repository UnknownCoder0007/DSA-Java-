package Arrays;
import java.util.*;

public class pairs {
    public static void pairs (int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
                System.out.println();
                System.out.println("i + num[1]");
                int num = 12;
                
            }
        }
    }
    
    public static void main (String args[]) {
        int num[] = {2, 4, 6, 8, 10};
        pairs (num);
        
    }
}
