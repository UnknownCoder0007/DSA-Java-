package Lecture_4;
import java.util.*;

public class PassOrFail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        float marks = sc.nextFloat();
        String result = (marks >= 33)? "Pass" : "Fail";
        System.out.println(result);
    }
}

//public class PassOrFail {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter marks : ");
//        float marks = sc.nextFloat();
//        if(marks >= 33) {
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }
//    }
//}
