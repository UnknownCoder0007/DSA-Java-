package Lecture_7;
import java.util.*;

public class BinaryToDecimal {
    public static int decimal(int n) {
        int dec = 0;
        int power = 0;
        while(n > 0) {
            dec += ((n % 10) * Math.pow(2, power));
            power++;
            n /= 10;
        }
        return dec;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int bi = sc.nextInt();
        System.out.println("Decimal of " + bi + " = " + decimal(bi));
    }
}
