package Lecture_7;
import java.util.*;

public class BinomialCoefficient {
    public static int factorial(int n) {
        int fact = 1;
        if(n == 0) {
            return fact;
        }
        for(int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static double binoCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        double biCoeff = n_fact / ( r_fact * nr_fact );
        return biCoeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient = " + binoCoeff(n,r));
    }
}
