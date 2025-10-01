package Practice.Session_4;
import java.util.*;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter minute: ");
        int minute = sc.nextInt();
        hour += 5;
        minute += 30;
        if(minute >= 60) {
            hour++;
            minute -= 60;
        }
        if(hour >= 24) {
            day++;
            hour -= 24;
        }
        if(day > 30){
            day -= 30;
        }
        System.out.println("Day : Hour : Minute = " + day + " : " + hour + " : " + minute);
    }
}
