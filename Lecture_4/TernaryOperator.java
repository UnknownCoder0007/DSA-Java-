package Lecture_4;
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String type = ((n%2 == 0))? "Even Number" : "Odd Number";
        System.out.println(type);
    }
}
