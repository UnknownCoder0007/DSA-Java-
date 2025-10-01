package Practice.Session_4;
import java.util.*;

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a week number: ");
        int n = sc.nextInt();
        switch(n) {
            case 1, 2, 3, 4, 5: {System.out.println("Weekday"); break;}
            case 6, 7: {System.out.println("Weekend"); break;}
            default: {System.out.println("Invalid Day");}
        }
    }
}

// public class WeekdayWeekend {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a week number: ");
//         int n = sc.nextInt();
//         switch(n) {
//             case 1: {}
//             case 2: {}
//             case 3: {}
//             case 4: {}
//             case 5: {System.out.println("Weekday"); break;}
//             case 6: {}
//             case 7: {System.out.println("Weekend"); break;}
//             default: {System.out.println("Invalid Day");}
//         }
//     }
// }


// public class WeekdayWeekend {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a week number: ");
//         int n = sc.nextInt();
//         switch(n) {
//             case 1: {
//                 System.out.println("Weekday");
//                 break;
//             }
//             case 2: {
//                 System.out.println("Weekday");
//                 break;
//             }
//             case 3: {
//                 System.out.println("Weekday");
//                 break;
//             }
//             case 4: {
//                 System.out.println("Weekday");
//                 break;
//             }
//             case 5: {
//                 System.out.println("Weekday");
//                 break;
//             }
//             case 6: {
//                 System.out.println("Weekend");
//                 break;
//             }
//             case 7: {
//                 System.out.println("Weekend");
//                 break;
//             }
//             default: {
//                 System.out.println("Invalid Day");
//             }
//         }
//     }
// }
