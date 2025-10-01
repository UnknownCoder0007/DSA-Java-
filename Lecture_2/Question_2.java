// In a program, input the side of a square. You have to output the area of the square.

package Lecture_2;
import java.util.*;

public class Question_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square : ");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of Square = " + area);
    }
}
