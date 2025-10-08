package Lecture_2;
import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        float radius = sc.nextFloat();
        float area = (22.0f/7.0f) * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
