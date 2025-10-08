package Lecture_4;
import java.util.*;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Samosa\n2. Burger\n3. Mango Shake\n");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1 :
                System.out.println("Samosa");
                break;
            case 2 :
                System.out.println("Burger");
                break;
            case 3 :
                System.out.println("Mango Shake");
                break;
            default :
                System.out.println("Wrong option");
        }
    }
}
