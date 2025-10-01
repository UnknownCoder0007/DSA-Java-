package Lecture_4;
import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        double income = sc.nextDouble();
        double tax;
        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            tax = (0.2) * income;
        }
        else {
            tax = (0.3) * income;
        }
        System.out.println("Total tax = " + tax);
    }
}
