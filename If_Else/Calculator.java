package Lecture_4;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();
        System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modulo\n");
        System.out.print("Enter choice : ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1 :
                System.out.println(a + b);
                break;
            case 2 :
                System.out.println(a - b);
                break;
            case 3 :
                System.out.println(a * b);
                break;
            case 4 :
                System.out.println(a / b);
                break;
            case 5 :
                System.out.println(a % b);
                break;
            default :
                System.out.println("Invalid Choice");
        }
    }
}
