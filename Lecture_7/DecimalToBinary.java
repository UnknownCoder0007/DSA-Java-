package Lecture_7;
import java.util.*;

public class DecimalToBinary {
    public static int binary(int n) {
        int bi = 0;
        int power = 0;
        while(n > 0) {
            bi += (n % 2) * Math.pow(10, power);
            power++;
            n /= 2;
        }
        return bi;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Binary of " + dec + " = " + binary(dec));
    }
}
